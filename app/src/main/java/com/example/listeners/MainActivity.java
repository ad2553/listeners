package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener
{
    int redcount,bluecount;
    Button redbt,bluebt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redbt = findViewById(R.id.redbt);
        bluebt = findViewById(R.id.bluebt);
        redcount = 0;
        bluecount = 0;

        bluebt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                bluecount++;
            }
        });
        redbt.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View v)
    {
        redcount+=2;
        Toast.makeText(this, "You clicked the red button", Toast.LENGTH_SHORT).show();
        return false;
    }
    public void resultclc(View view)
    {
        Intent si = new Intent(this,ResultActivity.class);
        si.putExtra("blueCounter",bluecount);
        si.putExtra("redCounter",redcount);
        bluecount = 0;
        redcount = 0;
        startActivity(si);
    }
}
