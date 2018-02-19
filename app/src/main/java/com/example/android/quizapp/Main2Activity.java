package com.example.android.quizapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        score = getIntent().getIntExtra("score", 0);
        setContentView(R.layout.activity_main2);

        displayScore(score);

        }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.white_button:
                if (checked)
                    displayMessageAnswer("Wrong Answer.");
                break;
            case R.id.black_button:
                if (checked)
                    // Ninjas rule
                    score = score + 1;
                displayMessageAnswer("That's correct!");
                break;

        }
        RadioButton btn1 = (RadioButton) findViewById(R.id.white_button);
        RadioButton btn2 = (RadioButton) findViewById(R.id.black_button);
        btn1.setClickable(false);
        btn2.setClickable(false);


        displayScore(score);
    }

    private void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_text);
        scoreView.setText("Score: " + score);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessageAnswer(String message) {
        TextView answer1 = (TextView) findViewById(R.id.answer);
        answer1.setText(message);
    }



    }