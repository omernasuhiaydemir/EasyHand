package com.app.easyhand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AnaSayfa extends AppCompatActivity {



    LinearLayout egzersiz_1,egzersiz_2,egzersiz_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        egzersiz_1 = findViewById(R.id.egzersiz_1_button);
        egzersiz_2 = findViewById(R.id.egzersiz_2_button);

        egzersiz_3 = findViewById(R.id.egzersiz_3_button);





        egzersiz_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(),Egzersiz_1.class);
                startActivity(i);


            }
        });


        egzersiz_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Egzersiz2.class);
                startActivity(i);


            }
        });


        egzersiz_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Egzersiz3.class);
                startActivity(i);


            }
        });


    }
}
