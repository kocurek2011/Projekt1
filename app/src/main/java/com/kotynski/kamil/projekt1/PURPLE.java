package com.kotynski.kamil.projekt1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by student on 07.03.2017.
 */

public class PURPLE extends AppCompatActivity {


    Button przycisk6, przycisk7, przycisk8;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purple);
        przycisk6 = (Button) findViewById(R.id.clock);
    }
}
