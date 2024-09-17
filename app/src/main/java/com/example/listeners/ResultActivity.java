package com.example.listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity
{
    TextView redtv,bluetv,winnertv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        findWinner();

        };
    public void findWinner() {
        redtv = findViewById(R.id.redtv);
        bluetv = findViewById(R.id.bluetv);
        winnertv = findViewById(R.id.winnertv);

        Intent gi = getIntent();
        int blueScore = gi.getIntExtra("blueCounter",-1);
        int redScore = gi.getIntExtra("redCounter",-1);
        bluetv.setText("The Blue score is:\n" + blueScore);
        redtv.setText("The Red score is:\n" + redScore);
        if (blueScore > redScore) {
            winnertv.setText("The winner is: Blue");
        }
        else if (blueScore < redScore)
        {
            winnertv.setText("The winner is: red");
        }
        else
            winnertv.setText("Its a tie");

    }

    public void goback(View view)
    {
        finish();
    }
    }
