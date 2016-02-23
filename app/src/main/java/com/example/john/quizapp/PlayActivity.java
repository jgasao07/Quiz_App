package com.example.john.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * Serves as a container for the 2 fragments
 */
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

    /**
     * Moves to the last activity when submit is pressed
     * @param view
     */
    public void submit2Pressed(View view) {
        if (correct) {
            QuizApp.addPoints();
        }
        Intent intent = new Intent(this, EndPage.class);
        startActivity(intent);
    }


    /**
     * Checks which box the user clicked and determines if the answer was correct
     * @param v
     */
    public void onCheckboxClicked(View v) {

        box1 = (CheckBox) v.findViewById(R.id.checkBox1);
        box2 = (CheckBox) v.findViewById(R.id.checkBox2);
        box3 = (CheckBox) v.findViewById(R.id.checkBox3);
        box4 = (CheckBox) v.findViewById(R.id.checkBox4);

        boolean checked = ((CheckBox) v).isChecked();

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
        return;
    }

}


