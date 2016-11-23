package com.example.vyshalis.demolistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrate how to populate a complex ListView
 */

public class MainActivity extends AppCompatActivity {
    private List<Car> myCars = new ArrayList<Car>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateCarList();
        populateListView();
        registerClickCallback();
    }
    private void populateCarList() {
        myCars.add(new Car("Accent", R.drawable.accent, "Awesome"));
        myCars.add(new Car("Rapid", R.drawable.rapid, "Fast"));
        myCars.add(new Car("Verna", R.drawable.verna, "Good"));
        myCars.add(new Car("Innova", R.drawable.innova, "Superfast"));
        myCars.add(new Car("Hondacity", R.drawable.hondacity, "Supercool"));
        myCars.add(new Car("Ertiga", R.drawable.ertiga, "Speed"));
        myCars.add(new Car("Fortuner", R.drawable.fortuner, "Good"));
        myCars.add(new Car("Audi", R.drawable.audi, "Love"));
        myCars.add(new Car("Bmw", R.drawable.bmw, "Speed"));
        myCars.add(new Car("r8", R.drawable.r8, "Cool"));
        myCars.add(new Car("jaguar", R.drawable.jaguar, "Love"));
    }

    private void populateListView() {
        ArrayAdapter<Car> adapter = new MyListAdapter();
        ListView List = (ListView) findViewById(R.id.carsListView);
        List.setAdapter(adapter);
    }

    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.carsListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked,
                                    int position, long id) {
                Car clickedCar = myCars.get(position);
                String message = "You clicked position" + position
                        + "which is car make" + clickedCar.getMake();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

            }
        });
    }

    private class MyListAdapter extends ArrayAdapter<Car> {
        public MyListAdapter() {
            super(MainActivity.this, R.layout.item_view, myCars);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }
            //Find the car to work with.
            Car currentCar = myCars.get(position);

            //Fill the view
            ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
            imageView.setImageResource(currentCar.getIconID());


            //Condition;
            TextView conditionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
            conditionText.setText(currentCar.getCondition());

            return itemView;
        }

    }
}


