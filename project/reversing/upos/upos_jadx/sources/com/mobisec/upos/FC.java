package com.mobisec.upos;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.util.Base64;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.security.MessageDigest;

public class FC {
    public static Context ctx = null;
    public static long[][] m = ((long[][]) Array.newInstance(long.class, new int[]{256, 256}));

    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03b8, code lost:
        r22 = r4;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03bd, code lost:
        r22 = r4;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03c2, code lost:
        r19 = r3;
        r22 = r4;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03cc, code lost:
        r19 = r3;
        r22 = r4;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x04d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x04d4, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x04d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x04d8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x04db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x04dc, code lost:
        r1 = r0;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x04e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x04e1, code lost:
        r1 = r0;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x04e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x04e6, code lost:
        r1 = r0;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0529, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x052a, code lost:
        r1 = r0;
        r2 = r7;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x052e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x052f, code lost:
        r1 = r0;
        r2 = r7;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0533, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0534, code lost:
        r1 = r0;
        r2 = r7;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0538, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0539, code lost:
        r1 = r0;
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x053d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x053e, code lost:
        r1 = r0;
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0544, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0545, code lost:
        r3 = true;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x054b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x054c, code lost:
        r3 = true;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0552, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0553, code lost:
        r3 = true;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x023d A[SYNTHETIC, Splitter:B:117:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02d0 A[Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x031e A[Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0320 A[Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03ee A[Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04b1 A[SYNTHETIC, Splitter:B:296:0x04b1] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x04d3 A[ExcHandler: Exception (r0v22 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:195:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04d7 A[ExcHandler: GeneralSecurityException (r0v21 'e' java.security.GeneralSecurityException A[CUSTOM_DECLARE]), Splitter:B:195:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x04db A[ExcHandler: RejectedExecutionException (r0v20 'e' java.util.concurrent.RejectedExecutionException A[CUSTOM_DECLARE]), Splitter:B:195:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x04e5 A[ExcHandler: BatchUpdateException (r0v18 'e' java.sql.BatchUpdateException A[CUSTOM_DECLARE]), Splitter:B:195:0x0340] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04f0 A[Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0529 A[ExcHandler: RejectedExecutionException (r0v7 'e' java.util.concurrent.RejectedExecutionException A[CUSTOM_DECLARE]), PHI: r7 
  PHI: (r7v5 'idx' int) = (r7v0 'idx' int), (r7v15 'idx' int), (r7v15 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int), (r7v20 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int) binds: [B:3:0x001d, B:287:0x0496, B:260:0x0403, B:169:0x02b9, B:178:0x02df, B:319:0x04ea, B:182:0x0310, B:179:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x052e A[ExcHandler: CertificateEncodingException (r0v6 'e' java.security.cert.CertificateEncodingException A[CUSTOM_DECLARE]), PHI: r7 
  PHI: (r7v4 'idx' int) = (r7v0 'idx' int), (r7v15 'idx' int), (r7v15 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int), (r7v20 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int) binds: [B:3:0x001d, B:287:0x0496, B:260:0x0403, B:169:0x02b9, B:178:0x02df, B:319:0x04ea, B:182:0x0310, B:179:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0533 A[ExcHandler: BatchUpdateException (r0v5 'e' java.sql.BatchUpdateException A[CUSTOM_DECLARE]), PHI: r7 
  PHI: (r7v3 'idx' int) = (r7v0 'idx' int), (r7v15 'idx' int), (r7v15 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int), (r7v20 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int) binds: [B:3:0x001d, B:287:0x0496, B:260:0x0403, B:169:0x02b9, B:178:0x02df, B:319:0x04ea, B:182:0x0310, B:179:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0538 A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r7 
  PHI: (r7v2 'idx' int) = (r7v0 'idx' int), (r7v0 'idx' int), (r7v0 'idx' int), (r7v15 'idx' int), (r7v15 'idx' int), (r7v19 'idx' int), (r7v20 'idx' int), (r7v19 'idx' int) binds: [B:1:0x001b, B:2:?, B:3:0x001d, B:287:0x0496, B:260:0x0403, B:169:0x02b9, B:319:0x04ea, B:182:0x0310] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x053d A[ExcHandler: GeneralSecurityException (r0v3 'e' java.security.GeneralSecurityException A[CUSTOM_DECLARE]), PHI: r7 
  PHI: (r7v1 'idx' int) = (r7v0 'idx' int), (r7v0 'idx' int), (r7v0 'idx' int), (r7v15 'idx' int), (r7v15 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int), (r7v20 'idx' int), (r7v19 'idx' int), (r7v19 'idx' int) binds: [B:1:0x001b, B:2:?, B:3:0x001d, B:287:0x0496, B:260:0x0403, B:169:0x02b9, B:178:0x02df, B:319:0x04ea, B:182:0x0310, B:179:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0138 A[EDGE_INSN: B:364:0x0138->B:51:0x0138 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[Catch:{ IllegalFormatCodePointException -> 0x0278 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[Catch:{ IllegalFormatCodePointException -> 0x0278 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142 A[Catch:{ IllegalFormatCodePointException -> 0x024d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkFlag(android.content.Context r28, java.lang.String r29) {
        /*
            r1 = r28
            r2 = r29
            java.lang.String r3 = " "
            java.lang.String r4 = "mayb"
            r5 = r1
            com.mobisec.upos.MainActivity r5 = (com.mobisec.upos.MainActivity) r5
            android.support.v7.app.Activity.initActivity(r5)
            ctx = r1
            r5 = 200(0xc8, float:2.8E-43)
            boolean[] r5 = new boolean[r5]
            com.mobisec.upos.Streamer r6 = new com.mobisec.upos.Streamer
            r6.<init>()
            r7 = 0
            r8 = 0
            long[][] r10 = m     // Catch:{ BatchUpdateException -> 0x0552, CertificateEncodingException -> 0x054b, RejectedExecutionException -> 0x0544, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            lm(r10)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r10 = r29.length()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r11 = 69
            if (r10 == r11) goto L_0x0029
            return r8
        L_0x0029:
            int r10 = r7 + 1
            java.lang.String r11 = "MOBISEC{"
            boolean r11 = r2.startsWith(r11)     // Catch:{ BatchUpdateException -> 0x0524, CertificateEncodingException -> 0x051f, RejectedExecutionException -> 0x051a, GeneralSecurityException -> 0x0516, Exception -> 0x0512 }
            r5[r7] = r11     // Catch:{ BatchUpdateException -> 0x0524, CertificateEncodingException -> 0x051f, RejectedExecutionException -> 0x051a, GeneralSecurityException -> 0x0516, Exception -> 0x0512 }
            r7 = 8
            java.lang.String r11 = r2.substring(r7)     // Catch:{ BatchUpdateException -> 0x0524, CertificateEncodingException -> 0x051f, RejectedExecutionException -> 0x051a, GeneralSecurityException -> 0x0516, Exception -> 0x0512 }
            int r12 = r10 + 1
            java.lang.String r13 = "}"
            boolean r13 = r11.endsWith(r13)     // Catch:{ BatchUpdateException -> 0x050c, CertificateEncodingException -> 0x0506, RejectedExecutionException -> 0x0500, GeneralSecurityException -> 0x04fb, Exception -> 0x04f6 }
            r5[r10] = r13     // Catch:{ BatchUpdateException -> 0x050c, CertificateEncodingException -> 0x0506, RejectedExecutionException -> 0x0500, GeneralSecurityException -> 0x04fb, Exception -> 0x04f6 }
            r10 = 1
            r6.step()     // Catch:{ IllformedLocaleException -> 0x02b2, NullPointerException -> 0x02ad }
            boolean r15 = com.mobisec.upos.MainActivity.g2     // Catch:{ IllformedLocaleException -> 0x02b2, NullPointerException -> 0x02ad }
            if (r15 == 0) goto L_0x004c
            return r8
        L_0x004c:
            r6.step()     // Catch:{ IllformedLocaleException -> 0x02b2, NullPointerException -> 0x02ad }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x02b2, NullPointerException -> 0x02ad }
            int r15 = r12 + 1
            java.lang.String r7 = "this_is_"
            boolean r7 = r11.startsWith(r7)     // Catch:{ IllformedLocaleException -> 0x02a9, NullPointerException -> 0x02a5, BatchUpdateException -> 0x029f, CertificateEncodingException -> 0x0299, RejectedExecutionException -> 0x0293, GeneralSecurityException -> 0x028e, Exception -> 0x0289 }
            r5[r12] = r7     // Catch:{ IllformedLocaleException -> 0x02a9, NullPointerException -> 0x02a5, BatchUpdateException -> 0x029f, CertificateEncodingException -> 0x0299, RejectedExecutionException -> 0x0293, GeneralSecurityException -> 0x028e, Exception -> 0x0289 }
            int r7 = r15 + 1
            java.lang.String r12 = "upos"
            boolean r12 = r11.endsWith(r12)     // Catch:{ IllformedLocaleException -> 0x0285, NullPointerException -> 0x0281 }
            r5[r15] = r12     // Catch:{ IllformedLocaleException -> 0x0285, NullPointerException -> 0x0281 }
            int r12 = r7 + 1
            r15 = 10
            char r9 = r11.charAt(r15)     // Catch:{ IllegalFormatCodePointException -> 0x027c }
            r14 = 99
            r15 = 13
            if (r9 == r14) goto L_0x007f
            char r9 = r11.charAt(r15)     // Catch:{ IllegalFormatCodePointException -> 0x027c }
            r14 = 113(0x71, float:1.58E-43)
            if (r9 != r14) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r9 = 0
            goto L_0x0080
        L_0x007f:
            r9 = 1
        L_0x0080:
            r5[r7] = r9     // Catch:{ IllegalFormatCodePointException -> 0x027c }
            int r7 = r12 + 1
            r9 = 3
            char r9 = r11.charAt(r9)     // Catch:{ IllegalFormatCodePointException -> 0x0278 }
            r14 = 7
            char r14 = r11.charAt(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0278 }
            int r9 = r9 + r14
            r14 = 114(0x72, float:1.6E-43)
            if (r9 != r14) goto L_0x0095
            r9 = 1
            goto L_0x0096
        L_0x0095:
            r9 = 0
        L_0x0096:
            r5[r12] = r9     // Catch:{ IllegalFormatCodePointException -> 0x0278 }
            r6.step()     // Catch:{ IllegalFormatCodePointException -> 0x0278 }
            int r9 = r7 + 1
            java.lang.String r12 = "really_"
            boolean r12 = r11.contains(r12)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r5[r7] = r12     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r7 = 0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r12.<init>()     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r14 = 2131427368(0x7f0b0028, float:1.847635E38)
            java.lang.String r14 = r1.getString(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r14 = dec(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r12.append(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r12.append(r3)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r14 = 2131427369(0x7f0b0029, float:1.8476352E38)
            java.lang.String r20 = r1.getString(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r8 = dec(r20)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r12.append(r8)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r8 = r12.toString()     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r8 = ec(r8)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r12 = "\n"
            java.lang.String[] r8 = r8.split(r12)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            int r12 = r8.length     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r15 = 0
        L_0x00da:
            if (r15 >= r12) goto L_0x0138
            r22 = r8[r15]     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r23 = r22
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r13.<init>()     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r14 = 2131427370(0x7f0b002a, float:1.8476354E38)
            java.lang.String r14 = r1.getString(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r14 = dec(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r13.append(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r13.append(r3)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r14 = 2131427369(0x7f0b0029, float:1.8476352E38)
            java.lang.String r24 = r1.getString(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r14 = dec(r24)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r13.append(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r14 = "/"
            r13.append(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r14 = r23
            r13.append(r14)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r2 = "/maps"
            r13.append(r2)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r2 = r13.toString()     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r13 = ec(r2)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            r23 = r2
            r2 = 2131427371(0x7f0b002b, float:1.8476356E38)
            java.lang.String r2 = r1.getString(r2)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            java.lang.String r2 = dec(r2)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            boolean r2 = r13.contains(r2)     // Catch:{ IllegalFormatCodePointException -> 0x0275, IllformedLocaleException -> 0x0271, NullPointerException -> 0x026d, BatchUpdateException -> 0x0267, CertificateEncodingException -> 0x0261, RejectedExecutionException -> 0x025b, GeneralSecurityException -> 0x0256, Exception -> 0x0251 }
            if (r2 == 0) goto L_0x0130
            r7 = 1
            goto L_0x0138
        L_0x0130:
            int r15 = r15 + 1
            r2 = r29
            r14 = 2131427369(0x7f0b0029, float:1.8476352E38)
            goto L_0x00da
        L_0x0138:
            int r2 = r9 + 1
            r5[r9] = r7     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            int r3 = r2 + -1
            boolean r3 = r5[r3]     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            if (r3 != 0) goto L_0x023d
            r6.step()     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            int r3 = r2 + 1
            r9 = 14
            java.lang.String r12 = r11.substring(r9)     // Catch:{ IllegalFormatCodePointException -> 0x0238, IllformedLocaleException -> 0x0233, NullPointerException -> 0x022e, BatchUpdateException -> 0x0228, CertificateEncodingException -> 0x0222, RejectedExecutionException -> 0x021c, GeneralSecurityException -> 0x0217, Exception -> 0x0212 }
            java.lang.String r9 = "_evil"
            boolean r9 = r12.endsWith(r9)     // Catch:{ IllegalFormatCodePointException -> 0x0238, IllformedLocaleException -> 0x0233, NullPointerException -> 0x022e, BatchUpdateException -> 0x0228, CertificateEncodingException -> 0x0222, RejectedExecutionException -> 0x021c, GeneralSecurityException -> 0x0217, Exception -> 0x0212 }
            r5[r2] = r9     // Catch:{ IllegalFormatCodePointException -> 0x0238, IllformedLocaleException -> 0x0233, NullPointerException -> 0x022e, BatchUpdateException -> 0x0228, CertificateEncodingException -> 0x0222, RejectedExecutionException -> 0x021c, GeneralSecurityException -> 0x0217, Exception -> 0x0212 }
            int r2 = r3 + 1
            r9 = 9
            r12 = 13
            java.lang.String r9 = r11.substring(r9, r12)     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            java.lang.String r12 = "bam"
            boolean r9 = r9.endsWith(r12)     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            r5[r3] = r9     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            r6.step()     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            boolean r3 = com.mobisec.upos.MainActivity.g4     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            if (r3 == 0) goto L_0x0170
            r3 = 0
            return r3
        L_0x0170:
            r6.step()     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            android.content.pm.PackageManager r3 = r28.getPackageManager()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r8 = 128(0x80, float:1.794E-43)
            java.util.List r3 = r3.getInstalledApplications(r8)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r7 = 0
            java.util.Iterator r8 = r3.iterator()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
        L_0x0183:
            boolean r9 = r8.hasNext()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            if (r9 == 0) goto L_0x01a5
            java.lang.Object r9 = r8.next()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            android.content.pm.ApplicationInfo r9 = (android.content.pm.ApplicationInfo) r9     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            java.lang.String r12 = r9.packageName     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r13 = 2131427372(0x7f0b002c, float:1.8476358E38)
            java.lang.String r13 = r1.getString(r13)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            java.lang.String r13 = dec(r13)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            boolean r12 = r12.equals(r13)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            if (r12 == 0) goto L_0x01a4
            r7 = 1
            goto L_0x01a5
        L_0x01a4:
            goto L_0x0183
        L_0x01a5:
            int r8 = r2 + 1
            r5[r2] = r7     // Catch:{ IllformedLocaleException -> 0x020d, NullPointerException -> 0x0208, BatchUpdateException -> 0x0202, CertificateEncodingException -> 0x01fc, RejectedExecutionException -> 0x01f6, GeneralSecurityException -> 0x01f1, Exception -> 0x01ec }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x020d, NullPointerException -> 0x0208, BatchUpdateException -> 0x0202, CertificateEncodingException -> 0x01fc, RejectedExecutionException -> 0x01f6, GeneralSecurityException -> 0x01f1, Exception -> 0x01ec }
            int r2 = r8 + 1
            r9 = 4
            r12 = 10
            java.lang.String r9 = r11.substring(r9, r12)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            java.lang.String r12 = "incred"
            boolean r9 = r9.equals(r12)     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r5[r8] = r9     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            boolean r8 = com.mobisec.upos.MainActivity.g1     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            if (r8 == 0) goto L_0x01c7
            r4 = 0
            return r4
        L_0x01c7:
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            int r8 = r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            if (r8 > 0) goto L_0x01e6
            boolean r8 = com.mobisec.upos.MainActivity.g1     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            if (r8 == 0) goto L_0x01e6
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r6.step()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            goto L_0x031c
        L_0x01e6:
            java.util.IllformedLocaleException r8 = new java.util.IllformedLocaleException     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            r8.<init>()     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
            throw r8     // Catch:{ IllformedLocaleException -> 0x0248, NullPointerException -> 0x0243 }
        L_0x01ec:
            r0 = move-exception
            r1 = r0
            r2 = r8
            goto L_0x053b
        L_0x01f1:
            r0 = move-exception
            r1 = r0
            r2 = r8
            goto L_0x0540
        L_0x01f6:
            r0 = move-exception
            r1 = r0
            r2 = r8
            r3 = 1
            goto L_0x0548
        L_0x01fc:
            r0 = move-exception
            r1 = r0
            r2 = r8
            r3 = 1
            goto L_0x054f
        L_0x0202:
            r0 = move-exception
            r1 = r0
            r2 = r8
            r3 = 1
            goto L_0x0556
        L_0x0208:
            r0 = move-exception
            r2 = r0
            r9 = r8
            goto L_0x02b0
        L_0x020d:
            r0 = move-exception
            r2 = r0
            r9 = r8
            goto L_0x02b5
        L_0x0212:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L_0x053b
        L_0x0217:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L_0x0540
        L_0x021c:
            r0 = move-exception
            r1 = r0
            r2 = r3
            r3 = 1
            goto L_0x0548
        L_0x0222:
            r0 = move-exception
            r1 = r0
            r2 = r3
            r3 = 1
            goto L_0x054f
        L_0x0228:
            r0 = move-exception
            r1 = r0
            r2 = r3
            r3 = 1
            goto L_0x0556
        L_0x022e:
            r0 = move-exception
            r2 = r0
            r9 = r3
            goto L_0x02b0
        L_0x0233:
            r0 = move-exception
            r2 = r0
            r9 = r3
            goto L_0x02b5
        L_0x0238:
            r0 = move-exception
            r2 = r0
            r9 = r3
            goto L_0x027f
        L_0x023d:
            java.sql.BatchUpdateException r3 = new java.sql.BatchUpdateException     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            r3.<init>()     // Catch:{ IllegalFormatCodePointException -> 0x024d }
            throw r3     // Catch:{ IllegalFormatCodePointException -> 0x024d }
        L_0x0243:
            r0 = move-exception
            r9 = r2
            r2 = r0
            goto L_0x02b0
        L_0x0248:
            r0 = move-exception
            r9 = r2
            r2 = r0
            goto L_0x02b5
        L_0x024d:
            r0 = move-exception
            r9 = r2
            r2 = r0
            goto L_0x027f
        L_0x0251:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x053b
        L_0x0256:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x0540
        L_0x025b:
            r0 = move-exception
            r1 = r0
            r2 = r9
            r3 = 1
            goto L_0x0548
        L_0x0261:
            r0 = move-exception
            r1 = r0
            r2 = r9
            r3 = 1
            goto L_0x054f
        L_0x0267:
            r0 = move-exception
            r1 = r0
            r2 = r9
            r3 = 1
            goto L_0x0556
        L_0x026d:
            r0 = move-exception
            r2 = r0
            goto L_0x02b0
        L_0x0271:
            r0 = move-exception
            r2 = r0
            goto L_0x02b5
        L_0x0275:
            r0 = move-exception
            r2 = r0
            goto L_0x027f
        L_0x0278:
            r0 = move-exception
            r2 = r0
            r9 = r7
            goto L_0x027f
        L_0x027c:
            r0 = move-exception
            r2 = r0
            r9 = r12
        L_0x027f:
            r3 = 0
            return r3
        L_0x0281:
            r0 = move-exception
            r2 = r0
            r9 = r7
            goto L_0x02b0
        L_0x0285:
            r0 = move-exception
            r2 = r0
            r9 = r7
            goto L_0x02b5
        L_0x0289:
            r0 = move-exception
            r1 = r0
            r2 = r15
            goto L_0x053b
        L_0x028e:
            r0 = move-exception
            r1 = r0
            r2 = r15
            goto L_0x0540
        L_0x0293:
            r0 = move-exception
            r1 = r0
            r2 = r15
            r3 = 1
            goto L_0x0548
        L_0x0299:
            r0 = move-exception
            r1 = r0
            r2 = r15
            r3 = 1
            goto L_0x054f
        L_0x029f:
            r0 = move-exception
            r1 = r0
            r2 = r15
            r3 = 1
            goto L_0x0556
        L_0x02a5:
            r0 = move-exception
            r2 = r0
            r9 = r15
            goto L_0x02b0
        L_0x02a9:
            r0 = move-exception
            r2 = r0
            r9 = r15
            goto L_0x02b5
        L_0x02ad:
            r0 = move-exception
            r2 = r0
            r9 = r12
        L_0x02b0:
            r3 = 0
            return r3
        L_0x02b2:
            r0 = move-exception
            r2 = r0
            r9 = r12
        L_0x02b5:
            int r7 = r9 + 1
            r3 = 22
            java.lang.String r8 = r11.substring(r3)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.String r3 = r8.toUpperCase()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            boolean r3 = r3.startsWith(r4)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r5[r9] = r3     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r6.step()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r3 = r7 + -3
            boolean r3 = r5[r3]     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r3 == 0) goto L_0x04f0
            boolean r3 = com.mobisec.upos.MainActivity.g3     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r3 == 0) goto L_0x02d9
            r6.step()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r3 = 0
            return r3
        L_0x02d9:
            r6.step()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r3 = 2131427374(0x7f0b002e, float:1.8476362E38)
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.String r3 = dec(r3)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            r8 = 2131427375(0x7f0b002f, float:1.8476364E38)
            java.lang.String r8 = r1.getString(r8)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.String r8 = dec(r8)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            r9 = 0
            java.lang.Class[] r12 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.reflect.Method r8 = r3.getMethod(r8, r12)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.Object r9 = r8.invoke(r12, r13)     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            r5[r7] = r9     // Catch:{ Exception -> 0x030d, BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d }
            goto L_0x0312
        L_0x030d:
            r0 = move-exception
            r3 = r0
            r8 = 0
            r5[r7] = r8     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
        L_0x0312:
            int r7 = r7 + 1
            int r3 = r7 + -1
            boolean r3 = r5[r3]     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r3 != 0) goto L_0x04ea
            r10 = 0
            r2 = r7
        L_0x031c:
            if (r10 == 0) goto L_0x0320
            r3 = 0
            return r3
        L_0x0320:
            int r7 = r2 + 1
            java.lang.String r3 = r11.toLowerCase()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r8 = 11
            r9 = 14
            java.lang.String r3 = r3.substring(r8, r9)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r8 = 1
            char r3 = r3.charAt(r8)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r8 = 52
            if (r3 != r8) goto L_0x0339
            r3 = 1
            goto L_0x033a
        L_0x0339:
            r3 = 0
        L_0x033a:
            r5[r2] = r3     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r2 = r7 + 1
            r3 = 22
            java.lang.String r3 = r11.substring(r3)     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            java.lang.String r3 = r3.toUpperCase()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            boolean r3 = r3.startsWith(r4)     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r5[r7] = r3     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            android.content.pm.PackageManager r3 = r28.getPackageManager()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            java.lang.String r4 = r28.getPackageName()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r7 = 64
            r8 = 0
            android.content.pm.PackageInfo r9 = r3.getPackageInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x035f }
            r8 = r9
            goto L_0x0364
        L_0x035f:
            r0 = move-exception
            r9 = r0
            r9.printStackTrace()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
        L_0x0364:
            android.content.pm.Signature[] r9 = r8.signatures     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r12 = 0
            r13 = r9[r12]     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            byte[] r12 = r13.toByteArray()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r13.<init>(r12)     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r14 = 0
            java.lang.String r15 = "X509"
            java.security.cert.CertificateFactory r15 = java.security.cert.CertificateFactory.getInstance(r15)     // Catch:{ CertificateException -> 0x037b }
            r14 = r15
            goto L_0x0380
        L_0x037b:
            r0 = move-exception
            r15 = r0
            r15.printStackTrace()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
        L_0x0380:
            r15 = 0
            java.security.cert.Certificate r18 = r14.generateCertificate(r13)     // Catch:{ CertificateException -> 0x038a }
            java.security.cert.X509Certificate r18 = (java.security.cert.X509Certificate) r18     // Catch:{ CertificateException -> 0x038a }
            r15 = r18
            goto L_0x0390
        L_0x038a:
            r0 = move-exception
            r18 = r0
            r18.printStackTrace()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
        L_0x0390:
            r18 = 0
            java.lang.String r19 = "SHA1"
            java.security.MessageDigest r19 = java.security.MessageDigest.getInstance(r19)     // Catch:{ NoSuchAlgorithmException -> 0x03cb, CertificateEncodingException -> 0x03c1, BatchUpdateException -> 0x04e5, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r20 = r19
            r19 = r3
            byte[] r3 = r15.getEncoded()     // Catch:{ NoSuchAlgorithmException -> 0x03bc, CertificateEncodingException -> 0x03b7, BatchUpdateException -> 0x04e5, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r22 = r4
            r4 = r20
            byte[] r3 = r4.digest(r3)     // Catch:{ NoSuchAlgorithmException -> 0x03b4, CertificateEncodingException -> 0x03b1, BatchUpdateException -> 0x04e5, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            java.lang.String r20 = th(r3)     // Catch:{ NoSuchAlgorithmException -> 0x03b4, CertificateEncodingException -> 0x03b1, BatchUpdateException -> 0x04e5, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            r18 = r20
            r3 = r18
            goto L_0x03d7
        L_0x03b1:
            r0 = move-exception
            r3 = r0
            goto L_0x03c7
        L_0x03b4:
            r0 = move-exception
            r3 = r0
            goto L_0x03d1
        L_0x03b7:
            r0 = move-exception
            r22 = r4
            r3 = r0
            goto L_0x03c7
        L_0x03bc:
            r0 = move-exception
            r22 = r4
            r3 = r0
            goto L_0x03d1
        L_0x03c1:
            r0 = move-exception
            r19 = r3
            r22 = r4
            r3 = r0
        L_0x03c7:
            r3.printStackTrace()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
            goto L_0x03d5
        L_0x03cb:
            r0 = move-exception
            r19 = r3
            r22 = r4
            r3 = r0
        L_0x03d1:
            r3.printStackTrace()     // Catch:{ BatchUpdateException -> 0x04e5, CertificateEncodingException -> 0x04e0, RejectedExecutionException -> 0x04db, GeneralSecurityException -> 0x04d7, Exception -> 0x04d3 }
        L_0x03d5:
            r3 = r18
        L_0x03d7:
            int r4 = r2 + 1
            r18 = r7
            r7 = 2131427373(0x7f0b002d, float:1.847636E38)
            java.lang.String r7 = r1.getString(r7)     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            boolean r7 = r3.equals(r7)     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            r5[r2] = r7     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            int r2 = r4 + -1
            boolean r2 = r5[r2]     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            if (r2 == 0) goto L_0x04b1
            r2 = 0
            boolean r7 = r5[r2]     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            if (r7 == 0) goto L_0x04af
            r2 = 1
            boolean r7 = r5[r2]     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            if (r7 != 0) goto L_0x03fa
            goto L_0x04af
        L_0x03fa:
            r2 = 100
            r4 = 0
            r7 = r2
        L_0x03fe:
            r2 = 30
            if (r4 >= r2) goto L_0x0492
            r2 = 1
            r5[r7] = r2     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r2.<init>()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r1 = r4 * 2
            char r1 = r11.charAt(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.String r1 = java.lang.Character.toString(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r2.append(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r1 = r4 * 2
            r17 = 1
            int r1 = r1 + 1
            char r1 = r11.charAt(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.String r1 = java.lang.Character.toString(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r2.append(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.String r1 = r2.toString()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            boolean r2 = ip(r4)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r2 == 0) goto L_0x043b
            r2 = 0
        L_0x0433:
            if (r2 >= r4) goto L_0x043b
            r6.step()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r2 = r2 + 1
            goto L_0x0433
        L_0x043b:
            int r2 = r6.g2()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r20 = r6.g2()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r23 = 65280(0xff00, float:9.1477E-41)
            r20 = r20 & r23
            r16 = 8
            int r20 = r20 >> 8
            java.lang.String r23 = r(r1)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            long r23 = sq(r23)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            long[][] r25 = m     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r25 = r25[r2]     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r26 = r25[r20]     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            int r25 = (r23 > r26 ? 1 : (r23 == r26 ? 0 : -1))
            if (r25 == 0) goto L_0x048a
            int r23 = r7 + 1
            r21 = 0
            r5[r7] = r21     // Catch:{ BatchUpdateException -> 0x0483, CertificateEncodingException -> 0x047c, RejectedExecutionException -> 0x0475, GeneralSecurityException -> 0x046f, Exception -> 0x0469 }
            r7 = r23
            goto L_0x048c
        L_0x0469:
            r0 = move-exception
            r1 = r0
            r2 = r23
            goto L_0x053b
        L_0x046f:
            r0 = move-exception
            r1 = r0
            r2 = r23
            goto L_0x0540
        L_0x0475:
            r0 = move-exception
            r1 = r0
            r2 = r23
            r3 = 1
            goto L_0x0548
        L_0x047c:
            r0 = move-exception
            r1 = r0
            r2 = r23
            r3 = 1
            goto L_0x054f
        L_0x0483:
            r0 = move-exception
            r1 = r0
            r2 = r23
            r3 = 1
            goto L_0x0556
        L_0x048a:
            int r7 = r7 + 1
        L_0x048c:
            int r4 = r4 + 1
            r1 = r28
            goto L_0x03fe
        L_0x0492:
            int r1 = r7 + -30
        L_0x0494:
            if (r1 >= r7) goto L_0x049f
            boolean r2 = r5[r1]     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r2 != 0) goto L_0x049c
            r2 = 0
            return r2
        L_0x049c:
            int r1 = r1 + 1
            goto L_0x0494
        L_0x049f:
            java.lang.String r1 = h(r29)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            java.lang.String r2 = "4193d9b72a5c4805e9a5cc739f8a8fc23b2890e13b83bb887d96f86c30654a12"
            boolean r1 = r1.equals(r2)     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            if (r1 != 0) goto L_0x04ad
            r1 = 0
            return r1
        L_0x04ad:
            r1 = 1
            return r1
        L_0x04af:
            r1 = 0
            return r1
        L_0x04b1:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            r1.<init>()     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
            throw r1     // Catch:{ BatchUpdateException -> 0x04cd, CertificateEncodingException -> 0x04c7, RejectedExecutionException -> 0x04c1, GeneralSecurityException -> 0x04bc, Exception -> 0x04b7 }
        L_0x04b7:
            r0 = move-exception
            r1 = r0
            r2 = r4
            goto L_0x053b
        L_0x04bc:
            r0 = move-exception
            r1 = r0
            r2 = r4
            goto L_0x0540
        L_0x04c1:
            r0 = move-exception
            r1 = r0
            r2 = r4
            r3 = 1
            goto L_0x0548
        L_0x04c7:
            r0 = move-exception
            r1 = r0
            r2 = r4
            r3 = 1
            goto L_0x054f
        L_0x04cd:
            r0 = move-exception
            r1 = r0
            r2 = r4
            r3 = 1
            goto L_0x0556
        L_0x04d3:
            r0 = move-exception
            r1 = r0
            goto L_0x053b
        L_0x04d7:
            r0 = move-exception
            r1 = r0
            goto L_0x0540
        L_0x04db:
            r0 = move-exception
            r1 = r0
            r3 = 1
            goto L_0x0548
        L_0x04e0:
            r0 = move-exception
            r1 = r0
            r3 = 1
            goto L_0x054f
        L_0x04e5:
            r0 = move-exception
            r1 = r0
            r3 = 1
            goto L_0x0556
        L_0x04ea:
            java.security.cert.CertificateEncodingException r1 = new java.security.cert.CertificateEncodingException     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r1.<init>()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            throw r1     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
        L_0x04f0:
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            r1.<init>()     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
            throw r1     // Catch:{ BatchUpdateException -> 0x0533, CertificateEncodingException -> 0x052e, RejectedExecutionException -> 0x0529, GeneralSecurityException -> 0x053d, Exception -> 0x0538 }
        L_0x04f6:
            r0 = move-exception
            r1 = r0
            r2 = r12
            goto L_0x053b
        L_0x04fb:
            r0 = move-exception
            r1 = r0
            r2 = r12
            goto L_0x0540
        L_0x0500:
            r0 = move-exception
            r1 = r0
            r2 = r12
            r3 = 1
            goto L_0x0548
        L_0x0506:
            r0 = move-exception
            r1 = r0
            r2 = r12
            r3 = 1
            goto L_0x054f
        L_0x050c:
            r0 = move-exception
            r1 = r0
            r2 = r12
            r3 = 1
            goto L_0x0556
        L_0x0512:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L_0x053b
        L_0x0516:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L_0x0540
        L_0x051a:
            r0 = move-exception
            r1 = r0
            r2 = r10
            r3 = 1
            goto L_0x0548
        L_0x051f:
            r0 = move-exception
            r1 = r0
            r2 = r10
            r3 = 1
            goto L_0x054f
        L_0x0524:
            r0 = move-exception
            r1 = r0
            r2 = r10
            r3 = 1
            goto L_0x0556
        L_0x0529:
            r0 = move-exception
            r1 = r0
            r2 = r7
            r3 = 1
            goto L_0x0548
        L_0x052e:
            r0 = move-exception
            r1 = r0
            r2 = r7
            r3 = 1
            goto L_0x054f
        L_0x0533:
            r0 = move-exception
            r1 = r0
            r2 = r7
            r3 = 1
            goto L_0x0556
        L_0x0538:
            r0 = move-exception
            r1 = r0
            r2 = r7
        L_0x053b:
            r3 = 0
            return r3
        L_0x053d:
            r0 = move-exception
            r1 = r0
            r2 = r7
        L_0x0540:
            r3 = 1
            com.mobisec.upos.MainActivity.g4 = r3
            goto L_0x0558
        L_0x0544:
            r0 = move-exception
            r3 = 1
            r1 = r0
            r2 = r7
        L_0x0548:
            com.mobisec.upos.MainActivity.g3 = r3
            goto L_0x0558
        L_0x054b:
            r0 = move-exception
            r3 = 1
            r1 = r0
            r2 = r7
        L_0x054f:
            com.mobisec.upos.MainActivity.g1 = r3
            goto L_0x0558
        L_0x0552:
            r0 = move-exception
            r3 = 1
            r1 = r0
            r2 = r7
        L_0x0556:
            com.mobisec.upos.MainActivity.g2 = r3
        L_0x0558:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobisec.upos.FC.checkFlag(android.content.Context, java.lang.String):boolean");
    }

    private static String h(String flag) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(flag.getBytes());
            return th(md.digest());
        } catch (Exception e) {
            return null;
        }
    }

    public static String th(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 255);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r2 != 256) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        throw new java.lang.Exception("error");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void lm(long[][] r14) throws java.lang.Exception {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x005a }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x005a }
            android.content.Context r3 = ctx     // Catch:{ all -> 0x005a }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "lotto.dat"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ all -> 0x005a }
            r2.<init>(r3)     // Catch:{ all -> 0x005a }
            r1.<init>(r2)     // Catch:{ all -> 0x005a }
            r0 = r1
            r1 = 0
            r2 = r1
        L_0x001a:
            java.lang.String r3 = r0.readLine()     // Catch:{ all -> 0x005a }
            r4 = r3
            java.lang.String r5 = "error"
            r6 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = " "
            java.lang.String[] r3 = r4.split(r3)     // Catch:{ all -> 0x005a }
            r7 = 0
            int r8 = r3.length     // Catch:{ all -> 0x005a }
            r9 = r7
            r7 = 0
        L_0x002f:
            if (r7 >= r8) goto L_0x0041
            r10 = r3[r7]     // Catch:{ all -> 0x005a }
            long r11 = java.lang.Long.parseLong(r10)     // Catch:{ all -> 0x005a }
            r13 = r14[r2]     // Catch:{ all -> 0x005a }
            r13[r9] = r11     // Catch:{ all -> 0x005a }
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0041:
            if (r9 != r6) goto L_0x0047
            int r2 = r2 + 1
            goto L_0x001a
        L_0x0047:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x005a }
            r1.<init>(r5)     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x004d:
            if (r2 != r6) goto L_0x0054
            r0.close()
            return
        L_0x0054:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x005a }
            r1.<init>(r5)     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0060
            r0.close()
        L_0x0060:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobisec.upos.FC.lm(long[][]):void");
    }

    public static boolean ip(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String r(String s) {
        String out = BuildConfig.FLAVOR;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 's') {
                c = (char) (c + 7);
            } else if (c >= 'A' && c <= 'S') {
                c = (char) (c + 7);
            } else if (c >= 't' && c <= 'z') {
                c = (char) (c - 19);
            } else if (c >= 'T' && c <= 'Z') {
                c = (char) (c - 19);
            }
            out = out + c;
        }
        return out;
    }

    public static long sq(String a) {
        return (long) Math.pow(
            (double) ((a.charAt(0) + (a.charAt(1) << 8)) & SupportMenu.USER_MASK), 
            2.0d);
    }

    public static String dec(String x) {
        return new String(Base64.decode(x, 0));
    }

    public static String ec(String cmd) {
        String out = new String();
        try {
            InputStream stdout = Runtime.getRuntime().exec(cmd).getInputStream();
            byte[] buffer = new byte[102400];
            while (true) {
                int read = stdout.read(buffer);
                if (read > 0 && read <= 102400) {
                    out = out + new String(buffer, 0, read);
                } else if (stdout.available() <= 0) {
                    break;
                }
            }
            stdout.close();
        } catch (Exception e) {
        }
        return out;
    }
}
