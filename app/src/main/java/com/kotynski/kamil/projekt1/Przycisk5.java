package com.kotynski.kamil.projekt1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 20.03.2017.
 */

public class Przycisk5 extends AppCompatActivity {

    private ListView list1gg1;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.przycisk5);


        list1gg1 = (ListView) findViewById(R.id.lifgfg);

        RowBean RowBean_data[] = new RowBean[] {

                new RowBean(R.drawable.heart, "Mercedes"),
                new RowBean(R.drawable.home, "Volkswagen"),
                new RowBean(R.drawable.star, "BMW"),
                new RowBean(R.drawable.home, "Aston Martin"),
                new RowBean(R.drawable.heart, "Mercedes"),
                new RowBean(R.drawable.heart, "Volkswagen"),
                new RowBean(R.drawable.star, "BMW"),
                new RowBean(R.drawable.home, "Aston Martin"),
                new RowBean(R.drawable.home, "Mercedes"),
                new RowBean(R.drawable.star, "Volkswagen"),
                new RowBean(R.drawable.home, "BMW"),
                new RowBean(R.drawable.home, "Aston Martin"),
                new RowBean(R.drawable.star, "Mercedes"),
                new RowBean(R.drawable.home, "Volkswagen"),
                new RowBean(R.drawable.home, "BMW"),
                new RowBean(R.drawable.home, "Aston Martin")
        };

        RowAdapter adapter = new RowAdapter(this,
                R.layout.zdjecie, RowBean_data);

        list1gg1 = (ListView)findViewById(R.id.lifgfg);

        list1gg1.setAdapter(adapter);
    }
}