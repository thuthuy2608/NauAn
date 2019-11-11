package com.vndaynauan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class DangnhapActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
    }
    public void manhinhchinh(View view){
        openActivity(ManhinhchinhActivity.class);
    }
}
