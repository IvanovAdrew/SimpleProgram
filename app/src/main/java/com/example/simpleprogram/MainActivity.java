package com.example.simpleprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int howMuchOreder;
    int costOfCapuchino=34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textViewOfTotalAmount = (TextView) findViewById(R.id.TotalAmount);
                howMuchOreder+=costOfCapuchino;
                String howMuchOrederReal = ""+howMuchOreder;
                textViewOfTotalAmount.setText(howMuchOrederReal);
            }
        });
    }
   /* public void ordering(View view){
        TextView textViewOfTotalAmount = (TextView) findViewById(R.id.TotalAmount);
        howMuchOreder+=costOfCapuchino;
        textViewOfTotalAmount.setText(howMuchOreder);
    }*/
}
