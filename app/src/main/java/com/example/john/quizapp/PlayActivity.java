package com.example.john.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class PlayActivity extends AppCompatActivity {

    CheckBox box1, box2, box3, box4;
    boolean correct = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Question q1 = new Question();
        getFragmentManager()
                .beginTransaction()
                .add(R.id.container, q1)
                .addToBackStack(null)
                .commit();

    }

    public void submit2Pressed(View view) {
        if (correct) {
            QuizApp.addPoints();
        }
        Intent intent = new Intent(this, EndPage.class);
        startActivity(intent);
    }


    public void onCheckboxClicked(View v) {

        box1 = (CheckBox) v.findViewById(R.id.checkBox1);
        box2 = (CheckBox) v.findViewById(R.id.checkBox2);
        box3 = (CheckBox) v.findViewById(R.id.checkBox3);
        box4 = (CheckBox) v.findViewById(R.id.checkBox4);

        boolean checked = ((CheckBox) v).isChecked();
        /*
        if ((box2.isChecked() == true) && (box1.isChecked() == false)
                && (box3.isChecked() == false) && (box4.isChecked() == false)) {
            QuizApp.addPoints(1);
        */
        switch(v.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    correct = false;
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    correct = true;
                }
                break;
        }

        /*
        if (correct == true) {
            QuizApp.addPoints();
        }
        */
        return;
    }

}


