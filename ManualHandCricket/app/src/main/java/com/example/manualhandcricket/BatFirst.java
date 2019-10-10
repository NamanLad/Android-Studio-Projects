package com.example.manualhandcricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BatFirst extends AppCompatActivity {


    TextView code_tv_choice;

    Button code_again;
    Button code_gotoBat;

    boolean batFirst = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bat_first);


        code_tv_choice = (TextView) findViewById(R.id.des_tv_choice);

        code_again = (Button) findViewById(R.id.des_btn_again);
        code_gotoBat = (Button) findViewById(R.id.des_btn_gotoBat);


        Intent intentBat = getIntent();
        int counter = intentBat.getIntExtra("WinOrLose", -1);
        if(counter == 1)
        {
            code_tv_choice.setText("You Won the Toss and");
        }
        else if(counter == 0)
        {
            code_tv_choice.setText("Your Opponent elected to Bowl First");
        }



        code_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(BatFirst.this, Toss.class);
                startActivity(back);
            }
        });


        code_gotoBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotoBat = new Intent(BatFirst.this, MainActivity.class);

                gotoBat.putExtra("Boolean", batFirst);

                startActivity(gotoBat);

            }
        });


    }
}
