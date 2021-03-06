package com.example.simpleprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView costOfAll;
    String costOfAllStr;
    Product[] products =new Product[5];
    HashMap<Integer,Product> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        products[0]=new Product("Capuchino",67,R.drawable.ic_capuccino);
        products[1]=new Product("Americano",56,R.drawable.americano);
        products[2]=new Product("Coffe",78,R.drawable.expresso);
        products[3]=new Product("Flat_white",79,R.drawable.flat_white);
        products[4]=new Product("Mocha",56,R.drawable.mocha);
        Integer[] arrayInt=new Integer[5];
        for(int i =0;i<5;i++){

            array.put(arrayInt[i],products[i]);
        }
        ListView listOfCappuchino = (ListView)findViewById(R.id.listView);
        costOfAll=(TextView)findViewById(R.id.TotalAmount);
        NeArrayAdapter adapter= new NeArrayAdapter(this,android.R.layout.simple_list_item_1,products,array);
        adapter.setListener(new NeArrayAdapter.ProductAmountChangesListener() {
            @Override
            public void onChanged() {
                updateElement();
            }
        });
        listOfCappuchino.setAdapter(adapter);
    }
    private void updateElement(){
        for (Product product : products) {
                costOfAllStr = "" + product.getCostOfAllInt();
                costOfAll.setText(costOfAllStr);
                break;
            }
        }
    }
