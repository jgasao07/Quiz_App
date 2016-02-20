package com.example.john.quizapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PlayActivity extends Activity implements Question.OnFragmentAnswerSubmitted{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Question f1 = new Question();
        fragmentTransaction.add(R.id.container,f1);
       // fragmentTransaction.add(R.id.container,f1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void onAnswerSubmit(String input) {
        //Acceptable answers
        String a1 = "barack obama";
        String a2 = "barack";
        String a3 = "obama";
        String a4 = "president obama";
        String a5 = "president";

        String input2 = input.toLowerCase();

        if (input2.equals(a1) || input2.equals(a2) || input2.equals(a3)
                || input2.equals(a4) || input2.equals(a5)) {
            QuizApp.addPoints(1);
        }

        Question2 fragment = new Question2();
        Bundle args = new Bundle();
        getFragmentManager().beginTransaction().
                replace(R.id.container, fragment).addToBackStack(null).commit();
        fragment.submit();
    }

    public void submit2Pressed(View view) {
        Intent intent = new Intent(this, EndPage.class);
        startActivity(intent);
    }
}


