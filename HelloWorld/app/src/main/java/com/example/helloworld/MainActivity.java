package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1 = findViewById(R.id.tv1);

        tv1.setTextSize(30);

        final EditText et1 = findViewById(R.id.et1);



        et1.setText("what a wonderful world!");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.getText().toString());
            }
        });

        Switch sw1 = findViewById(R.id.sw1);



        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    tv1.setTextSize(40);
                }
                else {
                    tv1.setTextSize(30);
                }
            }
        });

        ImageView iv1 = findViewById(R.id.iv1);

        iv1.setImageResource(R.mipmap.ic_launcher);



    }




}
