package com.example.manualhandcricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{



    /*
    <DECLARING TEXTVIEWS AND BUTTONS>
     */
    TextView code_tv_yourNumber;
    TextView code_tv_computerNumber;
    TextView code_tv_score;
    TextView code_tv_targetis;
    TextView code_tv_text;

    Button code_btn_0;
    Button code_btn_1;
    Button code_btn_2;
    Button code_btn_3;
    Button code_btn_4;
    Button code_btn_5;
    Button code_btn_6;
    Button code_btn_7;
    Button code_btn_8;
    Button code_btn_9;
    Button code_btn_10;
    Button code_btn_next_newGame;


    boolean batFirst;



    /*
    </DECLARING TEXTVIEWS AND BUTTONS>
     */



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        /*
        <ASSIGNING DECLARED TEXTVIEWS AND BUTTONS TO THE DESIGNED>
        */
        code_tv_yourNumber = (TextView) findViewById(R.id.des_tv_yourNumber);
        code_tv_computerNumber = (TextView) findViewById(R.id.des_tv_computerNumber);
        code_tv_score = (TextView) findViewById(R.id.des_tv_score);
        code_tv_targetis = (TextView) findViewById(R.id.des_tv_targetis);
        code_tv_text = (TextView) findViewById(R.id.des_tv_text);

        code_btn_0 = (Button) findViewById(R.id.des_btn_0);
        code_btn_1 = (Button) findViewById(R.id.des_btn_1);
        code_btn_2 = (Button) findViewById(R.id.des_btn_2);
        code_btn_3 = (Button) findViewById(R.id.des_btn_3);
        code_btn_4 = (Button) findViewById(R.id.des_btn_4);
        code_btn_5 = (Button) findViewById(R.id.des_btn_5);
        code_btn_6 = (Button) findViewById(R.id.des_btn_6);
        code_btn_7 = (Button) findViewById(R.id.des_btn_7);
        code_btn_8 = (Button) findViewById(R.id.des_btn_8);
        code_btn_9 = (Button) findViewById(R.id.des_btn_9);
        code_btn_10 = (Button) findViewById(R.id.des_btn_10);
        code_btn_next_newGame = (Button) findViewById(R.id.des_btn_next);
        /*
        </ASSIGNING DECLARED TEXTVIEWS AND BUTTONS TO THE DESIGNED>
        */


        Intent BattingBegins = getIntent();
        batFirst = BattingBegins.getBooleanExtra("Boolean", false);




        code_btn_next_newGame.setVisibility(View.INVISIBLE);
        if(batFirst == true)
        {
            code_tv_text.setVisibility(View.GONE);
            code_tv_targetis.setVisibility(View.GONE);
        }
        else
        {
            String target = Integer.toString(Integer.parseInt(BattingBegins.getStringExtra("Target")));
            code_tv_targetis.setText(Integer.toString(Integer.parseInt(target) + 1));
            code_tv_text.setVisibility(View.VISIBLE);
            code_tv_targetis.setVisibility(View.VISIBLE);
            System.out.println(target);
        }



        final char[] value = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        final Random r = new Random();
//        int k;
//        int c;
//        c = r.nextInt(value.length);
//        k = Character.getNumericValue(r.nextInt(value.length));
//        System.out.println("AAAAAAAAAAAAAAAA " + (k + 10));
//        System.out.println("BBBBBBBBBBBBBBBB " + (c));


        /*
        <DEFINING FUNCTIONS FOR EACH NUMBER-BUTTON CLICK>
        */
        code_btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 0;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 0)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
//                    System.out.println("AAAAAAAAAAAAAAAABBBBBBBBBBBBB");

                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }


            }
        });

        code_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 1;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 1)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));

                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }


                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 2;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 2)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));

                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }


                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 3;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 3)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 4;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 4)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 5;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 5)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 6;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 6)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 7;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 7)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 8;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 8)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 9;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 9)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()) - 1)
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });
        code_btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val_yourNumber = 10;
                int random = r.nextInt(value.length) + 1;
                code_tv_yourNumber.setText(Integer.toString(val_yourNumber));
                code_tv_computerNumber.setText(Integer.toString(random));

                String tv_score = code_tv_score.getText().toString();
                int k = Integer.parseInt(tv_score);
                if(random != 10)
                {
                    k += val_yourNumber;
                    code_tv_score.setText(Integer.toString(k));
                    if(batFirst == false)
                    {
                        if(k > Integer.parseInt(code_tv_targetis.getText().toString()))
                        {
                            youWon();
                        }
                    }

                }
                else
                {
                    if(batFirst == false)
                    {
                        if(k == Integer.parseInt(code_tv_targetis.getText().toString()))
                        {
                            tie();
                        }

                        else if(k < Integer.parseInt(code_tv_targetis.getText().toString()))
                        {
                            computerWon();
                        }
                    }
                    else if(batFirst == true)
                    {
                        allout();
                    }
                }
            }
        });

        /*
        </DEFINING FUNCTIONS FOR EACH NUMBER-BUTTON CLICK>
        */





    }


    void allout()
    {
        code_btn_0.setVisibility(View.GONE);
        code_btn_1.setVisibility(View.GONE);
        code_btn_2.setVisibility(View.GONE);
        code_btn_3.setVisibility(View.GONE);
        code_btn_4.setVisibility(View.GONE);
        code_btn_5.setVisibility(View.GONE);
        code_btn_6.setVisibility(View.GONE);
        code_btn_7.setVisibility(View.GONE);
        code_btn_8.setVisibility(View.GONE);
        code_btn_9.setVisibility(View.GONE);
        code_btn_10.setVisibility(View.GONE);

        code_btn_next_newGame.setVisibility(View.VISIBLE);

        final String target = code_tv_score.getText().toString();


        code_btn_next_newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent GoToBowling = new Intent(MainActivity.this, UserBowling.class);

                GoToBowling.putExtra("Target", target);
                GoToBowling.putExtra("Boolean", batFirst);


                startActivity(GoToBowling);





            }
        });

    }

    void computerWon()
    {
        code_tv_targetis.setText("Computer Won!!!");
        code_tv_text.setVisibility(View.GONE);

        code_btn_0.setVisibility(View.GONE);
        code_btn_1.setVisibility(View.GONE);
        code_btn_2.setVisibility(View.GONE);
        code_btn_3.setVisibility(View.GONE);
        code_btn_4.setVisibility(View.GONE);
        code_btn_5.setVisibility(View.GONE);
        code_btn_6.setVisibility(View.GONE);
        code_btn_7.setVisibility(View.GONE);
        code_btn_8.setVisibility(View.GONE);
        code_btn_9.setVisibility(View.GONE);
        code_btn_10.setVisibility(View.GONE);

        code_btn_next_newGame.setVisibility(View.VISIBLE);

        code_btn_next_newGame.setText("New Game");

        code_btn_next_newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent newGame = new Intent(MainActivity.this, Toss.class);

                startActivity(newGame);

            }
        });


    }

    void tie()
    {
        code_tv_targetis.setText("It's a TIE!!!");
        code_tv_text.setVisibility(View.GONE);

        code_btn_0.setVisibility(View.GONE);
        code_btn_1.setVisibility(View.GONE);
        code_btn_2.setVisibility(View.GONE);
        code_btn_3.setVisibility(View.GONE);
        code_btn_4.setVisibility(View.GONE);
        code_btn_5.setVisibility(View.GONE);
        code_btn_6.setVisibility(View.GONE);
        code_btn_7.setVisibility(View.GONE);
        code_btn_8.setVisibility(View.GONE);
        code_btn_9.setVisibility(View.GONE);
        code_btn_10.setVisibility(View.GONE);

        code_btn_next_newGame.setVisibility(View.VISIBLE);

        code_btn_next_newGame.setText("New Game");

        code_btn_next_newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent newGame = new Intent(MainActivity.this, Toss.class);

                startActivity(newGame);

            }
        });
    }

    void youWon()
    {

        code_tv_targetis.setText("You Won!!!");
        code_tv_text.setVisibility(View.GONE);

        code_btn_0.setVisibility(View.GONE);
        code_btn_1.setVisibility(View.GONE);
        code_btn_2.setVisibility(View.GONE);
        code_btn_3.setVisibility(View.GONE);
        code_btn_4.setVisibility(View.GONE);
        code_btn_5.setVisibility(View.GONE);
        code_btn_6.setVisibility(View.GONE);
        code_btn_7.setVisibility(View.GONE);
        code_btn_8.setVisibility(View.GONE);
        code_btn_9.setVisibility(View.GONE);
        code_btn_10.setVisibility(View.GONE);

        code_btn_next_newGame.setVisibility(View.VISIBLE);

        code_btn_next_newGame.setText("New Game");

        code_btn_next_newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent newGame = new Intent(MainActivity.this, Toss.class);

                startActivity(newGame);

            }
        });
    }

}
