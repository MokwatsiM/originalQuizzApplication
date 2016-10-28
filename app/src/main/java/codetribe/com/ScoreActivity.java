package codetribe.com.quizzapp;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {
    boolean[] status = StartQuizzActivity.status;
    private TextView txtQuestion1, txtQuestion2, txtQuestion3, txtQuestion4, txtQuestion5, txtScore;
    private ArrayList<Results> rsltsList = new ArrayList<>();


    String questionStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txtQuestion1 = (TextView) findViewById(R.id.txtQuestion1);
        txtQuestion2 = (TextView) findViewById(R.id.txtQuestion2);
        txtQuestion3 = (TextView) findViewById(R.id.txtQuestion3);
        txtQuestion4 = (TextView) findViewById(R.id.txtQuestion4);
        txtQuestion5 = (TextView) findViewById(R.id.txtQuestion5);
        txtScore = (TextView) findViewById(R.id.txtScore);

        txtQuestion1.setText(String.format("" + status[0]));
        txtQuestion2.setText(String.format("" + status[1]));
        txtQuestion3.setText(String.format("" + status[2]));
        txtQuestion4.setText(String.format("" + status[3]));
        txtQuestion5.setText(String.format("" + status[4]));

        rsltsList = (ArrayList<Results>) getIntent().getSerializableExtra("Result_Object");

        //q1
        Results temp = rsltsList.get(0);
        if (temp.getStatus()[0]) {

            questionStatus = "Correct";
        } else {
            questionStatus = "Incorrect";
        }

        txtQuestion1.setText(questionStatus);


        //temp2
        temp = rsltsList.get(1);
        if (temp.getStatus()[1]) {

            questionStatus = "Correct";
        } else {
            questionStatus = "Incorrect";
        }

        txtQuestion2.setText(questionStatus);


        //question3
        temp = rsltsList.get(2);
        if (temp.getStatus()[2]) {

            questionStatus = "Correct";
        } else {
            questionStatus = "Incorrect";
        }

        txtQuestion3.setText(questionStatus);

        //question4
        temp = rsltsList.get(3);
        if (temp.getStatus()[3]) {

            questionStatus = "Correct";
        } else {
            questionStatus = "Incorrect";
        }

        txtQuestion4.setText(questionStatus);


        //question5

        temp = rsltsList.get(4);
        if (temp.getStatus()[4]) {

            questionStatus = "Correct";
        } else {
            questionStatus = "Incorrect";
        }

        txtQuestion5.setText(questionStatus);

        if (temp.getScore() >= 3) {
            txtScore.setText("Congratulation!!!! You Passed!!  " + temp.getScore() + "/5");
        } else {
            txtScore.setText("Sorry try again " + temp.getScore() + "/5");


        }

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
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ScoreActivity.this,InnventionActivity.class);
        startActivity(intent);

    }

    public void onBackPressed(View v)
   {
       new AlertDialog.Builder(this).setIcon(R.drawable.ic_dialog_alert).setTitle("Clossing Activity")
               .setMessage("Are you sure You want to Close this app?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

               Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
               intent.putExtra("Exit_Me",true);
               startActivity(intent);
               finish();

           }
       })
               .setNegativeButton("No",null).show();

   }
}
