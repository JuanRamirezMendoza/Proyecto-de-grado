package com.proyeto.medicineapp.databinding;
import com.proyeto.medicineapp.R;
import com.proyeto.medicineapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.proyeto.medicineapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.correoTxtInput, 6);
        sViewsWithIds.put(R.id.passwordTxtInput, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener correoEdtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelLogin.email.getValue()
            //         is viewModelLogin.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(correoEdt);
            // localize variables for thread safety
            // viewModelLogin.email
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLoginEmail = null;
            // viewModelLogin.email.getValue()
            java.lang.String viewModelLoginEmailGetValue = null;
            // viewModelLogin
            com.proyeto.medicineapp.ui.viewmodel.LoginViewModel viewModelLogin = mViewModelLogin;
            // viewModelLogin.email != null
            boolean viewModelLoginEmailJavaLangObjectNull = false;
            // viewModelLogin != null
            boolean viewModelLoginJavaLangObjectNull = false;



            viewModelLoginJavaLangObjectNull = (viewModelLogin) != (null);
            if (viewModelLoginJavaLangObjectNull) {


                viewModelLoginEmail = viewModelLogin.getEmail();

                viewModelLoginEmailJavaLangObjectNull = (viewModelLoginEmail) != (null);
                if (viewModelLoginEmailJavaLangObjectNull) {




                    viewModelLoginEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener passwordEdtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelLogin.password.getValue()
            //         is viewModelLogin.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(passwordEdt);
            // localize variables for thread safety
            // viewModelLogin
            com.proyeto.medicineapp.ui.viewmodel.LoginViewModel viewModelLogin = mViewModelLogin;
            // viewModelLogin.password != null
            boolean viewModelLoginPasswordJavaLangObjectNull = false;
            // viewModelLogin.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLoginPassword = null;
            // viewModelLogin.password.getValue()
            java.lang.String viewModelLoginPasswordGetValue = null;
            // viewModelLogin != null
            boolean viewModelLoginJavaLangObjectNull = false;



            viewModelLoginJavaLangObjectNull = (viewModelLogin) != (null);
            if (viewModelLoginJavaLangObjectNull) {


                viewModelLoginPassword = viewModelLogin.getPassword();

                viewModelLoginPasswordJavaLangObjectNull = (viewModelLoginPassword) != (null);
                if (viewModelLoginPasswordJavaLangObjectNull) {




                    viewModelLoginPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.Button) bindings[4]
            );
        this.correoEdt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.passwordEdt.setTag(null);
        this.registrarseButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.proyeto.medicineapp.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.proyeto.medicineapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModelLogin == variableId) {
            setViewModelLogin((com.proyeto.medicineapp.ui.viewmodel.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelLogin(@Nullable com.proyeto.medicineapp.ui.viewmodel.LoginViewModel ViewModelLogin) {
        this.mViewModelLogin = ViewModelLogin;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModelLogin);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoginEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelLoginPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoginEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLoginEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoginPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLoginPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String viewModelLoginEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLoginEmail = null;
        com.proyeto.medicineapp.ui.viewmodel.LoginViewModel viewModelLogin = mViewModelLogin;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLoginPassword = null;
        java.lang.String viewModelLoginPasswordGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModelLogin != null) {
                        // read viewModelLogin.email
                        viewModelLoginEmail = viewModelLogin.getEmail();
                    }
                    updateLiveDataRegistration(0, viewModelLoginEmail);


                    if (viewModelLoginEmail != null) {
                        // read viewModelLogin.email.getValue()
                        viewModelLoginEmailGetValue = viewModelLoginEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModelLogin != null) {
                        // read viewModelLogin.password
                        viewModelLoginPassword = viewModelLogin.getPassword();
                    }
                    updateLiveDataRegistration(1, viewModelLoginPassword);


                    if (viewModelLoginPassword != null) {
                        // read viewModelLogin.password.getValue()
                        viewModelLoginPasswordGetValue = viewModelLoginPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.correoEdt, viewModelLoginEmailGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.correoEdt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, correoEdtandroidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordEdt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordEdtandroidTextAttrChanged);
            this.registrarseButton.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordEdt, viewModelLoginPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModelLogin
                com.proyeto.medicineapp.ui.viewmodel.LoginViewModel viewModelLogin = mViewModelLogin;
                // viewModelLogin != null
                boolean viewModelLoginJavaLangObjectNull = false;



                viewModelLoginJavaLangObjectNull = (viewModelLogin) != (null);
                if (viewModelLoginJavaLangObjectNull) {


                    viewModelLogin.register();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModelLogin
                com.proyeto.medicineapp.ui.viewmodel.LoginViewModel viewModelLogin = mViewModelLogin;
                // viewModelLogin != null
                boolean viewModelLoginJavaLangObjectNull = false;



                viewModelLoginJavaLangObjectNull = (viewModelLogin) != (null);
                if (viewModelLoginJavaLangObjectNull) {


                    viewModelLogin.login();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelLogin.email
        flag 1 (0x2L): viewModelLogin.password
        flag 2 (0x3L): viewModelLogin
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}