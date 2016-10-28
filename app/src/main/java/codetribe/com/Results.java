package codetribe.com.quizzapp;

import java.io.Serializable;

/**
 * Created by DD on 2016-09-26.
 */
public class Results implements Serializable {
    private boolean[] status;
    private int score;
    private String correctAnswer;

    public Results() {
        this(null, "none");
    }

    public Results(boolean[] status, String correctAnswer) {
        this(correctAnswer, 0, status);
    }

    public Results(String correctAnswer, int score, boolean[] status) {

        setCorrectAnswer(correctAnswer);
        setStatus(status);
        setScore(score);
    }

    public boolean[] getStatus() {
        return status;
    }

    public void setStatus(boolean[] status) {
        this.status = status;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


}
