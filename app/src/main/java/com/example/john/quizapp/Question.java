package com.example.john.quizapp;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Question extends android.app.Fragment {
    Button sButton;
    EditText text;
    String input;
    OnFragmentAnswerSubmitted mAnswer;

    public interface OnFragmentAnswerSubmitted {
        public void onAnswerSubmit(String input);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_question, container, false);

        sButton = (Button)getActivity().findViewById(R.id.submit);
        sButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view){
            text = (EditText) getActivity().findViewById(R.id.answer);
            input = text.getText().toString();
            mAnswer.onAnswerSubmit(input);
        }
        });

        // Inflate the layout for this fragment
        return v;
    }

}