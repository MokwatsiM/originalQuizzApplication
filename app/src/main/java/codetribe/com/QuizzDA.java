/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetribe.com.quizzapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author DD
 */
class QuizzDA extends AppCompatActivity {


    //Create a constructor with a context parameter and a AssetManager





    public void initialise() throws codetribe.com.quizzapp.DataStorageException {

    }

    static void terminate() throws codetribe.com.quizzapp.DataStorageException {
     /*   try {
            PrintWriter out = new PrintWriter(quizzFile);

            for (int i = 0; i < quizzList.size(); i++) {
                codetribe.com.quizzapp.Quizz temp = quizzList.get(i);
                out.println(temp.getQuizType() + "," + temp.getQuestion() + "," + temp.getQuizType()
                        + "," + temp.getOption1() + "," + temp.getOption2() + "," + temp.getOption3() + "," + temp.getOption4() + "," + temp.getAnswer());
            }

            out.close();
        } catch (IOException ex) {
            throw new codetribe.com.quizzapp.DataStorageException("Error! There was a problem in "
                    + "saving to the storage device.\n" + ex.getMessage());
        }
    }

    static java.util.ArrayList getAll() {
        return quizzList;*/
    }

}


