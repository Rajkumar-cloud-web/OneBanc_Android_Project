package com.example.foodzax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItalianFood extends AppCompatActivity {

    private Button buttonItalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_food);

        buttonItalian = (Button) findViewById(R.id.button16);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage13();
            }
        });
        //*****************************************************
        buttonItalian = (Button) findViewById(R.id.button17);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage14();
            }
        });
        //************************************************************
        buttonItalian = (Button) findViewById(R.id.button18);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage15();
            }
        });
        //***************************************************************
        buttonItalian = (Button) findViewById(R.id.button19);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage16();
            }
        });
        //*******************************************************************
        buttonItalian = (Button) findViewById(R.id.button21);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage17();
            }
        });
        //******************************************************
        buttonItalian = (Button) findViewById(R.id.button20);
        buttonItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartPage18();
            }
        });
        //****************************************
    }
    public void cartPage13(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*****************************************************
    public void cartPage14(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //********************************************************
    public void cartPage15(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //*****************************************************************
    public void cartPage16(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //************************************************************************
    public void cartPage17(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //******************************************************
    public void cartPage18(){
        Intent intent =new Intent(this,Cart.class);
        startActivity(intent);
    }
    //******************************************************************
}