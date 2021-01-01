package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int num =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn);

        btn1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                num = num + 1;
                if (num%7==0 && num != 0){
                    btn1.setText("BOOM!");

                }
               else {

                    btn1.setText("This is click number: " + num);
                }
            }
        });

    }
}