package com.rtllabs.databindingdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.rtllabs.databindingdemo.databinding.ActivityIncludedScreenBinding;
import com.rtllabs.databindingdemo.modal.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.view.View;

public class IncludedScreenActivity extends AppCompatActivity {
private ActivityIncludedScreenBinding activityIncludedScreenBinding;
private IncludedScreenActivityClickHandler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        User user=new User("Sushavan Das","Sushavan1@gmail.com");
        activityIncludedScreenBinding= DataBindingUtil.setContentView(this,R.layout.activity_included_screen);
        activityIncludedScreenBinding.setUser(user);
        handler=new IncludedScreenActivityClickHandler(this);
        activityIncludedScreenBinding.setOnClickHandler(handler);
    }

    public class IncludedScreenActivityClickHandler{
        Context context;
        public IncludedScreenActivityClickHandler(Context context) {
            this.context = context;
        }

        public void onClickHandlerfun(View view)
        {
            Intent intent=new Intent(IncludedScreenActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

}
