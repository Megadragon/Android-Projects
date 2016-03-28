package io.github.megadragon.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Increase the score for Team A by 3 points
         */
        Button add_three_for_team_a = (Button) findViewById(R.id.add_three_for_team_a);
        if (add_three_for_team_a != null) {
            add_three_for_team_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamA(scoreTeamA += 3);
                }
            });
        }

        /**
         * Increase the score for Team A by 2 points
         */
        Button add_two_for_team_a = (Button) findViewById(R.id.add_two_for_team_a);
        if (add_two_for_team_a != null) {
            add_two_for_team_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamA(scoreTeamA += 2);
                }
            });
        }

        /**
         * Increase the score for Team A by 1 point
         */
        Button add_one_for_team_a = (Button) findViewById(R.id.add_one_for_team_a);
        if (add_one_for_team_a != null) {
            add_one_for_team_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamA(++scoreTeamA);
                }
            });
        }

        /**
         * Increase the score for Team B by 3 points
         */
        Button add_three_for_team_b = (Button) findViewById(R.id.add_three_for_team_b);
        if (add_three_for_team_b != null) {
            add_three_for_team_b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamB(scoreTeamB += 3);
                }
            });
        }

        /**
         * Increase the score for Team B by 2 points
         */
        Button add_two_for_team_b = (Button) findViewById(R.id.add_two_for_team_b);
        if (add_two_for_team_b != null) {
            add_two_for_team_b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamB(scoreTeamB += 2);
                }
            });
        }

        /**
         * Increase the score for Team B by 1 point
         */
        Button add_one_for_team_b = (Button) findViewById(R.id.add_one_for_team_b);
        if (add_one_for_team_b != null) {
            add_one_for_team_b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamB(++scoreTeamB);
                }
            });
        }

        /**
         * Reset scores for both Teams
         */
        Button reset_team_scores = (Button) findViewById(R.id.reset_team_scores);
        if (reset_team_scores != null) {
            reset_team_scores.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    displayForTeamA(scoreTeamA = 0);
                    displayForTeamB(scoreTeamB = 0);
                }
            });
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        if (scoreView != null) {
            scoreView.setText(String.valueOf(score));
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        if (scoreView != null) {
            scoreView.setText(String.valueOf(score));
        }
    }
}
