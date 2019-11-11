package com.vndaynauan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ManhinhChao extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchao);


        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                try{
                    Thread.sleep(2500);

                }catch (Exception e){

                }finally {
                    openActivity(LoginActivity.class);
                }

            }
        });
        thread.start();
    }
    public void Login(View view){
        openActivity(LoginActivity.class);
    }
}
