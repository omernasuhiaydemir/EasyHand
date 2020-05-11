package com.app.easyhand;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Egzersiz_1 extends AppCompatActivity {



    Button geri_button, örnek_button, button_1, button_2, button_3, button_4;

    TextView saniye_textview, tur_text_view;

    Context context = this;

    int tur = 0;

    private long then;
    private int longClickDuration = 5000;


    LinearLayout layout_1, layout_2, layout_3, layout_4;

    ProgressBar spinner_1, spinner_2, spinner_3, spinner_4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.egzersiz_1);



        layout_1 = findViewById(R.id.layout_1);
        layout_2 = findViewById(R.id.layout_2);
        layout_3 = findViewById(R.id.layout_3);
        layout_4 = findViewById(R.id.layout_4);


        örnek_button = findViewById(R.id.örnek_button);
        button_1 = findViewById(R.id.buton_1);
        button_2 = findViewById(R.id.buton_2);
        button_3 = findViewById(R.id.buton_3);
        button_4 = findViewById(R.id.buton_4);
        tur_text_view = findViewById(R.id.tur_textview);


        saniye_textview = findViewById(R.id.saniye_textview);


        layout_1.setVisibility(View.INVISIBLE);
        layout_2.setVisibility(View.INVISIBLE);
        layout_3.setVisibility(View.INVISIBLE);

        spinner_1 = findViewById(R.id.progressBar1);
        spinner_2 = findViewById(R.id.progressBar2);
        spinner_3 = findViewById(R.id.progressBar3);
        spinner_4 = findViewById(R.id.progressBar4);

        spinner_1.setVisibility(View.INVISIBLE);
        spinner_2.setVisibility(View.INVISIBLE);
        spinner_3.setVisibility(View.INVISIBLE);
        spinner_4.setVisibility(View.INVISIBLE);







        örnek_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i = new Intent(getApplicationContext(),Gif.class);
                startActivity(i);

            }
        });




        button_1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    saniye_textview.setText("Dokunmaya devam et!");
                    spinner_1.setVisibility(View.VISIBLE);
                    spinner_2.setVisibility(View.INVISIBLE);
                    spinner_3.setVisibility(View.INVISIBLE);
                    spinner_4.setVisibility(View.INVISIBLE);







                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            layout_1.setVisibility(View.INVISIBLE);
                            layout_2.setVisibility(View.INVISIBLE);
                            layout_3.setVisibility(View.INVISIBLE);
                            layout_4.setVisibility(View.VISIBLE);




                            Vibrator vibrator = (Vibrator) Egzersiz_1.this.getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(50);

                            tur ++;

                            tur_text_view.setText(String.valueOf(tur));


                            if (tur == 10){


                                AlertDialog.Builder builder = new AlertDialog.Builder(Egzersiz_1.this);
                                builder.setTitle("Tebrikler!");
                                builder.setMessage("Egzersizi başarıyla bitirdin.");
                                builder.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                        Intent intent = new Intent(getApplicationContext(),AnaSayfa.class);
                                        startActivity(intent);


                                    }
                                });
                                builder.show();

                            }




                            saniye_textview.setText("Serçe parmağın ile butona dokun!");                    }
                    }, 5000);



                    then = (long) System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if ((System.currentTimeMillis() - then) > longClickDuration) {









                        System.out.println("Long Click has happened!");
                        return false;
                    } else {


                        saniye_textview.setText("Tamamlamak için devam etmelisin!");




                        System.out.println("Short Click has happened...");
                        return false;
                    }
                }
                return true;
            }
        });




        button_2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    saniye_textview.setText("Dokunmaya devam et!");

                    spinner_1.setVisibility(View.INVISIBLE);
                    spinner_2.setVisibility(View.VISIBLE);
                    spinner_3.setVisibility(View.INVISIBLE);
                    spinner_4.setVisibility(View.INVISIBLE);




                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                             layout_1.setVisibility(View.VISIBLE);
                             layout_2.setVisibility(View.INVISIBLE);
                             layout_3.setVisibility(View.INVISIBLE);
                             layout_4.setVisibility(View.INVISIBLE);


                            Vibrator vibrator = (Vibrator) Egzersiz_1.this.getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(50);

                            saniye_textview.setText("İşaret parmağın ile butona dokun!");                    }
                    }, 5000);



                    then = (long) System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if ((System.currentTimeMillis() - then) > longClickDuration) {









                        System.out.println("Long Click has happened!");
                        return false;
                    } else {


                        saniye_textview.setText("Tamamlamak için devam etmelisin!");




                        System.out.println("Short Click has happened...");
                        return false;
                    }
                }
                return true;
            }
        });





        button_3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    saniye_textview.setText("Dokunmaya devam et!");


                    spinner_1.setVisibility(View.INVISIBLE);
                    spinner_2.setVisibility(View.INVISIBLE);
                    spinner_3.setVisibility(View.VISIBLE);
                    spinner_4.setVisibility(View.INVISIBLE);




                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                             layout_1.setVisibility(View.INVISIBLE);
                             layout_2.setVisibility(View.VISIBLE);
                             layout_3.setVisibility(View.INVISIBLE);
                             layout_4.setVisibility(View.INVISIBLE);


                            Vibrator vibrator = (Vibrator) Egzersiz_1.this.getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(50);

                            saniye_textview.setText("Orta parmağın ile butona dokun!");                    }
                    }, 5000);



                    then = (long) System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if ((System.currentTimeMillis() - then) > longClickDuration) {









                        System.out.println("Long Click has happened!");
                        return false;
                    } else {


                        saniye_textview.setText("Tamamlamak için devam etmelisin!");




                        System.out.println("Short Click has happened...");
                        return false;
                    }
                }
                return true;
            }
        });




        button_4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {


                    saniye_textview.setText("Dokunmaya devam et!");


                    spinner_1.setVisibility(View.INVISIBLE);
                    spinner_2.setVisibility(View.INVISIBLE);
                    spinner_3.setVisibility(View.INVISIBLE);
                    spinner_4.setVisibility(View.VISIBLE);




                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override
                        public void run() {

                             layout_1.setVisibility(View.INVISIBLE);
                             layout_2.setVisibility(View.INVISIBLE);
                             layout_3.setVisibility(View.VISIBLE);
                             layout_4.setVisibility(View.INVISIBLE);

                            Vibrator vibrator = (Vibrator) Egzersiz_1.this.getSystemService(Context.VIBRATOR_SERVICE);
                            vibrator.vibrate(50);


                            saniye_textview.setText("Yüzük parmağın ile butona dokun!");                    }
                    }, 5000);



                    then = (long) System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if ((System.currentTimeMillis() - then) > longClickDuration) {









                        System.out.println("Long Click has happened!");
                        return false;
                    } else {


                        saniye_textview.setText("Tamamlamak için devam etmelisin!");




                        System.out.println("Short Click has happened...");
                        return false;
                    }
                }
                return true;
            }
        });






    }


}
