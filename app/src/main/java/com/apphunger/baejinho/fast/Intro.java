package com.apphunger.baejinho.fast;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){

                finish();
                Intent intent = new Intent(Intro.this, Pet.class);
                startActivity(intent);
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000);

    }
}
