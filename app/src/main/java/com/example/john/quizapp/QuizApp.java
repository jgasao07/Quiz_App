package com.example.john.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;


public class QuizApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);

        if (savedInstanceState != null) {
            return;
        }
    }


    public void startPressed(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
}