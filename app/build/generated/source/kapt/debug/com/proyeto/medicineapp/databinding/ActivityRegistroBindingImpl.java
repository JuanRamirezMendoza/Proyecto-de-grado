package com.proyeto.medicineapp.databinding;
import com.proyeto.medicineapp.R;
import com.proyeto.medicineapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegistroBindingImpl extends ActivityRegistroBinding implements com.proyeto.medicineapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
        sViewsWithIds.put(R.id.correoRegistrarseTxtInput, 6);
        sViewsWithIds.put(R.id.contraseñaRegsitrarseTxtInput, 7);
        sViewsWithIds.put(R.id.contraseñaConfirmRegistrarseTxtInput, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener contraseAConfirmRegistrarseEdtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelRegistro.passwordConfirm.getValue()
            //         is viewModelRegistro.passwordConfirm.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(contraseAConfirmRegistrarseEdt);
            // localize variables for thread safety
            // viewModelRegistro.passwordConfirm != null
            boolean viewModelRegistroPasswordConfirmJavaLangObjectNull = false;
            // viewModelRegistro
            com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel viewModelRegistro = mViewModelRegistro;
            // viewModelRegistro != null
            boolean viewModelRegistroJavaLangObjectNull = false;
            // viewModelRegistro.passwordConfirm
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroPasswordConfirm = null;
            // viewModelRegistro.passwordConfirm.getValue()
            java.lang.String viewModelRegistroPasswordConfirmGetValue = null;



            viewModelRegistroJavaLangObjectNull = (viewModelRegistro) != (null);
            if (viewModelRegistroJavaLangObjectNull) {


                viewModelRegistroPasswordConfirm = viewModelRegistro.getPasswordConfirm();

                viewModelRegistroPasswordConfirmJavaLangObjectNull = (viewModelRegistroPasswordConfirm) != (null);
                if (viewModelRegistroPasswordConfirmJavaLangObjectNull) {




                    viewModelRegistroPasswordConfirm.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener contraseARegsitrarseEdtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelRegistro.password.getValue()
            //         is viewModelRegistro.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(contraseARegsitrarseEdt);
            // localize variables for thread safety
            // viewModelRegistro.password.getValue()
            java.lang.String viewModelRegistroPasswordGetValue = null;
            // viewModelRegistro
            com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel viewModelRegistro = mViewModelRegistro;
            // viewModelRegistro != null
            boolean viewModelRegistroJavaLangObjectNull = false;
            // viewModelRegistro.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroPassword = null;
            // viewModelRegistro.password != null
            boolean viewModelRegistroPasswordJavaLangObjectNull = false;



            viewModelRegistroJavaLangObjectNull = (viewModelRegistro) != (null);
            if (viewModelRegistroJavaLangObjectNull) {


                viewModelRegistroPassword = viewModelRegistro.getPassword();

                viewModelRegistroPasswordJavaLangObjectNull = (viewModelRegistroPassword) != (null);
                if (viewModelRegistroPasswordJavaLangObjectNull) {




                    viewModelRegistroPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener correoRegistrarseEdtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModelRegistro.email.getValue()
            //         is viewModelRegistro.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(correoRegistrarseEdt);
            // localize variables for thread safety
            // viewModelRegistro.email
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroEmail = null;
            // viewModelRegistro.email != null
            boolean viewModelRegistroEmailJavaLangObjectNull = false;
            // viewModelRegistro
            com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel viewModelRegistro = mViewModelRegistro;
            // viewModelRegistro != null
            boolean viewModelRegistroJavaLangObjectNull = false;
            // viewModelRegistro.email.getValue()
            java.lang.String viewModelRegistroEmailGetValue = null;



            viewModelRegistroJavaLangObjectNull = (viewModelRegistro) != (null);
            if (viewModelRegistroJavaLangObjectNull) {


                viewModelRegistroEmail = viewModelRegistro.getEmail();

                viewModelRegistroEmailJavaLangObjectNull = (viewModelRegistroEmail) != (null);
                if (viewModelRegistroEmailJavaLangObjectNull) {




                    viewModelRegistroEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityRegistroBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityRegistroBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.Button) bindings[4]
            );
        this.contraseAConfirmRegistrarseEdt.setTag(null);
        this.contraseARegsitrarseEdt.setTag(null);
        this.correoRegistrarseEdt.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.registrarseConfirmButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.proyeto.medicineapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.viewModelRegistro == variableId) {
            setViewModelRegistro((com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelRegistro(@Nullable com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel ViewModelRegistro) {
        this.mViewModelRegistro = ViewModelRegistro;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModelRegistro);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRegistroEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelRegistroPasswordConfirm((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelRegistroPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRegistroEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelRegistroEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRegistroPasswordConfirm(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelRegistroPasswordConfirm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRegistroPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelRegistroPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroEmail = null;
        com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel viewModelRegistro = mViewModelRegistro;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroPasswordConfirm = null;
        java.lang.String viewModelRegistroPasswordGetValue = null;
        java.lang.String viewModelRegistroEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRegistroPassword = null;
        java.lang.String viewModelRegistroPasswordConfirmGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModelRegistro != null) {
                        // read viewModelRegistro.email
                        viewModelRegistroEmail = viewModelRegistro.getEmail();
                    }
                    updateLiveDataRegistration(0, viewModelRegistroEmail);


                    if (viewModelRegistroEmail != null) {
                        // read viewModelRegistro.email.getValue()
                        viewModelRegistroEmailGetValue = viewModelRegistroEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModelRegistro != null) {
                        // read viewModelRegistro.passwordConfirm
                        viewModelRegistroPasswordConfirm = viewModelRegistro.getPasswordConfirm();
                    }
                    updateLiveDataRegistration(1, viewModelRegistroPasswordConfirm);


                    if (viewModelRegistroPasswordConfirm != null) {
                        // read viewModelRegistro.passwordConfirm.getValue()
                        viewModelRegistroPasswordConfirmGetValue = viewModelRegistroPasswordConfirm.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModelRegistro != null) {
                        // read viewModelRegistro.password
                        viewModelRegistroPassword = viewModelRegistro.getPassword();
                    }
                    updateLiveDataRegistration(2, viewModelRegistroPassword);


                    if (viewModelRegistroPassword != null) {
                        // read viewModelRegistro.password.getValue()
                        viewModelRegistroPasswordGetValue = viewModelRegistroPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contraseAConfirmRegistrarseEdt, viewModelRegistroPasswordConfirmGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.contraseAConfirmRegistrarseEdt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, contraseAConfirmRegistrarseEdtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.contraseARegsitrarseEdt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, contraseARegsitrarseEdtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.correoRegistrarseEdt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, correoRegistrarseEdtandroidTextAttrChanged);
            this.registrarseConfirmButton.setOnClickListener(mCallback5);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contraseARegsitrarseEdt, viewModelRegistroPasswordGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.correoRegistrarseEdt, viewModelRegistroEmailGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModelRegistro
        com.proyeto.medicineapp.ui.viewmodel.RegisterViewModel viewModelRegistro = mViewModelRegistro;
        // viewModelRegistro != null
        boolean viewModelRegistroJavaLangObjectNull = false;



        viewModelRegistroJavaLangObjectNull = (viewModelRegistro) != (null);
        if (viewModelRegistroJavaLangObjectNull) {


            viewModelRegistro.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelRegistro.email
        flag 1 (0x2L): viewModelRegistro.passwordConfirm
        flag 2 (0x3L): viewModelRegistro.password
        flag 3 (0x4L): viewModelRegistro
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}