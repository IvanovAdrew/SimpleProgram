package com.example.simpleprogram;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class NeArrayAdapter extends ArrayAdapter<Product> {
    private ProductAmountChangesListener listener;
    HashMap array;

    public void setListener(ProductAmountChangesListener listener) {
        this.listener = listener;
    }

    public NeArrayAdapter(Context context, int resource, Product[] products, HashMap array) {
        super(context, resource, products);
        this.array=array;

    }
    interface ProductAmountChangesListener{
        void onChanged();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = LayoutInflater.from(getContext());
        ViewHolder vh;
        Product newItem = getItem(position);
        if (v == null) {
            v = inflater.inflate(R.layout.item_of_array, parent, false);
            vh = new ViewHolder(v, newItem);
            v.setTag(vh);
        } else {
            vh = (ViewHolder) (v.getTag());
        }
        vh.image1.setImageResource(newItem.getPhotoId());
        vh.name.setText(newItem.getName());
        String costProduct = "" + newItem.getCostOfProducts();
        vh.price.setText(costProduct);
        return v;
    }


    class ViewHolder implements View.OnClickListener {
        Product product;
        TextView price;
        TextView amount;
        TextView name;

        Button btnOrder;
        ImageView image1;
        ImageView decrease;
        ImageView increase;
        View relative;
        //int costOfAllInt;
        String costOfAllStr;


        public ViewHolder(View v, Product product) {
            this.product = product;
            this.amount = (TextView) v.findViewById(R.id.quantity);
            this.price = (TextView) v.findViewById(R.id.costOfCapuchino);
            this.name = (TextView) v.findViewById(R.id.name);
            this.btnOrder = (Button) v.findViewById(R.id.simple_button);
            this.image1 = (ImageView) v.findViewById(R.id.cupOfSomething);
            this.decrease = (ImageView) v.findViewById(R.id.decrease);
            this.increase = (ImageView) v.findViewById(R.id.increase);
            this.relative = v.findViewById(R.id.relative_layout);
            btnOrder.setOnClickListener(this);
            increase.setOnClickListener(this);
            decrease.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int amount = product.getQuantity();
            String stringOfAmount;
            switch (v.getId()) {
                case (R.id.simple_button):
                    amount++;
                    v.setVisibility(View.GONE);
                    this.relative.setVisibility(View.VISIBLE);
                    this.amount.setVisibility(View.VISIBLE);
                    this.decrease.setVisibility(View.VISIBLE);
                    this.increase.setVisibility(View.VISIBLE);
                    stringOfAmount = ""+amount;
                    this.amount.setText(stringOfAmount);
                    product.setCostOfAllInt(product.getCostOfAllInt()+product.getCostOfProducts());
                    break;

                case (R.id.increase):
                    amount--;
                    if (amount<1){
                        this.btnOrder.setVisibility(View.VISIBLE);
                        this.relative.setVisibility(View.GONE);
                        this.amount.setVisibility(View.GONE);
                        this.decrease.setVisibility(View.GONE);
                        this.increase.setVisibility(View.GONE);
                    }
                    product.setCostOfAllInt(product.getCostOfAllInt()-product.getCostOfProducts());
                    stringOfAmount = ""+amount;
                    this.amount.setText(stringOfAmount);
                    break;

                case (R.id.decrease):
                    amount++;
                    stringOfAmount = ""+amount;
                    this.amount.setText(stringOfAmount);
                    product.setCostOfAllInt(product.getCostOfAllInt()+product.getCostOfProducts());
                    break;

            }
            product.setQuantity(amount);
            notifyDataSetChanged();
            listener.onChanged();
        }
    }
}