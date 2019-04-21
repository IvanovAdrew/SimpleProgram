package com.example.simpleprogram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NeArrayAdapter extends ArrayAdapter<Product> {

    public NeArrayAdapter( Context context,int resource, Product[] products) {
        super(context, resource,products);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(getContext());
        ViewHolder vh;
        if (v == null) {
            v = inflater.inflate(R.layout.item_of_array,parent, false);
            vh = new ViewHolder(v);
            v.setTag(vh);
        } else{
            vh = (ViewHolder)(v.getTag());
        }
        Product newItem = getItem(position);
        vh.image1.setImageResource(newItem.getPhotoId());
        vh.name.setText(newItem.getName());
        //vh.price.setText(newItem.getCostOfProducts());
        return v;
    }
}
class ViewHolder{
    TextView price;
    TextView name;
    Button button1;
    ImageView image1;

    public ViewHolder(View v) {
        //this.price = (TextView)v.findViewById(R.id.costOfCapuchino);
        this.name = (TextView)v.findViewById(R.id.name);
        //this.button1 = (TextView)v.findViewById(R.id.costOfCapuchino);
        this.image1 = (ImageView) v.findViewById(R.id.cupOfSomething);
    }


}
