package codetribe.com.quizzapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Question2Fragment extends Fragment {

    private RadioButton rdoOptionA;
    private RadioButton rdoOptionB;
    private RadioButton rdoOptionC;
    private RadioButton rdoOptionD;
    private ArrayList<Quizz> quizzList = MainActivity.quizzList;
    private TextView txtDisplayQuestion;

    private ArrayList<String> answerList = new ArrayList<>();

    public Question2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question2, container, false);


    }

}
