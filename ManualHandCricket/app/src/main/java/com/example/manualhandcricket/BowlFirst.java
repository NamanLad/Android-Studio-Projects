package com.example.manualhandcricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BowlFirst extends AppCompatActivity {

    TextView code_tv_choice;

    Button code_again;
    Button code_gotoBowl;

    boolean batFirst = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowl_first);


        code_tv_choice = (TextView) findViewById(R.id.des_tv_choice);

        code_again = (Button) findViewById(R.id.des_btn_again);
        code_gotoBowl = (Button) findViewById(R.id.des_btn_gotoBowl);


        Intent intentLoss = getIntent();
        int counter = intentLoss.getIntExtra("WinOrLose", -1);

        if(counter == 1)
        {
            code_tv_choice.setText("You Won the Toss and");
        }
        else
        {
            code_tv_choice.setText("Your opponent has elected to Bat First");
        }

        code_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(BowlFirst.this, Toss.class);
                startActivity(back);
            }
        });


        code_gotoBowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gotoBowl = new Intent(BowlFirst.this, UserBowling.class);

                gotoBowl.putExtra("Boolean", batFirst);

                startActivity(gotoBowl);

            }
        });


    }
}
