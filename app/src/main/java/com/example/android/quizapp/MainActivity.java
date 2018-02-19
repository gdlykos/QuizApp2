package com.example.android.quizapp;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int answer1 = 0;
    int answer2 = 0;
    int answer3 = 0;
    int answer4 = 0;
    int answer5 = 0;
    int answer6 = 0;
    int answer7 = 0;
    int answer8 = 0;
    int answer9 = 0;
    int answer10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called to save the user's current game state
     */

    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("Answer1", answer1);
        savedInstanceState.putInt("Answer2", answer2);
        savedInstanceState.putInt("Answer3", answer3);
        savedInstanceState.putInt("Answer4", answer4);
        savedInstanceState.putInt("Answer5", answer5);
        savedInstanceState.putInt("Answer6", answer6);
        savedInstanceState.putInt("Answer7", answer7);
        savedInstanceState.putInt("Answer8", answer8);
        savedInstanceState.putInt("Answer9", answer9);
        savedInstanceState.putInt("Answer10", answer10);

        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * This method is called to restore state members from saved instance
     */

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        answer1 = savedInstanceState.getInt("Answer1");
        answer2 = savedInstanceState.getInt("Answer2");
        answer3 = savedInstanceState.getInt("Answer3");
        answer4 = savedInstanceState.getInt("Answer4");
        answer5 = savedInstanceState.getInt("Answer5");
        answer6 = savedInstanceState.getInt("Answer6");
        answer7 = savedInstanceState.getInt("Answer7");
        answer8 = savedInstanceState.getInt("Answer8");
        answer9 = savedInstanceState.getInt("Answer9");
        answer10 = savedInstanceState.getInt("Answer10");
    }

    /**
     * This method is called when answer the first question.
     */

    public void on1AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.star_button:
                if (checked)
                    answer1 = 0;
                break;
            case R.id.asteroid_button:
                if (checked)
                    answer1 = 0;
                break;
            case R.id.comet_button:
                if (checked)
                    answer1 = 1;
                break;
            case R.id.moon_button:
                if (checked)
                    answer1 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the second question.
     */

    public void on2AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.sound_waves_button:
                if (checked)
                    answer2 = 0;
                break;
            case R.id.radio_waves_button:
                if (checked)
                    answer2 = 1;
                break;
            case R.id.gravity_waves_button:
                if (checked)
                    answer2 = 0;
                break;
            case R.id.light_waves_button:
                if (checked)
                    answer2 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the third question.
     */

    public void on3AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.crust_button:
                if (checked)
                    answer3 = 0;
                break;
            case R.id.mantle_button:
                if (checked)
                    answer3 = 0;
                break;
            case R.id.core_button:
                if (checked)
                    answer3 = 1;
                break;
        }
    }

    /**
     * This method is called when answer the fourth question.
     */

    public void on4AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rotation_axis_button:
                if (checked)
                    answer4 = 0;
                break;
            case R.id.gravity_moon_button:
                if (checked)
                    answer4 = 1;
                break;
            case R.id.gravity_sun_button:
                if (checked)
                    answer4 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the fifth question.
     */

    public void on5AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.brightness_button:
                if (checked)
                    answer5 = 0;
                break;
            case R.id.time_button:
                if (checked)
                    answer5 = 0;
                break;
            case R.id.distance_button:
                if (checked)
                    answer5 = 1;
                break;
            case R.id.weight_button:
                if (checked)
                    answer5 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the sixth question.
     */

    public void on6AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.magnifying1_button:
                if (checked)
                    answer6 = 0;
                break;
            case R.id.magnifying2_button:
                if (checked)
                    answer6 = 0;
                break;
            case R.id.magnifying3_button:
                if (checked)
                    answer6 = 1;
                break;
            case R.id.magnifying4_button:
                if (checked)
                    answer6 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the seventh question.
     */

    public void on7AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.earthquake_button:
                if (checked)
                    answer7 = 1;
                break;
            case R.id.hurricane_button:
                if (checked)
                    answer7 = 0;
                break;
            case R.id.tsunami_button:
                if (checked)
                    answer7 = 0;
                break;
            case R.id.solar_radiation_button:
                if (checked)
                    answer7 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the eighth question.
     */

    public void on8AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.sodium_chloride_button:
                if (checked)
                    answer8 = 0;
                break;
            case R.id.uranium_button:
                if (checked)
                    answer8 = 1;
                break;
            case R.id.nitrogean_button:
                if (checked)
                    answer8 = 0;
                break;
            case R.id.carbon_dioxide_button:
                if (checked)
                    answer8 = 0;
                break;
        }
    }

    /**
     * This method is called when answer the ninth question.
     */

    public void on9AnswerRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.marieCurie_button:
                if (checked)
                    answer9 = 0;
                break;
            case R.id.isaacNewton_button:
                if (checked)
                    answer9 = 0;
                break;
            case R.id.albertEinstein_button:
                if (checked)
                    answer9 = 0;
                break;
            case R.id.jonasSalk_button:
                if (checked)
                    answer9 = 1;
                break;
        }
    }

    /**
     * The method to submit the answers.
     */

    public void submitAnswers(View view) {

        /**
         * The method to get the player's name.
         */

        EditText addName = (EditText) findViewById(R.id.name_edit_view);
        String addNameTo = addName.getText().toString();

        /**
         * The calculation for the tenth question with the checkboxes.
         */

        CheckBox marieCurieCheckbox = (CheckBox) findViewById(R.id.marieCurie_checkbox);
        boolean marieCurie = marieCurieCheckbox.isChecked();

        CheckBox linusPaulingCheckbox = (CheckBox) findViewById(R.id.linusPauling_checkbox);
        boolean linusPauling = linusPaulingCheckbox.isChecked();

        CheckBox johnBardeenCheckbox = (CheckBox) findViewById(R.id.johnBardeen_checkbox);
        boolean johnBardeen = johnBardeenCheckbox.isChecked();

        CheckBox frederickSangerCheckbox = (CheckBox) findViewById(R.id.frederickSanger_checkbox);
        boolean frederickSanger = frederickSangerCheckbox.isChecked();

        answer10 = 0;
        if (marieCurie) {
            if (linusPauling) {
                if (johnBardeen) {
                    if (frederickSanger) {
                        answer10 = 1;
                    }
                }
            }
        }

        /**
         * The calculation for the final score.
         */

        score = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7 + answer8 + answer9 + answer10;

        /**
         * The toast messages depend on the score.
         */

        Resources res = getResources();
        String perfectScore = res.getString(R.string.perfectScore, addNameTo, score);
        String highScore = res.getString(R.string.highScore, addNameTo, score);
        String mediumScore = res.getString(R.string.mediumScore, addNameTo, score);
        String lowScore = res.getString(R.string.lowScore, addNameTo, score);
        String veryLowScore = res.getString(R.string.veryLowScore, addNameTo, score);

        if (score == 10) {
            Toast.makeText(this, perfectScore,
                    Toast.LENGTH_LONG).show();
        } else if (score >= 8) {
            Toast.makeText(this, highScore,
                    Toast.LENGTH_LONG).show();
        } else if (score >= 5) {
            Toast.makeText(this, mediumScore,
                    Toast.LENGTH_LONG).show();
        } else if (score >= 3) {
            Toast.makeText(this, lowScore,
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, veryLowScore,
                    Toast.LENGTH_LONG).show();
        }
    }

    /**
     * The method for the reset button.
     */

    public void resetButton(View view) {
        score = 0;
        answer1 = 0;
        answer2 = 0;
        answer3 = 0;
        answer4 = 0;
        answer5 = 0;
        answer6 = 0;
        answer7 = 0;
        answer8 = 0;
        answer9 = 0;
        answer10 = 0;
        setContentView(R.layout.activity_main);
    }

    /**
     * The method for the exit button.
     */

    public void exitApp(View v) {
        finish();
        System.exit(0);
    }
}
