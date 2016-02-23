package com.example.john.quizapp;

import android.content.Context;
import android.net.Uri;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.john.quizapp.R;




public class Question2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_question2,container,false);
/*
        sButton = (Button)v.findViewById(R.id.submit2);

        box1 = (CheckBox) v.findViewById(R.id.checkBox1);
        box2 = (CheckBox) v.findViewById(R.id.checkBox2);
        box3 = (CheckBox) v.findViewById(R.id.checkBox3);
        box4 = (CheckBox) v.findViewById(R.id.checkBox4);

        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });
*/
        return v;
    }

    /*
    public void onCheckboxClicked(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        if ((box2.isChecked() == true) && (box1.isChecked() == false)
                && (box3.isChecked() == false) && (box4.isChecked() == false)) {
            QuizApp.addPoints(1);
        }
    }
    */

}