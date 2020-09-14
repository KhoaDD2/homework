package android.support.p001v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v4.graphics.TypefaceCompatUtil */
public class TypefaceCompatUtil {
    private static final String CACHE_FILE_PREFIX = ".font";
    private static final String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
    }

    @Nullable
    public static File getTempFile(Context context) {
        String prefix = CACHE_FILE_PREFIX + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(context.getCacheDir(), prefix + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException e) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r8 = r3;
        r3 = r2;
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r3 = null;
     */
    @android.support.annotation.Nullable
    @android.support.annotation.RequiresApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer mmap(java.io.File r9) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d }
            r1.<init>(r9)     // Catch:{ IOException -> 0x003d }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            long r6 = r2.size()     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            r4 = 0
            java.nio.MappedByteBuffer r3 = r2.map(r3, r4, r6)     // Catch:{ Throwable -> 0x0020, all -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x003d }
            return r3
        L_0x001d:
            r2 = move-exception
            r3 = r0
            goto L_0x0027
        L_0x0020:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
        L_0x0027:
            if (r3 == 0) goto L_0x0036
            r1.close()     // Catch:{ Throwable -> 0x0030 }
            goto L_0x003a
        L_0x0030:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ IOException -> 0x003d }
            goto L_0x003a
        L_0x0036:
            r1.close()     // Catch:{ IOException -> 0x003d }
        L_0x003a:
            throw r2     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r1 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.graphics.TypefaceCompatUtil.mmap(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r10 = r5;
        r5 = r4;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
        r10 = r4;
        r4 = r3;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r4 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0072, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r4.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0078, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[ExcHandler: all (th java.lang.Throwable)] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006b  */
    @android.support.annotation.Nullable
    @android.support.annotation.RequiresApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer mmap(android.content.Context r11, android.os.CancellationSignal r12, android.net.Uri r13) {
        /*
            android.content.ContentResolver r0 = r11.getContentResolver()
            r1 = 0
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r2 = r0.openFileDescriptor(r13, r2, r12)     // Catch:{ IOException -> 0x007f }
            if (r2 != 0) goto L_0x0014
            if (r2 == 0) goto L_0x0013
            r2.close()     // Catch:{ IOException -> 0x007f }
        L_0x0013:
            return r1
        L_0x0014:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            java.io.FileDescriptor r4 = r2.getFileDescriptor()     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            long r8 = r4.size()     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            r6 = 0
            java.nio.MappedByteBuffer r5 = r4.map(r5, r6, r8)     // Catch:{ Throwable -> 0x0040, all -> 0x003d }
            r3.close()     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException -> 0x007f }
        L_0x003a:
            return r5
        L_0x003d:
            r4 = move-exception
            r5 = r1
            goto L_0x0047
        L_0x0040:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r5 = move-exception
            r10 = r5
            r5 = r4
            r4 = r10
        L_0x0047:
            if (r5 == 0) goto L_0x0056
            r3.close()     // Catch:{ Throwable -> 0x0050, all -> 0x005d }
            goto L_0x005a
        L_0x0050:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
            goto L_0x005a
        L_0x0056:
            r3.close()     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
        L_0x005a:
            throw r4     // Catch:{ Throwable -> 0x0060, all -> 0x005d }
        L_0x005d:
            r3 = move-exception
            r4 = r1
            goto L_0x0067
        L_0x0060:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r4 = move-exception
            r10 = r4
            r4 = r3
            r3 = r10
        L_0x0067:
            if (r2 == 0) goto L_0x007c
            if (r4 == 0) goto L_0x0078
            r2.close()     // Catch:{ Throwable -> 0x0072 }
            goto L_0x007c
        L_0x0072:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x007f }
            goto L_0x007c
        L_0x0078:
            r2.close()     // Catch:{ IOException -> 0x007f }
        L_0x007c:
            throw r3     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            r2 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.graphics.TypefaceCompatUtil.mmap(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    @Nullable
    @RequiresApi(19)
    public static ByteBuffer copyToDirectBuffer(Context context, Resources res, int id) {
        File tmpFile = getTempFile(context);
        ByteBuffer byteBuffer = null;
        if (tmpFile == null) {
            return null;
        }
        try {
            if (copyToFile(tmpFile, res, id)) {
                byteBuffer = mmap(tmpFile);
            }
            return byteBuffer;
        } finally {
            tmpFile.delete();
        }
    }

    public static boolean copyToFile(File file, InputStream is) {
        FileOutputStream os = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        try {
            os = new FileOutputStream(file, false);
            byte[] buffer = new byte[1024];
            while (true) {
                int read = is.read(buffer);
                int readLen = read;
                if (read != -1) {
                    os.write(buffer, 0, readLen);
                } else {
                    return true;
                }
            }
        } catch (IOException e) {
            Log.e(TAG, "Error copying resource contents to temp file: " + e.getMessage());
            return false;
        } finally {
            closeQuietly(os);
            StrictMode.setThreadPolicy(old);
        }
    }

    public static boolean copyToFile(File file, Resources res, int id) {
        InputStream is = null;
        try {
            is = res.openRawResource(id);
            return copyToFile(file, is);
        } finally {
            closeQuietly(is);
        }
    }

    public static void closeQuietly(Closeable c) {
        if (c != null) {
            try {
                c.close();
            } catch (IOException e) {
            }
        }
    }
}
