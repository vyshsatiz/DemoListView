package com.example.vyshalis.demolistview.complex;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vyshalis.demolistview.R;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate how to populate a complex ListView
 */

public class MainActivity extends AppCompatActivity {
    private List<Icecream> icecreams = new ArrayList<Icecream>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateIcecreamList();
    }
    private void populateIcecreamList() {
        icecreams.add(new Icecream("Vanilla", 1940, 0, "Available"));
    }
}
