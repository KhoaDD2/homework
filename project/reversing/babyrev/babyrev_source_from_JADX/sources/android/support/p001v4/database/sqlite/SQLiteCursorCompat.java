package android.support.p001v4.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import android.support.annotation.NonNull;

/* renamed from: android.support.v4.database.sqlite.SQLiteCursorCompat */
public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor cursor, boolean fillWindowForwardOnly) {
        if (Build.VERSION.SDK_INT >= 28) {
            cursor.setFillWindowForwardOnly(fillWindowForwardOnly);
        }
    }
}