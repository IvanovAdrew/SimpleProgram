package com.example.simpleprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int newFeature=67;
    int tooNewFeature=68;
    int howMuchOreder;
    int costOfCapuchino=34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String randomProducts[] = {"capuchino","mocha1","mocha2"};
        ListView listOfCappuchino = (ListView)findViewById(R.id.listView);
        NeArrayAdapter adapter= new NeArrayAdapter(this,R.layout.item_of_array);
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
