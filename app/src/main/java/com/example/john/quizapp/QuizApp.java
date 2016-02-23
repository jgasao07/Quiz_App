package com.example.john.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;


public class QuizApp extends AppCompatActivity {

    // Total score of user
    public static int score = 0;

    // Adds a point when the user answers a correct question
    public static void addPoints() {
        score++;
    }

    // Resets the score to 0 when the game restarts
    public static void reset() {
        score = 0;
    }

    // Returns the current score
    public static int getScore() {
        return score;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);

        if (savedInstanceState != null) {
            return;
        }
    }


    /**
     * Moves to the next activity when start is pressed
     * @param view
     */
    public void startPressed(View view) {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
}
