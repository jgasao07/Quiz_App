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

        TextView score = (TextView) findViewById(R.id.score);
        int finalScore = QuizApp.getScore();
        score.setText(finalScore + "/2");
    }

    public void restart(View view) {
        QuizApp.reset();
        Intent intent = new Intent(this, QuizApp.class);
        startActivity(intent);
    }

    /*
    public void answers(View view) {
        answerpage ap = new answerpage();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.container2, ap)
                .addToBackStack(null)
                .commit();
    }
    */
}
