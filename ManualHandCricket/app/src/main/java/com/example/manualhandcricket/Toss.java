package com.example.manualhandcricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Toss extends AppCompatActivity {


    TextView code_tv_youChose;
    TextView code_tv_itis;
    TextView code_tv_wonlost;
    TextView code_tv_choose;


    Button code_btn_heads;
    Button code_btn_tails;
    Button code_btn_bat;
    Button code_btn_bowl;
    Button code_btn_next;

    int counter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toss);


        code_tv_youChose = (TextView) findViewById(R.id.des_tv_youChose);
        code_tv_itis = (TextView) findViewById(R.id.des_tv_itis);
        code_tv_wonlost = (TextView) findViewById(R.id.des_tv_wonlost);
        code_tv_choose = (TextView) findViewById(R.id.des_tv_choose);

        code_tv_choose.setVisibility(View.INVISIBLE);


        code_btn_heads = (Button) findViewById(R.id.des_btn_heads);
        code_btn_tails = (Button) findViewById(R.id.des_btn_tails);
        code_btn_bat = (Button) findViewById(R.id.des_btn_bat);
        code_btn_bowl = (Button) findViewById(R.id.des_btn_bowl);
        code_btn_next = (Button) findViewById(R.id.des_btn_next);

        code_btn_bat.setVisibility(View.INVISIBLE);
        code_btn_bowl.setVisibility(View.INVISIBLE);
        code_btn_next.setVisibility(View.GONE);




        code_btn_heads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char selected = 'H';
                code_tv_youChose.setText("You Chose Heads");

                char[] toss = {'H', 'T'};
                Random r = new Random();
                if(toss[r.nextInt(toss.length)] == 'H')
                {
                    System.out.println("Heads(Character Array)");
                    code_tv_itis.setText("It is Heads");
                    code_tv_wonlost.setText("You won the Toss!!!");
                    counter = 1;
                    winToss();
                }
                else
                {
                    System.out.println("Tails(Character Array)");
                    code_tv_itis.setText("It is Tails");
                    code_tv_wonlost.setText("You lost the Toss!!!");
                    counter = 0;
                    loseToss();
                }
            }
        });

        code_btn_tails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char selected = 'T';
                code_tv_youChose.setText("You Chose Tails");

                char[] toss = {'H', 'T'};
                Random r = new Random();
                if(toss[r.nextInt(toss.length)] == 'H')
                {
                    System.out.println("Heads(Character Array)");
                    code_tv_itis.setText("It is Heads");
                    code_tv_wonlost.setText("You lost the Toss!!!");
                    counter = 0;
                    loseToss();
                }
                else
                {
                    System.out.println("Tails(Character Array)");
                    code_tv_itis.setText("It is Tails");
                    code_tv_wonlost.setText("You won the Toss!!!");
                    counter = 1;
                    winToss();
                }
            }
        });



    }

    void winToss()
    {


        code_btn_heads.setVisibility(View.GONE);
        code_btn_tails.setVisibility(View.GONE);

        code_btn_bat.setVisibility(View.VISIBLE);
        code_btn_bowl.setVisibility(View.VISIBLE);
        code_tv_choose.setVisibility(View.VISIBLE);


        code_btn_bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBat = new Intent(Toss.this, BatFirst.class);
                intentBat.putExtra("WinOrLose", counter);
                startActivity(intentBat);
            }
        });

        code_btn_bowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBowl = new Intent(Toss.this, BowlFirst.class);
                intentBowl.putExtra("WinOrLose", counter);
                startActivity(intentBowl);
            }
        });


    }


    void loseToss()
    {

        code_btn_next.setVisibility(View.VISIBLE);
        code_btn_heads.setVisibility(View.GONE);
        code_btn_tails.setVisibility(View.GONE);
        code_btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                char[] k = {'T', 'L'};
                Random r = new Random();

                if(k[r.nextInt(k.length)] == 'T')
                {
                    Intent intentBowl = new Intent(Toss.this, BatFirst.class);
                    intentBowl.putExtra("WinOrLose", counter);
                    startActivity(intentBowl);
                }
                else
                {
                    Intent intentBat = new Intent(Toss.this, BowlFirst.class);
                    intentBat.putExtra("WinOrLose", counter);
                    startActivity(intentBat);
                }


            }
        });








    }
}
