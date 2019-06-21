package com.rtllabs.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.rtllabs.databindingdemo.databinding.ActivityMainBinding;
import com.rtllabs.databindingdemo.modal.User;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        User user=new User("Sushavan Das","Sushavan1@gmail.com");
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setUser(user);
    }
}
