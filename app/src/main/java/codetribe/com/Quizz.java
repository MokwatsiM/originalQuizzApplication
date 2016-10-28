/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetribe.com.quizzapp;

import java.io.Serializable;


/**
 *
 * @author DD
 */


public class Quizz implements Serializable
{


    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;



    public Quizz()
    {
        this("none",  "none", "none", "none", "none", "none");
    }

    public Quizz(String question, String option1, String option2, String option3, String option4, String answer)
    {
        setQuestion(question);

        setOption1(option1);
        setOption2(option2);
        setOption3(option3);
        setOption4(option4);
        setAnswer(answer);

    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setOption1(String option1)
    {
        this.option1 = option1;
    }

    public void setOption2(String option2)
    {
        this.option2 = option2;
    }

    public void setOption3(String option3)
    {
        this.option3 = option3;
    }

    public void setOption4(String option4)
    {
        this.option4 = option4;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }



    public String getQuestion()
    {
        return question;
    }



    public String getOption1()
    {
        return option1;
    }

    public String getOption2()
    {
        return option2;
    }

    public String getOption3()
    {
        return option3;
    }

    public String getOption4()
    {
        return option4;
    }


}
