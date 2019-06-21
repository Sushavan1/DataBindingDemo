package com.rtllabs.databindingdemo.modal;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.rtllabs.databindingdemo.BR;

import java.io.Serializable;

public class User extends BaseObservable implements Serializable {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }
}
