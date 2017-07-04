package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import behaviours.Moves;

import static com.example.user.rockpaperscissors.R.id.rockbtn;

public class MainActivity extends AppCompatActivity {

    TextView rpschoice;
    Button rockButton;
    Button paperButton;
    Button scissorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button)findViewById(rockbtn);
        paperButton = (Button)findViewById(R.id.paperbtn);
        scissorButton = (Button)findViewById(R.id.scissorbtn);
    }

    public void onRockClick(View rockButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerchoice", "Rock");
        startActivity(intent);

    }

    public void onPaperClick(View paperButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerchoice", "Paper");
        startActivity(intent);
    }

    public void onScissorClick(View scissorButton){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerchoice", "Scissors");
        startActivity(intent);
    }
}
