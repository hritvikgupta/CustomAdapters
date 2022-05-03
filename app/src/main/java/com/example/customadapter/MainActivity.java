package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


// In this file what we are doing is we are converting using list view in our main activity
// And then we have used custom adapter to make a new view for list items
// Adapter takes the view from the main activity and fix that into list and then shows
// Therefore here we have first created own custom adapters.
public class MainActivity extends AppCompatActivity {

    ListView lsview;
    ArrayList<String> des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsview = findViewById(R.id.lsview);
        des = new ArrayList<String>();
        des.add("This is item 1");
        des.add("This is item 2");
        des.add("This is item 3");
        des.add("This is item 4");
        des.add("This is item 5");
        des.add("This is item 6");
        des.add("This is item 7");
        des.add("This is item 8");
        des.add("This is item 9");
        des.add("This is item 10");


        //This is Usual Adapter
        //ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, des);

        // Now Creating the custom adapter
        CustomAdapter ad = new CustomAdapter(this, R.layout.my_custom_adapter_layout,des);
        lsview.setAdapter(ad);
    }



}