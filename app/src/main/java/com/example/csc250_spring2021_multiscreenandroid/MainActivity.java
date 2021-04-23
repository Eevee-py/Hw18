package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private int counter;
    private EditText inputmath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = 0;
        this.inputmath = this.findViewById(R.id.inputmath);
    }

    public void onNextScreenButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        //i.putExtra("name", "Mike");
        //i.putExtra("counter", counter);
        MySingleton.counter++;
        this.startActivity(i);
    }
}