package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button variable is created
        Button ask =(Button) findViewById(R.id.ask_button);
        //creating a image view
        final ImageView Ball = (ImageView) findViewById(R.id.image_eightBall);

        //Creating array for storing pictures.
        final  int ask_array[]={R.drawable.ball1,
                          R.drawable.ball2,
                          R.drawable.ball3,
                          R.drawable.ball4,
                          R.drawable.ball5
                               };



        //setting button for listening to clicks

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Random Randomnumbergenerater =new Random();
                int number =Randomnumbergenerater.nextInt(5);
                Ball.setImageResource(ask_array[number]);
            }
        });
    }
}
