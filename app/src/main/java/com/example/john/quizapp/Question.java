package com.example.john.quizapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Question extends Fragment {
    Button sButton;
    EditText text;
    String input;
//    OnFragmentAnswerSubmitted mAnswer;
    String a1 = "barack obama";
    String a2 = "barack";
    String a3 = "obama";
    String a4 = "president obama";
    String a5 = "president";

    /*
    public interface OnFragmentAnswerSubmitted {
        public void onAnswerSubmit(String input);
    }
    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_question, container, false);

        sButton = (Button)v.findViewById(R.id.submit);
        text = (EditText) v.findViewById(R.id.answer);
        sButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
            input = text.getText().toString();
                String input2 = input.toLowerCase();

                if (input2.equals(a1) || input2.equals(a2) || input2.equals(a3)
                        || input2.equals(a4) || input2.equals(a5)) {
                    QuizApp.addPoints();
                }

                Question2 q2 = new Question2();
                Bundle args = new Bundle();
                getFragmentManager().beginTransaction().
                        replace(R.id.container, q2).addToBackStack(null).commit();

//            mAnswer.onAnswerSubmit(input);
        }
        });

        // Inflate the layout for this fragment
        return v;
    }

}