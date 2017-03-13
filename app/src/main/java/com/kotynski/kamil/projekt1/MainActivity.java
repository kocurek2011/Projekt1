package com.kotynski.kamil.projekt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button przycisk1, przycisk2, przycisk3, przycisk4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        przycisk1 = (Button) findViewById(R.id.buttonblue);
        przycisk2 = (Button) findViewById(R.id.buttonred);
        przycisk3 = (Button) findViewById(R.id.buttonpurple);
        przycisk4 = (Button) findViewById(R.id.buttonyellow);

        przycisk1.setOnClickListener(new View.OnClickListener() {

        @Override
                public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Blue.class);
            startActivity(i);
        }

    });
        przycisk2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RED.class);
                startActivity(i);
            }

        });
        przycisk3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PURPLE.class);
                startActivity(i);
            }

        });
        przycisk4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), YELLOW.class);
                startActivity(i);
            }

        });
    }
}
