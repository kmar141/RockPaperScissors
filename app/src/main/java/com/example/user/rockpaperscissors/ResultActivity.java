package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import behaviours.Moves;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    Computer computer;
    Game game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = (TextView) findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String result = extras.getString("playerchoice");

        resultText.setText(result);

    }

    public String display() {
        String display = new String();
        display += game.compareMoves(Moves.ROCK, computer.getMove());
        return display;
    }
}

