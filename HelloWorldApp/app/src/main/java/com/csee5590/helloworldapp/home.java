package com.csee5590.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void LoginFlow(View v){
//        finish();
        Intent redirect = new Intent( this, MainActivity.class);
        startActivity(redirect);
//        finishActivity(1);
  //      finish();

    }
}
