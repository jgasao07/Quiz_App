package com.example.john.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EndPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);

        // Displays the final score
        TextView score = (TextView) findViewById(R.id.score);
        int finalScore = QuizApp.getScore();
        score.setText(finalScore + "/2");
    }

    // Restarts the quiz
    public void restart(View view) {
        QuizApp.reset();
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }

    // Returns to start screen
    public void quit(View view) {
        QuizApp.reset();
        Intent intent = new Intent(this, QuizApp.class);
        startActivity(intent);
    }
}
