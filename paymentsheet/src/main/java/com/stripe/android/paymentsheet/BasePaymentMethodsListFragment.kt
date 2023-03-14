package com.stripe.android.paymentsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.stripe.android.paymentsheet.analytics.EventReporter
import com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetPaymentMethodsListBinding
import com.stripe.android.paymentsheet.model.FragmentConfig
import com.stripe.android.paymentsheet.model.PaymentSelection
import com.stripe.android.paymentsheet.model.SupportedPaymentMethod
import com.stripe.android.paymentsheet.ui.BaseSheetActivity
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel

internal abstract class BasePaymentMethodsListFragment(
    private val canClickSelectedItem: Boolean,
    private val eventReporter: EventReporter
) : Fragment(
    R.layout.fragment_paymentsheet_payment_methods_list
) {
    private lateinit var mConfirmationDialog: Dialog
    abstract val sheetViewModel: BaseSheetViewModel<*>

    protected lateinit var config: FragmentConfig
    private lateinit var adapter: PaymentOptionsAdapter
    private var editMenuItem: MenuItem? = null
    private lateinit var text: String

    @VisibleForTesting
    internal var isEditing = false
        set(value) {
            field = value
            adapter.setEditing(value)
            text = if (value) {
                resources.getString(R.string.done)
            } else {
                resources.getString(R.string.edit)
            }
            val spanString = SpannableString(text)
            spanString.setSpan(
                ForegroundColorSpan(Color.WHITE),
                0,
                spanString.length,
                0
            ) // fix the color to white
            editMenuItem?.title = spanString
            sheetViewModel.setEditing(value)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val nullableConfig = arguments?.getParcelable<FragmentConfig>(
            BaseSheetActivity.EXTRA_FRAGMENT_CONFIG
        )
        if (nullableConfig == null) {
            sheetViewModel.onFatal(
                IllegalArgumentException("Failed to start existing payment options fragment.")
            )
            return
        }
        this.config = nullableConfig

        setHasOptionsMenu(!sheetViewModel.paymentMethods.value.isNullOrEmpty())
        eventReporter.onShowExistingPaymentOptions()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView(FragmentPaymentsheetPaymentMethodsListBinding.bind(view))
        isEditing = savedInstanceState?.getBoolean(IS_EDITING) ?: false
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.paymentsheet_payment_methods_list, menu)
        // Menu is created after view state is restored, so we need to update the title here
        editMenuItem = menu.findItem(R.id.edit).apply {
            text = if (isEditing) {
                resources.getString(R.string.done)
            } else {
                resources.getString(R.string.edit)
            }
            val spanString = SpannableString(text)
            spanString.setSpan(
                ForegroundColorSpan(Color.WHITE),
                0,
                spanString.length,
                0
            ) // fix the color to white
            title = spanString
        }
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.edit -> {
                isEditing = !isEditing
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean(IS_EDITING, isEditing)
        super.onSaveInstanceState(outState)
    }

    private fun setupRecyclerView(viewBinding: FragmentPaymentsheetPaymentMethodsListBinding) {
        val layoutManager = object : LinearLayoutManager(
            activity,
            HORIZONTAL,
            false
        ) {
            var canScroll = true

            override fun canScrollHorizontally(): Boolean {
                return canScroll && super.canScrollHorizontally()
            }
        }.also {
            viewBinding.recycler.layoutManager = it
        }

        adapter = PaymentOptionsAdapter(
            canClickSelectedItem,
            paymentOptionSelectedListener = ::onPaymentOptionSelected,
            paymentMethodDeleteListener = ::deletePaymentMethod,
            addCardClickListener = {
                transitionToAddPaymentMethod()
            }
        ).also {
            viewBinding.recycler.adapter = it
        }

        adapter.setItems(
            config,
            sheetViewModel.paymentMethods.value.orEmpty(),
            sheetViewModel.selection.value
        )

        sheetViewModel.processing.observe(viewLifecycleOwner) { isProcessing ->
            adapter.isEnabled = !isProcessing
            layoutManager.canScroll = !isProcessing
        }
    }

    abstract fun transitionToAddPaymentMethod()

    open fun onPaymentOptionSelected(
        paymentSelection: PaymentSelection,
        isClick: Boolean
    ) {
        sheetViewModel.updateSelection(paymentSelection)
    }

    private fun deletePaymentMethod(item: PaymentOptionsAdapter.Item.SavedPaymentMethod) {
        showConfirmationDialog(item)
       // showOldConfirmationDialog(item)
    }

    private fun showOldConfirmationDialog(item: PaymentOptionsAdapter.Item.SavedPaymentMethod){
        AlertDialog.Builder(requireActivity())
        .setTitle(
            resources.getString(
                R.string.stripe_paymentsheet_remove_pm,
                SupportedPaymentMethod.fromCode(item.paymentMethod.type?.code)
                    ?.run {
                        resources.getString(
                            displayNameResource
                        )
                    }
            )
        )
        .setMessage(item.getDescription(resources))
        .setCancelable(true)
        .setNegativeButton(R.string.cancel) { dialog, _ ->
            dialog.dismiss()
        }
        .setPositiveButton(R.string.remove) { _, _ ->
            adapter.removeItem(item)
            sheetViewModel.removePaymentMethod(item.paymentMethod)
        }
        .create()
        .show()
    }


    private fun showConfirmationDialog(item: PaymentOptionsAdapter.Item.SavedPaymentMethod) {
        mConfirmationDialog = Dialog(requireActivity(), R.style.AlertDialogStyle)
        mConfirmationDialog.setContentView(R.layout.layout_warning_remove_card_dialog)
        mConfirmationDialog.setCanceledOnTouchOutside(false)
        mConfirmationDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val title: TextView =
            mConfirmationDialog.findViewById(R.id.tv_warning_logout_header)
        val btnConfirmNo: Button =
            mConfirmationDialog.findViewById(R.id.btn_warning_confirm_no)
        val btnConfirmYes: Button =
            mConfirmationDialog.findViewById(R.id.btn_warning_confirm_yes)
        /* val text: TextView =
             mConfirmationDialog.findViewById<TextView>(R.id.tv_warning_uninstall_content)
         text.setText(appInfo.getName())*/

        title.text  = resources.getString(
            R.string.app_store_delete_card,
            item.getStripeAllgoDescription(resources)
        )
        btnConfirmYes.setOnClickListener {
            adapter.removeItem(item)
            sheetViewModel.removePaymentMethod(item.paymentMethod)
            mConfirmationDialog.dismiss()
        }
        btnConfirmNo.setOnClickListener {
            mConfirmationDialog.dismiss()
        }
        mConfirmationDialog.show()
    }

    private companion object {
        private const val IS_EDITING = "is_editing"
    }


}
