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
        Product[] product =new Product[5];
        product[0]=new Product("Capuchino",67,R.drawable.ic_capuccino);
        product[1]=new Product("Americano",56,R.drawable.americano);
        product[2]=new Product("Coffe",78,R.drawable.expresso);
        product[3]=new Product("Flat_white",79,R.drawable.flat_white);
        product[4]=new Product("Mocha",56,R.drawable.mocha);
        ListView listOfCappuchino = (ListView)findViewById(R.id.listView);
        TextView costOfAll=(TextView)findViewById(R.id.TotalAmount);
        NeArrayAdapter adapter= new NeArrayAdapter(this,android.R.layout.simple_list_item_1,product,costOfAll);
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
