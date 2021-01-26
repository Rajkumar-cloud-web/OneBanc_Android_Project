package com.example.foodzax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NorthIndianFood extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_indian_food);
        //****************************************************************
        button1 = (Button) findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage();
            }
        });
        //*******************************************************************
        button1 = (Button) findViewById(R.id.button9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage1();
            }
        });
        //***********************************************************************
        button1 = (Button) findViewById(R.id.button10);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage2();
            }
        });
        //******************************************************************************
        button1 = (Button) findViewById(R.id.button11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage3();
            }
        });
        //************************************************************************
        button1 = (Button) findViewById(R.id.button12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage4();
            }
        });
        //*******************************************************************************
        button1 = (Button) findViewById(R.id.button13);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage5();
            }
        });
        //********************************************************************
        button1 = (Button) findViewById(R.id.button14);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage6();
            }
        });
        //****************

    }
    public void cartPage(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //******************************************************************************
    public void cartPage1(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*************************************************************************************
    public void cartPage2(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //******************************************************************************************
    public void cartPage3(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //********************************************************************************
    public void cartPage4(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*************************************************************************************
    public void cartPage5(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //**********************************************************************************
    public void cartPage6(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
}