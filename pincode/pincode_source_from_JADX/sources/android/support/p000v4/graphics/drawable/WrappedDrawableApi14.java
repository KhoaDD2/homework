package android.support.p000v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;

/* renamed from: android.support.v4.graphics.drawable.WrappedDrawableApi14 */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private PorterDuff.Mode mCurrentMode;
    Drawable mDrawable;
    private boolean mMutated;
    DrawableWrapperState mState;

    WrappedDrawableApi14(@NonNull DrawableWrapperState state, @Nullable Resources res) {
        this.mState = state;
        updateLocalState(res);
    }

    WrappedDrawableApi14(@Nullable Drawable dr) {
        this.mState = mutateConstantState();
        setWrappedDrawable(dr);
    }

    private void updateLocalState(@Nullable Resources res) {
        DrawableWrapperState drawableWrapperState = this.mState;
        if (drawableWrapperState != null && drawableWrapperState.mDrawableState != null) {
            setWrappedDrawable(this.mState.mDrawableState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    public void draw(@NonNull Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.mDrawable.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        DrawableWrapperState drawableWrapperState = this.mState;
        return changingConfigurations | (drawableWrapperState != null ? drawableWrapperState.getChangingConfigurations() : 0) | this.mDrawable.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.mDrawable.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.mDrawable.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.mDrawable.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.mDrawable.setColorFilter(cf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.mState;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r2 = this;
            boolean r0 = r2.isCompatTintEnabled()
            if (r0 == 0) goto L_0x000d
            android.support.v4.graphics.drawable.WrappedDrawableApi14$DrawableWrapperState r0 = r2.mState
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.mTint
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isStateful()
            if (r1 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r1 = r2.mDrawable
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0020
        L_0x001e:
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p000v4.graphics.drawable.WrappedDrawableApi14.isStateful():boolean");
    }

    public boolean setState(@NonNull int[] stateSet) {
        return updateTint(stateSet) || this.mDrawable.setState(stateSet);
    }

    @NonNull
    public int[] getState() {
        return this.mDrawable.getState();
    }

    @NonNull
    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.mDrawable.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    public boolean getPadding(@NonNull Rect padding) {
        return this.mDrawable.getPadding(padding);
    }

    @RequiresApi(19)
    public void setAutoMirrored(boolean mirrored) {
        this.mDrawable.setAutoMirrored(mirrored);
    }

    @RequiresApi(19)
    public boolean isAutoMirrored() {
        return this.mDrawable.isAutoMirrored();
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        DrawableWrapperState drawableWrapperState = this.mState;
        if (drawableWrapperState == null || !drawableWrapperState.canConstantState()) {
            return null;
        }
        this.mState.mChangingConfigurations = getChangingConfigurations();
        return this.mState;
    }

    @NonNull
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState = mutateConstantState();
            Drawable drawable = this.mDrawable;
            if (drawable != null) {
                drawable.mutate();
            }
            DrawableWrapperState drawableWrapperState = this.mState;
            if (drawableWrapperState != null) {
                Drawable drawable2 = this.mDrawable;
                drawableWrapperState.mDrawableState = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.mMutated = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateBase(this.mState, (Resources) null);
    }

    public void invalidateDrawable(@NonNull Drawable who) {
        invalidateSelf();
    }

    public void scheduleDrawable(@NonNull Drawable who, @NonNull Runnable what, long when) {
        scheduleSelf(what, when);
    }

    public void unscheduleDrawable(@NonNull Drawable who, @NonNull Runnable what) {
        unscheduleSelf(what);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        return this.mDrawable.setLevel(level);
    }

    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    public void setTintList(ColorStateList tint) {
        this.mState.mTint = tint;
        updateTint(getState());
    }

    public void setTintMode(@NonNull PorterDuff.Mode tintMode) {
        this.mState.mTintMode = tintMode;
        updateTint(getState());
    }

    private boolean updateTint(int[] state) {
        if (!isCompatTintEnabled()) {
            return false;
        }
        ColorStateList tintList = this.mState.mTint;
        PorterDuff.Mode tintMode = this.mState.mTintMode;
        if (tintList == null || tintMode == null) {
            this.mColorFilterSet = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.mColorFilterSet && color == this.mCurrentColor && tintMode == this.mCurrentMode)) {
                setColorFilter(color, tintMode);
                this.mCurrentColor = color;
                this.mCurrentMode = tintMode;
                this.mColorFilterSet = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    public final void setWrappedDrawable(Drawable dr) {
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.mDrawable = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            DrawableWrapperState drawableWrapperState = this.mState;
            if (drawableWrapperState != null) {
                drawableWrapperState.mDrawableState = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean isCompatTintEnabled() {
        return true;
    }

    /* renamed from: android.support.v4.graphics.drawable.WrappedDrawableApi14$DrawableWrapperState */
    protected static abstract class DrawableWrapperState extends Drawable.ConstantState {
        int mChangingConfigurations;
        Drawable.ConstantState mDrawableState;
        ColorStateList mTint = null;
        PorterDuff.Mode mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;

        @NonNull
        public abstract Drawable newDrawable(@Nullable Resources resources);

        DrawableWrapperState(@Nullable DrawableWrapperState orig, @Nullable Resources res) {
            if (orig != null) {
                this.mChangingConfigurations = orig.mChangingConfigurations;
                this.mDrawableState = orig.mDrawableState;
                this.mTint = orig.mTint;
                this.mTintMode = orig.mTintMode;
            }
        }

        @NonNull
        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public int getChangingConfigurations() {
            int i = this.mChangingConfigurations;
            Drawable.ConstantState constantState = this.mDrawableState;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        public boolean canConstantState() {
            return this.mDrawableState != null;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.WrappedDrawableApi14$DrawableWrapperStateBase */
    private static class DrawableWrapperStateBase extends DrawableWrapperState {
        DrawableWrapperStateBase(@Nullable DrawableWrapperState orig, @Nullable Resources res) {
            super(orig, res);
        }

        @NonNull
        public Drawable newDrawable(@Nullable Resources res) {
            return new WrappedDrawableApi14(this, res);
        }
    }
}
