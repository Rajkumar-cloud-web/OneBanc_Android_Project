package com.example.foodzax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class All_Dishes extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__dishes);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSecoundPage1();
            }
        });

        //***************************************************************
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSecoundPage2();
            }
        });
        //***********************************************************************
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSecoundPage3();
            }
        });
        //******************************************************************************
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSecoundPage4();
            }
        });
        //******************************************************************************
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSecoundPage5();
            }
        });
        //***************************************************************************************
    }
    public void buttonSecoundPage1(){
        Intent intent =new Intent(this,NorthIndianFood.class);
        startActivity(intent);
    }
    //*********************************************************************************
    public void buttonSecoundPage2(){
        Intent intent =new Intent(this,ChineseFood.class);
        startActivity(intent);
    }
    //*********************************************************************************
    public void buttonSecoundPage3(){
        Intent intent =new Intent(this,ItalianFood.class);
        startActivity(intent);
    }
    //********************************************************************************
    public void buttonSecoundPage4(){
        Intent intent =new Intent(this,MediterraneanFood.class);
        startActivity(intent);
    }
    //**********************************************************************************
    public void buttonSecoundPage5(){
        Intent intent =new Intent(this,SouthIndianFood.class);
        startActivity(intent);
    }
    //**************************************************************************************
}