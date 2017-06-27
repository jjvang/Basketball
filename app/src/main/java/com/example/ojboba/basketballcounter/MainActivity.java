package com.example.ojboba.basketballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int teamA = 0;
    int teamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//-----------------------------------TEAM A---------------------------------------------------------
        Button aButton3 = (Button) findViewById(R.id.teamA3);
        Button aButton2 = (Button) findViewById(R.id.teamA2);
        Button aButton1 = (Button) findViewById(R.id.teamA1);
        final TextView aScore = (TextView) findViewById(R.id.aScore);
//-----------------------------------TEAM B---------------------------------------------------------
        Button bButton3 = (Button) findViewById(R.id.teamB3);
        Button bButton2 = (Button) findViewById(R.id.teamB2);
        Button bButton1 = (Button) findViewById(R.id.teamB1);
        final TextView bScore = (TextView) findViewById(R.id.bScore);
//--------------------------------------------------------------------------------------------------

        aButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA +3;
                aScore.setText("" +teamA);
            }
        });

        aButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA +2;
                aScore.setText("" +teamA);
            }
        });

        aButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA +2;
                aScore.setText("" +teamA);
            }
        });

        bButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB +3;
                bScore.setText(""+ teamB);
            }
        });

        bButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB +2;
                bScore.setText(""+ teamB);
            }
        });

        bButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB +2;
                bScore.setText(""+ teamB);
            }
        });


    }
}
