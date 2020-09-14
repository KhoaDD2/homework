package android.support.p000v7.app;

import android.support.annotation.Nullable;
import android.support.p000v7.view.ActionMode;

/* renamed from: android.support.v7.app.AppCompatCallback */
public interface AppCompatCallback {
    void onSupportActionModeFinished(ActionMode actionMode);

    void onSupportActionModeStarted(ActionMode actionMode);

    @Nullable
    ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback);
}
