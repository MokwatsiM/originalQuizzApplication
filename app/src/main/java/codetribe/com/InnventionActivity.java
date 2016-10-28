package codetribe.com.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InnventionActivity extends AppCompatActivity {

    private ArrayList<Quizz> quizzList = MainActivity.quizzList;
    public static boolean[] status = new boolean[5];

    public static ArrayList<Results> rsltList = new ArrayList<>();
    private Button btnSubmit;
    private TextView txtQuestion1;
    private TextView txtQuestion2;
    private TextView txtQuestion3;
    private TextView txtQuestion4;
    private TextView txtQuestion5;
    private Spinner spnAnswers1;
    private Spinner spnAnswers2;
    private Spinner spnAnswers3;
    private Spinner spnAnswers4;
    private Spinner spnAnswers5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_innvention);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnSubmit = (Button) findViewById(R.id.btnSubmitAnswer);

        txtQuestion1 = (TextView) findViewById(R.id.text_view_Question1);
        txtQuestion2 = (TextView) findViewById(R.id.text_view_Question2);
        txtQuestion3 = (TextView) findViewById(R.id.text_view_Question3);
        txtQuestion4 = (TextView) findViewById(R.id.text_view_Question4);
        txtQuestion5 = (TextView) findViewById(R.id.text_view_Question5);

        spnAnswers1 = (Spinner) findViewById(R.id.spnQuestion1);
        spnAnswers2 = (Spinner) findViewById(R.id.spnQuestion2);
        spnAnswers3 = (Spinner) findViewById(R.id.spnQuestion3);
        spnAnswers4 = (Spinner) findViewById(R.id.spnQuestion4);
        spnAnswers5 = (Spinner) findViewById(R.id.spnQuestion5);

        spnAnswers1.setPrompt("Choose your answer");
        spnAnswers2.setPrompt("Choose your answer");
        spnAnswers3.setPrompt("Choose your answer");
        spnAnswers4.setPrompt("Choose your answer");
        spnAnswers5.setPrompt("Choose your answer");

        setQuestionAndAnswer();
        btnSubmit.setOnClickListener(new SubmitQuestion());


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);

    }



    public void setQuestionAndAnswer() {

        ArrayList<String> optionsList = new ArrayList<>();
        Quizz temp = quizzList.get(10);

        txtQuestion1.setText(temp.getQuestion());

        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());
//
        ArrayAdapter<String> optionsAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers1.setAdapter(optionsAdapter1);

//
        optionsList = new ArrayList<>();
        temp = quizzList.get(11);
        txtQuestion2.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers2.setAdapter(optionsAdapter2);


        optionsList = new ArrayList<>();
        temp = quizzList.get(12);
        txtQuestion3.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers3.setAdapter(optionsAdapter3);


        optionsList = new ArrayList<>();
        temp = quizzList.get(13);
        txtQuestion4.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers4.setAdapter(optionsAdapter4);


        optionsList = new ArrayList<>();
        temp = quizzList.get(14);
        txtQuestion5.setText(temp.getQuestion());
        optionsList.add(temp.getOption1());
        optionsList.add(temp.getOption2());
        optionsList.add(temp.getOption3());
        optionsList.add(temp.getOption4());

        ArrayAdapter<String> optionsAdapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, optionsList);

        spnAnswers5.setAdapter(optionsAdapter5);


    }

    private class SubmitQuestion implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String userAnswer;
            String correctAnswer;


            Results objResults;
            //question1
            Quizz temp = quizzList.get(10);
            correctAnswer = temp.getAnswer();

            int score = 0;

            if (spnAnswers1.getSelectedItemPosition() == 0) {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[0] = true;
                } else {
                    score += 0;
                    status[0] = false;

                }
            } else if (spnAnswers1.getSelectedItemPosition() == 1) {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[0] = true;
                } else {
                    score += 0;
                    status[0] = false;
                }

            } else if (spnAnswers1.getSelectedItemPosition() == 2) {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[0] = true;
                } else {
                    score += 0;
                    status[0] = false;
                }

            } else if (spnAnswers1.getSelectedItemPosition() == 3) {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[0] = true;
                } else {
                    score += 0;
                    status[0] = false;

                }

            }

            objResults = new Results(status, correctAnswer);
            rsltList.add(objResults);


            //question2
            temp = quizzList.get(11);
            correctAnswer = temp.getAnswer();

            if (spnAnswers2.getSelectedItemPosition() == 0) {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[1] = true;
                } else {
                    score += 0;
                    status[1] = false;

                }
            } else if (spnAnswers2.getSelectedItemPosition() == 1) {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[1] = true;
                } else {
                    score += 0;
                    status[1] = false;

                }

            } else if (spnAnswers2.getSelectedItemPosition() == 2) {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[1] = true;
                } else {
                    score += 0;
                    status[1] = false;

                }

            } else if (spnAnswers2.getSelectedItemPosition() == 3) {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[1] = true;
                } else {
                    score += 0;
                    status[1] = false;

                }

            }
            objResults = new Results(status, correctAnswer);
            rsltList.add(objResults);


            //question3

            temp = quizzList.get(12);
            correctAnswer = temp.getAnswer();

            if (spnAnswers3.getSelectedItemPosition() == 0) {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[2] = true;
                } else {
                    score += 0;
                    status[2] = false;

                }
            } else if (spnAnswers3.getSelectedItemPosition() == 1) {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[2] = true;
                } else {
                    score += 0;
                    status[2] = false;

                }

            } else if (spnAnswers3.getSelectedItemPosition() == 2) {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[2] = true;
                } else {
                    score += 0;
                    status[2] = false;

                }

            } else if (spnAnswers3.getSelectedItemPosition() == 3) {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[2] = true;
                } else {
                    score += 0;
                    status[2] = false;
                }

            }

            objResults = new Results(status, correctAnswer);
            rsltList.add(objResults);


            //question4

            temp = quizzList.get(13);
            correctAnswer = temp.getAnswer();

            if (spnAnswers4.getSelectedItemPosition() == 0) {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[3] = true;
                } else {
                    score += 0;
                    status[3] = false;

                }
            } else if (spnAnswers4.getSelectedItemPosition() == 1) {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[3] = true;
                } else {
                    score += 0;
                    status[3] = false;
                }

            } else if (spnAnswers4.getSelectedItemPosition() == 2) {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[3] = true;
                } else {
                    score += 0;
                    status[3] = false;

                }

            } else if (spnAnswers4.getSelectedItemPosition() == 3) {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[3] = true;
                } else {
                    score += 0;
                    status[3] = false;

                }

            }
            objResults = new Results(status, correctAnswer);
            rsltList.add(objResults);


            //question5

            temp = quizzList.get(14);
            correctAnswer = temp.getAnswer();

            if (spnAnswers5.getSelectedItemPosition() == 0) {
                userAnswer = "A";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[4] = true;
                } else {
                    score += 0;
                    status[4] = false;

                }
            } else if (spnAnswers5.getSelectedItemPosition() == 1) {
                userAnswer = "B";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[4] = true;
                } else {
                    score += 0;
                    status[4] = false;

                }

            } else if (spnAnswers5.getSelectedItemPosition() == 2) {
                userAnswer = "C";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[4] = true;
                } else {
                    score += 0;
                    status[4] = false;

                }

            } else if (spnAnswers5.getSelectedItemPosition() == 3) {
                userAnswer = "D";
                if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                    score += 1;
                    status[4] = true;
                } else {
                    score += 0;
                    status[4] = false;

                }

            }


            Toast.makeText(InnventionActivity.this, "Your score is=" + score, Toast.LENGTH_LONG).show();
            objResults = new Results(correctAnswer, score, status);
            rsltList.add(objResults);
            Intent intent = new Intent(InnventionActivity.this, ScoreActivity.class);
            intent.putExtra("Result_Object", rsltList);
            startActivity(intent);


        }
    }


}
