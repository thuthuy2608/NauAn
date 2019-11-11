package com.vndaynauan;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public void openActivity(Class target){

        Intent intent=new Intent(this,target);
        startActivity(intent);
    }
}
