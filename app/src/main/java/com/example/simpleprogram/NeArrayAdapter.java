package com.example.simpleprogram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class NeArrayAdapter extends ArrayAdapter<String> {

    public NeArrayAdapter( Context context, int resource) {
        super(context, resource);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        if (v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.item_of_array,parent, false);
        }

        return(v);
    }
}
