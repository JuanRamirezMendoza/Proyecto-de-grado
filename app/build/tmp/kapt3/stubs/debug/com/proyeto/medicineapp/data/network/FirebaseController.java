package com.proyeto.medicineapp.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ*\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/proyeto/medicineapp/data/network/FirebaseController;", "", "()V", "instance", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "", "model", "Lcom/proyeto/medicineapp/data/model/LoginModel;", "success", "Lkotlin/Function0;", "error", "hasSession", "", "register", "Lcom/proyeto/medicineapp/data/model/RegisterModel;", "signOut", "mainModel", "Lcom/proyeto/medicineapp/data/model/MainModel;", "app_debug"})
public final class FirebaseController {
    private com.google.firebase.auth.FirebaseAuth instance;
    
    public final void auth(@org.jetbrains.annotations.NotNull()
    com.proyeto.medicineapp.data.model.LoginModel model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> error) {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    com.proyeto.medicineapp.data.model.RegisterModel model, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> error) {
    }
    
    public final boolean hasSession() {
        return false;
    }
    
    public final void signOut(@org.jetbrains.annotations.NotNull()
    com.proyeto.medicineapp.data.model.MainModel mainModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> error) {
    }
    
    public FirebaseController() {
        super();
    }
}