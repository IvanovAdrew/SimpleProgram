package com.example.simpleprogram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class NeArrayAdapter extends ArrayAdapter<Product> {

    public NeArrayAdapter( Context context,int resource, Product[] products) {
        super(context, resource,products);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(getContext());
        if (v == null) {
            v = inflater.inflate(R.layout.item_of_array,parent, false);
        }

        return v;
    }
}
