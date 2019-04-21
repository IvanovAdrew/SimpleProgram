package com.example.simpleprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int howMuchOreder;
    int costOfCapuchino=34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Product[] product =new Product[3];
        product[0]=new Product("macha1",67,R.drawable.ic_capuccino);
        product[1]=new Product("macha2",56,R.drawable.ic_capuccino);
        product[2]=new Product("macha3",78,R.drawable.ic_capuccino);
        ListView listOfCappuchino = (ListView)findViewById(R.id.listView);
        NeArrayAdapter adapter= new NeArrayAdapter(this,android.R.layout.simple_list_item_1,product);
        listOfCappuchino.setAdapter(adapter);
        /*Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewOfTotalAmount = (TextView) findViewById(R.id.TotalAmount);
                howMuchOreder+=costOfCapuchino;
                String howMuchOrederReal = ""+howMuchOreder;
                textViewOfTotalAmount.setText(howMuchOrederReal);
            }
        });*/
    }

}
