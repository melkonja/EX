package com.example.ex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ex2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ex2);
    }
    public void click2(View view){
        Intent intent=new Intent(ex2.this,ex3.class);
        startActivity(intent);
        finish();
    }
    public void click3(View view){
        Intent intent=new Intent(ex2.this,drinks2.class);
        startActivity(intent);
        finish();
    }
    public void click4(View view){
        Intent intent=new Intent(ex2.this,detergents2.class);
        startActivity(intent);
        finish();
    }

    public void click_cheese(View view){
        Intent intent=new Intent(ex2.this,cheese2.class);
        startActivity(intent);
        finish();
    }

}