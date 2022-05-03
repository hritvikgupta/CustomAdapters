package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

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

        //This is Usual Adapter
        //ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, des);

        // Now Creating the custom adapter
        CustomAdapter ad = new CustomAdapter(this, R.layout.my_custom_adapter_layout,des);
        lsview.setAdapter(ad);
    }



}