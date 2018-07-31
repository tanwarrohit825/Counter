package com.bitbyte24seven.counter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variable using in project
    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //It is the Method to display the Score of Team A
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //onclick Method is using to add 6 Points in scoreTeamA
    public void sixPointsTeamA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    //onnclick  Method is using to add 4 Points in scoreTeamA
    public void fourPointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    //onclick  Method is using to add 3 Points in scoreTeamA
    public void threePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //onclick  Method is using to add 2 Points in scoreTeamA
    public void twoPoint(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //onclick  Method is using to add 1 Points in scoreTeamA
    public void oneRunTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    //It is the Method to display the Score of Team B
    public void displayForTeamB(int scoreB) {
        TextView team_b_score = findViewById(R.id.team_b_score);
        team_b_score.setText(String.valueOf(scoreB));
    }

    //onclick Method is using to add 6 Points in scoreTeamB
    public void sixPointsTeamB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    //onclick Method is using to add 4 Points in scoreTeamB
    public void fourPointsTeamB(View view) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);
    }

    //onclick Method is using to add 3 Points in scoreTeamB
    public void threePointsTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    //onclick Method is using to add 2 Points in scoreTeamB
    public void twoPointTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    //onclick Method is using to add 1 Points in scoreTeamB
    public void oneRunTeamB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        //define the alert Dialog
        alertDialog();
    }

    //This the alertDialog Which help to user to give Choice to reset the Score to both Team
    public void alertDialog() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Do you want to reset.");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        scoreTeamA = 0;
                        scoreTeamB = 0;
                        displayForTeamA(scoreTeamA);
                        displayForTeamB(scoreTeamB);
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert11 = builder1.create();
        alert11.show();
    }


}