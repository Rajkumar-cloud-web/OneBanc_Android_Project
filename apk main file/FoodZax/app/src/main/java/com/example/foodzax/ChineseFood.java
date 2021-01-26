package com.example.foodzax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChineseFood extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food);

        button2 = (Button) findViewById(R.id.button25);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage7();
            }
        });
        //**********************************
        button2 = (Button) findViewById(R.id.button26);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage8();
            }
        });
        //**************************************************
        button2 = (Button) findViewById(R.id.button27);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage9();
            }
        });
        //*****************************************************
        button2 = (Button) findViewById(R.id.button28);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage10();
            }
        });
        //*****************************************
        button2 = (Button) findViewById(R.id.button29);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage11();
            }
        });
        //*************************************************
        button2 = (Button) findViewById(R.id.button30);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage12();
            }
        });

    }
    public void cartPage7(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //************************************
    public void cartPage8(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //**************************************
    public void cartPage9(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*************************************
    public void cartPage10(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //***********************************
    public void cartPage11(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*****************************************
    public void cartPage12(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
}