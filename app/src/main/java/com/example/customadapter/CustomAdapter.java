package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {

    private ArrayList<String> arr;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<String> arr) {
        super(context, resource, arr);
        this.arr = arr;

    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //importing custom layout so that we can  access its component such as text view or image view
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_custom_adapter_layout, parent, false);
        TextView t = convertView.findViewById(R.id.tView);
        t.setText(getItem(position));
        return convertView;
    }
}
