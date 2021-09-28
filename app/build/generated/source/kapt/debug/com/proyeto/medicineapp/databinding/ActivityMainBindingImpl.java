package com.proyeto.medicineapp.databinding;
import com.proyeto.medicineapp.R;
import com.proyeto.medicineapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.proyeto.medicineapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recyclerViewList, 2);
        sViewsWithIds.put(R.id.emptyImage, 3);
        sViewsWithIds.put(R.id.emptyText, 4);
        sViewsWithIds.put(R.id.refresh, 5);
        sViewsWithIds.put(R.id.addButton, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            );
        this.logOut.setTag(null);
        this.mainLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.proyeto.medicineapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModelMain == variableId) {
            setViewModelMain((com.proyeto.medicineapp.ui.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelMain(@Nullable com.proyeto.medicineapp.ui.viewmodel.MainViewModel ViewModelMain) {
        this.mViewModelMain = ViewModelMain;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModelMain);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.proyeto.medicineapp.ui.viewmodel.MainViewModel viewModelMain = mViewModelMain;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.logOut.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModelMain
        com.proyeto.medicineapp.ui.viewmodel.MainViewModel viewModelMain = mViewModelMain;
        // viewModelMain != null
        boolean viewModelMainJavaLangObjectNull = false;



        viewModelMainJavaLangObjectNull = (viewModelMain) != (null);
        if (viewModelMainJavaLangObjectNull) {


            viewModelMain.logOut();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelMain
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}