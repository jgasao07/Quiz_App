package com.example.john.quizapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, Question.newInstance(null, null))
                .addToBackStack(null)
                .commit();

    }

}
*/

public class PlayActivity extends AppCompatActivity {

    Button submit;
    EditText answer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        submit = (Button)findViewById(R.id.button);
        answer   = (EditText)findViewById(R.id.edittext);

        submit.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Log.v("EditText", answer.getText().toString());
                    }
                });
    }
}


/*
public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment_container, Question.newInstance(null, null))
                .addToBackStack(null)
                .commit();
        //TA end
    }
}
*/