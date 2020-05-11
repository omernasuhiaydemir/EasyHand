package com.app.easyhand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

public class Egzersiz2 extends AppCompatActivity {



     SeekBar seek_bar_1, seek_bar_2 ;
     private int progress1_int, progress2_int = 0;

     Boolean biri_kaydır, ikiyi_kaydır = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.egzersiz_2);



        seek_bar_1= findViewById(R.id.seek_bar_1);
        seek_bar_2= findViewById(R.id.seek_bar_2);


        seek_bar_1.setRotation(125);
        seek_bar_2.setRotation(-55);



        seek_bar_1.setMax(100);
        seek_bar_1.setMax(100);

        seek_bar_1.setProgress(0);
        seek_bar_2.setProgress(0);





        seek_bar_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {




            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress1,
                                          boolean fromUser) {










                Log.v("değer", String.valueOf(progress1));



            }
        });


        seek_bar_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {




            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress2,
                                          boolean fromUser) {

                Log.v("değer", String.valueOf(progress2));

            }
        });

    }
}
