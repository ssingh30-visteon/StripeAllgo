package com.stripe.android.networking;

import java.lang.System;

/**
 * An implementation of [StripeRepository] that makes network requests to the Stripe API.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00d7\u00012\u00020\u0001:\u0004\u00d7\u0001\u00d8\u0001BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011B\u00a3\u0001\b\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u001fJK\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\b.\u0010/JA\u00100\u001a\u0004\u0018\u0001012\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u00102\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J$\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006052\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J-\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\b;\u0010<J-\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\b@\u0010<J%\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bC\u0010DJ3\u0010E\u001a\u0004\u0018\u0001082\u0006\u0010F\u001a\u00020G2\u0006\u0010:\u001a\u00020-2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u0010KJ3\u0010L\u001a\u0004\u0018\u00010>2\u0006\u0010M\u001a\u00020N2\u0006\u0010:\u001a\u00020-2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bO\u0010PJ*\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020S0R2\u0006\u0010T\u001a\u00020\u00062\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0002J#\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u0004\u0018\u0001012\u0006\u0010\\\u001a\u00020]2\u0006\u0010:\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010^J\u001d\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u0004\u0018\u00010\'2\u0006\u0010d\u001a\u00020e2\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bf\u0010gJ%\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010j\u001a\u00020k2\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bl\u0010mJC\u0010n\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0004\bo\u00103J9\u0010p\u001a\u0004\u0018\u0001012\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u00102\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010qJ\b\u0010r\u001a\u00020sH\u0002JA\u0010t\u001a\u0004\u0018\u0001Hu\"\b\b\u0000\u0010u*\u00020v2\u0006\u0010w\u001a\u00020x2\f\u0010y\u001a\b\u0012\u0004\u0012\u0002Hu0z2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0017\u0010~\u001a\u00020|2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0001\u00a2\u0006\u0003\b\u0081\u0001J\u0012\u0010~\u001a\u00020|2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\t\u0010\u0084\u0001\u001a\u00020|H\u0002J+\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0017\u0010\u008b\u0001\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0001\u00a2\u0006\u0003\b\u008c\u0001J\u001e\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u008f\u0001\u0010bJA\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u0002010I2\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020-H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0093\u0001J\u0019\u0010\u0094\u0001\u001a\u00020|2\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0096\u0001H\u0002J3\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0096\u00012\u0006\u0010w\u001a\u00020x2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u0005H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J?\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0096\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\u0016\u0010{\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010\u009e\u0001\u0012\u0004\u0012\u00020|0\u009d\u0001H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u009f\u0001\u0010\u00a0\u0001J?\u0010\u00a1\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020S0R2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020S0R2\b\u0010\\\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010eH\u0002J\'\u0010\u00a2\u0001\u001a\u0004\u0018\u0001082\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00a3\u0001\u0010DJ\u0012\u0010\u00a4\u0001\u001a\u00020|2\u0007\u0010\u00a5\u0001\u001a\u00020sH\u0002J7\u0010\u00a6\u0001\u001a\u0005\u0018\u00010\u00a7\u00012\u0006\u0010(\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00a8\u0001\u0010\u00a9\u0001J;\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u00ab\u0001\u001a\u00020\u00062\u0007\u0010\u00ac\u0001\u001a\u00020\u00062\u0007\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00ae\u0001\u0010\u00af\u0001J\'\u0010\u00b0\u0001\u001a\u00030\u00b1\u00012\u0007\u0010\u00b2\u0001\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00b3\u0001\u0010DJ3\u0010\u00b4\u0001\u001a\u0004\u0018\u0001082\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b5\u0001J/\u0010\u00b6\u0001\u001a\u0004\u0018\u0001082\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\b\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b9\u0001J3\u0010\u00ba\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b5\u0001J/\u0010\u00bb\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\b\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b9\u0001J/\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00bd\u0001\u0010<J5\u0010\u00be\u0001\u001a\u00030\u00bf\u00012\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00060IH\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00c0\u0001\u0010\u00b5\u0001JW\u0010\u00c1\u0001\u001a\u0005\u0018\u0001H\u00c2\u0001\"\n\b\u0000\u0010\u00c2\u0001*\u00030\u00bf\u00012\u0006\u0010T\u001a\u00020\u00062\u0006\u0010:\u001a\u00020-2\b\u0010\u00b7\u0001\u001a\u00030\u00b8\u00012\u000f\u0010\u00c3\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00c2\u00010\u00c4\u00012\b\u0010\u00c5\u0001\u001a\u00030\u0083\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c6\u0001JI\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00a7\u00012\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\u00c8\u0001\u001a\u00030\u00c9\u00012\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00ca\u0001\u0010\u00cb\u0001JN\u0010\u00cc\u0001\u001a\u0005\u0018\u00010\u00a7\u00012\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00cd\u0001\u0010/J*\u0010\u00ce\u0001\u001a\u0004\u0018\u00010B2\b\u0010\u00cf\u0001\u001a\u00030\u00d0\u00012\u0006\u0010,\u001a\u00020-H\u0091@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00d1\u0001\u0010\u00d2\u0001JB\u0010\u00d3\u0001\u001a\u00020|2\u0007\u0010\u00ab\u0001\u001a\u00020\u00062\u0007\u0010\u00d4\u0001\u001a\u00020\u00062\u0007\u0010\u00ac\u0001\u001a\u00020\u00062\u0007\u0010\u00ad\u0001\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0090@\u00f8\u0001\u0000\u00a2\u0006\u0006\b\u00d5\u0001\u0010\u00d6\u0001R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00d9\u0001"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository;", "Lcom/stripe/android/networking/StripeRepository;", "appContext", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsageTokens", "", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "logger", "Lcom/stripe/android/Logger;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/Logger;)V", "context", "appInfo", "Lcom/stripe/android/AppInfo;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "fraudDetectionDataRepository", "Lcom/stripe/android/FraudDetectionDataRepository;", "fraudDetectionDataParamsUtils", "Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "betas", "Lcom/stripe/android/StripeApiBeta;", "apiVersion", "sdkVersion", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/AppInfo;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/FraudDetectionDataRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "apiRequestFactory", "Lcom/stripe/android/networking/ApiRequest$Factory;", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "getFraudDetectionData", "()Lcom/stripe/android/networking/FraudDetectionData;", "addCustomerSource", "Lcom/stripe/android/model/Source;", "customerId", "publishableKey", "sourceId", "sourceType", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "addCustomerSource$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildPaymentUserAgentPair", "Lkotlin/Pair;", "attribution", "cancelPaymentIntentSource", "Lcom/stripe/android/model/PaymentIntent;", "paymentIntentId", "options", "cancelPaymentIntentSource$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelSetupIntentSource", "Lcom/stripe/android/model/SetupIntent;", "setupIntentId", "cancelSetupIntentSource$payments_core_debug", "complete3ds2Auth", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "complete3ds2Auth$payments_core_debug", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "expandFields", "", "confirmPaymentIntent$payments_core_debug", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "confirmSetupIntentParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent$payments_core_debug", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createClientSecretParam", "", "", "clientSecret", "createFile", "Lcom/stripe/android/model/StripeFile;", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "createFile$payments_core_debug", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRadarSession", "Lcom/stripe/android/model/RadarSession;", "createRadarSession$payments_core_debug", "(Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSource", "sourceParams", "Lcom/stripe/android/model/SourceParams;", "createSource$payments_core_debug", "(Lcom/stripe/android/model/SourceParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToken", "Lcom/stripe/android/model/Token;", "tokenParams", "Lcom/stripe/android/model/TokenParams;", "createToken$payments_core_debug", "(Lcom/stripe/android/model/TokenParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomerSource", "deleteCustomerSource$payments_core_debug", "detachPaymentMethod", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableDnsCache", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "fetchStripeModel", "ModelType", "Lcom/stripe/android/model/StripeModel;", "apiRequest", "Lcom/stripe/android/networking/ApiRequest;", "jsonParser", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "onResponse", "", "(Lcom/stripe/android/networking/ApiRequest;Lcom/stripe/android/model/parsers/ModelJsonParser;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fireAnalyticsRequest", "params", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "fireAnalyticsRequest$payments_core_debug", "event", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "fireFraudDetectionDataRequest", "getCardMetadata", "Lcom/stripe/android/model/CardMetadata;", "bin", "Lcom/stripe/android/cards/Bin;", "getCardMetadata$payments_core_debug", "(Lcom/stripe/android/cards/Bin;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetachPaymentMethodUrl", "getDetachPaymentMethodUrl$payments_core_debug", "getFpxBankStatus", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatus$payments_core_debug", "getPaymentMethods", "listPaymentMethodsParams", "Lcom/stripe/android/model/ListPaymentMethodsParams;", "(Lcom/stripe/android/model/ListPaymentMethodsParams;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleApiError", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "makeApiRequest", "makeApiRequest$payments_core_debug", "(Lcom/stripe/android/networking/ApiRequest;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeFileUploadRequest", "fileUploadRequest", "Lcom/stripe/android/networking/FileUploadRequest;", "Lkotlin/Function1;", "Lcom/stripe/android/core/networking/RequestId;", "makeFileUploadRequest$payments_core_debug", "(Lcom/stripe/android/networking/FileUploadRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maybeAddPaymentUserAgent", "refreshPaymentIntent", "refreshPaymentIntent$payments_core_debug", "resetDnsCache", "dnsCacheData", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "retrieveCustomer$payments_core_debug", "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveIssuingCardPin", "cardId", "verificationId", "userOneTimeCode", "retrieveIssuingCardPin$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveObject", "Lorg/json/JSONObject;", "url", "retrieveObject$payments_core_debug", "retrievePaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrievePaymentIntentWithOrderedPaymentMethods", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSetupIntent", "retrieveSetupIntentWithOrderedPaymentMethods", "retrieveSource", "retrieveSource$payments_core_debug", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent$payments_core_debug", "retrieveStripeIntentWithOrderedPaymentMethods", "T", "parser", "Lcom/stripe/android/model/parsers/PaymentMethodPreferenceJsonParser;", "analyticsEvent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/model/parsers/PaymentMethodPreferenceJsonParser;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCustomerShippingInfo", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "setCustomerShippingInfo$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultCustomerSource", "setDefaultCustomerSource$payments_core_debug", "start3ds2Auth", "authParams", "Lcom/stripe/android/model/Stripe3ds2AuthParams;", "start3ds2Auth$payments_core_debug", "(Lcom/stripe/android/model/Stripe3ds2AuthParams;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateIssuingCardPin", "newPin", "updateIssuingCardPin$payments_core_debug", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "DnsCacheData", "payments-core_debug"})
public final class StripeApiRepository extends com.stripe.android.networking.StripeRepository {
    private final com.stripe.android.AppInfo appInfo = null;
    private final com.stripe.android.Logger logger = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final java.util.Set<java.lang.String> productUsageTokens = null;
    private final com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final com.stripe.android.networking.FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils = null;
    private final com.stripe.android.networking.ApiRequest.Factory apiRequestFactory = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.StripeApiRepository.Companion Companion = null;
    private static final java.lang.String DNS_CACHE_TTL_PROPERTY_NAME = "networkaddress.cache.ttl";
    private static final java.lang.String PAYMENT_USER_AGENT = "payment_user_agent";
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas, @org.jetbrains.annotations.NotNull()
    java.lang.String apiVersion) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeNetworkClient stripeNetworkClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.FraudDetectionDataRepository fraudDetectionDataRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FraudDetectionDataParamsUtils fraudDetectionDataParamsUtils, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.StripeApiBeta> betas, @org.jetbrains.annotations.NotNull()
    java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkVersion) {
        super();
    }
    
    @javax.inject.Inject()
    public StripeApiRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    private final com.stripe.android.networking.FraudDetectionData getFraudDetectionData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object retrieveStripeIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation) {
        return null;
    }
    
    /**
     * Confirm a [PaymentIntent] using the provided [ConfirmPaymentIntentParams]
     *
     * Analytics event: [PaymentAnalyticsEvent.PaymentIntentConfirm]
     *
     * @param confirmPaymentIntentParams contains the confirmation params
     * @return a [PaymentIntent] reflecting the updated state after applying the parameter
     * provided
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object confirmPaymentIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams confirmPaymentIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    /**
     * Retrieve a [PaymentIntent] using its client_secret
     *
     * Analytics event: [PaymentAnalyticsEvent.PaymentIntentRetrieve]
     *
     * @param clientSecret client_secret of the PaymentIntent to retrieve
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object retrievePaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    /**
     * Refresh a [PaymentIntent] using its client_secret
     *
     * Analytics event: [PaymentAnalyticsEvent.PaymentIntentRefresh]
     *
     * @param clientSecret client_secret of the PaymentIntent to retrieve
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object refreshPaymentIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    /**
     * Retrieve a [PaymentIntent] using its client_secret, with the accepted payment method types
     * ordered according to the [locale] provided.
     *
     * Analytics event: [PaymentAnalyticsEvent.PaymentIntentRetrieve]
     *
     * @param clientSecret client_secret of the PaymentIntent to retrieve
     * @param locale locale used to determine the order of the payment method types
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object retrievePaymentIntentWithOrderedPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.PaymentIntentCancelSource]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object cancelPaymentIntentSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentId, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    /**
     * Confirm a [SetupIntent] using the provided [ConfirmSetupIntentParams]
     *
     * Analytics event: [PaymentAnalyticsEvent.SetupIntentConfirm]
     *
     * @param confirmSetupIntentParams contains the confirmation params
     * @return a [SetupIntent] reflecting the updated state after applying the parameter
     * provided
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object confirmSetupIntent$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams confirmSetupIntentParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    /**
     * Retrieve a [SetupIntent] using its client_secret
     *
     * Analytics event: [PaymentAnalyticsEvent.SetupIntentRetrieve]
     *
     * @param clientSecret client_secret of the SetupIntent to retrieve
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object retrieveSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    /**
     * Retrieve a [SetupIntent] using its client_secret, with the accepted payment method types
     * ordered according to the [locale] provided.
     *
     * Analytics event: [PaymentAnalyticsEvent.SetupIntentRetrieve]
     *
     * @param clientSecret client_secret of the SetupIntent to retrieve
     * @param locale locale used to determine the order of the payment method types
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object retrieveSetupIntentWithOrderedPaymentMethods(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.SetupIntentCancelSource]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object cancelSetupIntentSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentId, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    /**
     * Create a [Source] using the input [SourceParams].
     *
     * Analytics event: [PaymentAnalyticsEvent.SourceCreate]
     *
     * @param sourceParams a [SourceParams] object with [Source] creation params
     * @return a [Source] if one could be created from the input params,
     * or `null` if not
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object createSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SourceParams sourceParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation) {
        return null;
    }
    
    /**
     * Retrieve an existing [Source] object from the server.
     *
     * @param sourceId the [Source.id] field for the Source to query
     * @param clientSecret the [Source.clientSecret] field for the Source to query
     * @return a [Source] if one could be retrieved for the input params, or `null` if
     * no such Source could be found.
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object retrieveSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.PaymentMethodCreate]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation) {
        return null;
    }
    
    /**
     * Create a [Token] using the input token parameters.
     *
     * Analytics event: [PaymentAnalyticsEvent.TokenCreate]
     *
     * @param tokenParams a [TokenParams] representing the object for which this token is being created
     * @param options a [ApiRequest.Options] object that contains connection data like the api
     * key, api version, etc
     *
     * @return a [Token] that can be used to perform other operations with this card
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    @java.lang.Override()
    public java.lang.Object createToken$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.TokenParams tokenParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Token> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerAddSource]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object addCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerDeleteSource]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object deleteCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Source> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerAttachPaymentMethod]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object attachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerDetachPaymentMethod]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object detachPaymentMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation) {
        return null;
    }
    
    /**
     * Retrieve a Customer's [PaymentMethod]s
     *
     * Analytics event: [PaymentAnalyticsEvent.CustomerRetrievePaymentMethods]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ListPaymentMethodsParams listPaymentMethodsParams, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.PaymentMethod>> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerSetDefaultSource]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object setDefaultCustomerSource$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.model.Source.SourceType()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerSetShippingInfo]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object setCustomerShippingInfo$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.CustomerRetrieve]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object retrieveCustomer$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsageTokens, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Customer> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.IssuingRetrievePin]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class, org.json.JSONException.class})
    @java.lang.Override()
    public java.lang.Object retrieveIssuingCardPin$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.IssuingUpdatePin]
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class})
    @java.lang.Override()
    public java.lang.Object updateIssuingCardPin$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String cardId, @org.jetbrains.annotations.NotNull()
    java.lang.String newPin, @org.jetbrains.annotations.NotNull()
    java.lang.String verificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String userOneTimeCode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFpxBankStatus$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.BankStatuses> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCardMetadata$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.Bin bin, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.CardMetadata> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.Auth3ds2Start]
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    @java.lang.Override()
    public java.lang.Object start3ds2Auth$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2AuthParams authParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Stripe3ds2AuthResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object complete3ds2Auth$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.Stripe3ds2AuthResult> continuation) {
        return null;
    }
    
    /**
     * Analytics event: [PaymentAnalyticsEvent.FileCreate]
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createFile$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeFileParams fileParams, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeFile> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.APIException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.AuthenticationException.class})
    @java.lang.Override()
    public java.lang.Object retrieveObject$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.json.JSONObject> continuation) {
        return null;
    }
    
    /**
     * Get the latest [FraudDetectionData] from [FraudDetectionDataRepository] and send in POST request
     * to `/v1/radar/session`.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createRadarSession$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.RadarSession> continuation) {
        return null;
    }
    
    /**
     * @return `https://api.stripe.com/v1/payment_methods/:id/detach`
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.String getDetachPaymentMethodUrl$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId) {
        return null;
    }
    
    private final <T extends com.stripe.android.model.StripeIntent>java.lang.Object retrieveStripeIntentWithOrderedPaymentMethods(java.lang.String clientSecret, com.stripe.android.networking.ApiRequest.Options options, java.util.Locale locale, com.stripe.android.model.parsers.PaymentMethodPreferenceJsonParser<? extends T> parser, com.stripe.android.networking.PaymentAnalyticsEvent analyticsEvent, kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.exception.AuthenticationException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    private final void handleApiError(com.stripe.android.core.networking.StripeResponse<java.lang.String> response) {
    }
    
    private final <ModelType extends com.stripe.android.model.StripeModel>java.lang.Object fetchStripeModel(com.stripe.android.networking.ApiRequest apiRequest, com.stripe.android.model.parsers.ModelJsonParser<? extends ModelType> jsonParser, kotlin.jvm.functions.Function0<kotlin.Unit> onResponse, kotlin.coroutines.Continuation<? super ModelType> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object makeApiRequest$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest apiRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.AuthenticationException.class, com.stripe.android.core.exception.InvalidRequestException.class, com.stripe.android.core.exception.APIConnectionException.class, com.stripe.android.exception.CardException.class, com.stripe.android.exception.APIException.class})
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object makeFileUploadRequest$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.FileUploadRequest fileUploadRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.core.networking.RequestId, kotlin.Unit> onResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> continuation) {
        return null;
    }
    
    private final com.stripe.android.networking.StripeApiRepository.DnsCacheData disableDnsCache() {
        return null;
    }
    
    private final void resetDnsCache(com.stripe.android.networking.StripeApiRepository.DnsCacheData dnsCacheData) {
    }
    
    private final void fireFraudDetectionDataRequest() {
    }
    
    private final void fireAnalyticsRequest(com.stripe.android.networking.PaymentAnalyticsEvent event) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void fireAnalyticsRequest$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequest params) {
    }
    
    private final java.util.Map<java.lang.String, java.lang.Object> createClientSecretParam(java.lang.String clientSecret, java.util.List<java.lang.String> expandFields) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.String> buildPaymentUserAgentPair(java.util.Set<java.lang.String> attribution) {
        return null;
    }
    
    /**
     * Add payment_user_agent to the map if it contains Payment Method data,
     * including attribution from [paymentMethodCreateParams] or [sourceParams].
     */
    private final java.util.Map<java.lang.String, java.lang.Object> maybeAddPaymentUserAgent(java.util.Map<java.lang.String, ? extends java.lang.Object> params, com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, com.stripe.android.model.SourceParams sourceParams) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "", "()V", "Failure", "Success", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "payments-core_debug"})
    static abstract class DnsCacheData {
        
        private DnsCacheData() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Success;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "originalDnsCacheTtl", "", "(Ljava/lang/String;)V", "getOriginalDnsCacheTtl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_debug"})
        public static final class Success extends com.stripe.android.networking.StripeApiRepository.DnsCacheData {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String originalDnsCacheTtl = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.networking.StripeApiRepository.DnsCacheData.Success copy(@org.jetbrains.annotations.Nullable()
            java.lang.String originalDnsCacheTtl) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.Nullable()
            java.lang.String originalDnsCacheTtl) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getOriginalDnsCacheTtl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData$Failure;", "Lcom/stripe/android/networking/StripeApiRepository$DnsCacheData;", "()V", "payments-core_debug"})
        public static final class Failure extends com.stripe.android.networking.StripeApiRepository.DnsCacheData {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.networking.StripeApiRepository.DnsCacheData.Failure INSTANCE = null;
            
            private Failure() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b#\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002J$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b&J\u0015\u0010\'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b+J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b/J\u0015\u00100\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b7J\u0015\u00108\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b<R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\b\u00a8\u0006="}, d2 = {"Lcom/stripe/android/networking/StripeApiRepository$Companion;", "", "()V", "DNS_CACHE_TTL_PROPERTY_NAME", "", "PAYMENT_USER_AGENT", "paymentMethodsUrl", "getPaymentMethodsUrl$payments_core_debug", "()Ljava/lang/String;", "sourcesUrl", "getSourcesUrl$payments_core_debug", "tokensUrl", "getTokensUrl$payments_core_debug", "createExpandParam", "", "", "expandFields", "createVerificationParam", "verificationId", "userOneTimeCode", "getAddCustomerSourceUrl", "customerId", "getAddCustomerSourceUrl$payments_core_debug", "getApiUrl", "path", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getAttachPaymentMethodUrl", "paymentMethodId", "getAttachPaymentMethodUrl$payments_core_debug", "getCancelPaymentIntentSourceUrl", "paymentIntentId", "getCancelPaymentIntentSourceUrl$payments_core_debug", "getCancelSetupIntentSourceUrl", "setupIntentId", "getCancelSetupIntentSourceUrl$payments_core_debug", "getConfirmPaymentIntentUrl", "getConfirmPaymentIntentUrl$payments_core_debug", "getConfirmSetupIntentUrl", "getConfirmSetupIntentUrl$payments_core_debug", "getDeleteCustomerSourceUrl", "sourceId", "getDeleteCustomerSourceUrl$payments_core_debug", "getEdgeUrl", "getIssuingCardPinUrl", "cardId", "getIssuingCardPinUrl$payments_core_debug", "getRefreshPaymentIntentUrl", "getRefreshPaymentIntentUrl$payments_core_debug", "getRetrieveCustomerUrl", "getRetrieveCustomerUrl$payments_core_debug", "getRetrievePaymentIntentUrl", "getRetrievePaymentIntentUrl$payments_core_debug", "getRetrieveSetupIntentUrl", "getRetrieveSetupIntentUrl$payments_core_debug", "getRetrieveSourceApiUrl", "getRetrieveSourceApiUrl$payments_core_debug", "getRetrieveTokenApiUrl", "tokenId", "getRetrieveTokenApiUrl$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.util.Map<java.lang.String, java.lang.String> createVerificationParam(java.lang.String verificationId, java.lang.String userOneTimeCode) {
            return null;
        }
        
        private final java.lang.String getApiUrl(java.lang.String path, java.lang.Object... args) {
            return null;
        }
        
        private final java.lang.String getApiUrl(java.lang.String path) {
            return null;
        }
        
        private final java.lang.String getEdgeUrl(java.lang.String path) {
            return null;
        }
        
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> createExpandParam(java.util.List<java.lang.String> expandFields) {
            return null;
        }
    }
}