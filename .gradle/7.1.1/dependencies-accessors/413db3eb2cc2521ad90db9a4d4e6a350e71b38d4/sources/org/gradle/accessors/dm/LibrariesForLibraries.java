package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libraries` extension.
*/
@NonNullApi
public class LibrariesForLibraries extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);

    @Inject
    public LibrariesForLibraries(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxFragmentLibraryAccessors laccForAndroidxFragmentLibraryAccessors = new AndroidxFragmentLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxPreferenceLibraryAccessors laccForAndroidxPreferenceLibraryAccessors = new AndroidxPreferenceLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() { return create("androidx-annotation"); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("androidx-appcompat"); }

            /**
             * Creates a dependency provider for browser (androidx.browser:browser)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBrowser() { return create("androidx-browser"); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() { return create("androidx-constraintlayout"); }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() { return create("androidx-recyclerview"); }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() { return laccForAndroidxActivityLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() { return laccForAndroidxCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.fragment
         */
        public AndroidxFragmentLibraryAccessors getFragment() { return laccForAndroidxFragmentLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() { return laccForAndroidxNavigationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.preference
         */
        public AndroidxPreferenceLibraryAccessors getPreference() { return laccForAndroidxPreferenceLibraryAccessors; }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.activity:activity-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-activity-ktx"); }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-core-ktx"); }

    }

    public static class AndroidxFragmentLibraryAccessors extends SubDependencyFactory {

        public AndroidxFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.fragment:fragment-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-fragment-ktx"); }

            /**
             * Creates a dependency provider for testing (androidx.fragment:fragment-testing)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("androidx-fragment-testing"); }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleLivedataLibraryAccessors laccForAndroidxLifecycleLivedataLibraryAccessors = new AndroidxLifecycleLivedataLibraryAccessors(owner);
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.livedata
         */
        public AndroidxLifecycleLivedataLibraryAccessors getLivedata() { return laccForAndroidxLifecycleLivedataLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() { return laccForAndroidxLifecycleViewmodelLibraryAccessors; }

    }

    public static class AndroidxLifecycleLivedataLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLivedataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-lifecycle-livedata-ktx"); }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-lifecycle-viewmodel-ktx"); }

            /**
             * Creates a dependency provider for savedstate (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("androidx-lifecycle-viewmodel-savedstate"); }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {
        private final AndroidxNavigationFragmentLibraryAccessors laccForAndroidxNavigationFragmentLibraryAccessors = new AndroidxNavigationFragmentLibraryAccessors(owner);
        private final AndroidxNavigationUiLibraryAccessors laccForAndroidxNavigationUiLibraryAccessors = new AndroidxNavigationUiLibraryAccessors(owner);

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.navigation.fragment
         */
        public AndroidxNavigationFragmentLibraryAccessors getFragment() { return laccForAndroidxNavigationFragmentLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.navigation.ui
         */
        public AndroidxNavigationUiLibraryAccessors getUi() { return laccForAndroidxNavigationUiLibraryAccessors; }

    }

    public static class AndroidxNavigationFragmentLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-fragment-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-navigation-fragment-ktx"); }

    }

    public static class AndroidxNavigationUiLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-ui-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-navigation-ui-ktx"); }

    }

    public static class AndroidxPreferenceLibraryAccessors extends SubDependencyFactory {

        public AndroidxPreferenceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.preference:preference-ktx)
             * This dependency was declared in catalog androidx.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx-preference-ktx"); }

    }

    public static class VersionAccessors extends VersionFactory {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

    }

    public static class AndroidxVersionAccessors extends VersionFactory {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx-fragment (1.3.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog androidx.versions.toml
             */
            public Provider<String> getFragment() { return getVersion("androidx-fragment"); }

            /**
             * Returns the version associated to this alias: androidx-lifecycle (2.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog androidx.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("androidx-lifecycle"); }

            /**
             * Returns the version associated to this alias: androidx-navigation (2.3.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog androidx.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("androidx-navigation"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
