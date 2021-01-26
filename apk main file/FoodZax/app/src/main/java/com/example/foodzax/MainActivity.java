package com.example.foodzax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button button;      //**********

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);    //***********
        button.setOnClickListener(new View.OnClickListener() {  //*************
            @Override
            public void onClick(View v) {
                namaste();                      //***************
            }
        });
    }
    public void namaste()   //**************
    {
        Intent intent = new Intent(this,All_Dishes.class);  //***********
        startActivity(intent);      //**********************
    }

}