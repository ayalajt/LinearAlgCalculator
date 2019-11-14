package com.example.cmsc_355_g18_csbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class TruthTables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truth_tables);

        final TextView ttInputText = (TextView) findViewById(R.id.ttInputText);
        final TextView ttOutputText = (TextView) findViewById(R.id.ttOutputText);

        //Button deleteButtonForTT = (Button) findViewById(R.id.deleteButtonForTT);
        Button xorButton = (Button) findViewById(R.id.xorButton);
        Button orButton = (Button) findViewById(R.id.orButton);
        Button andButton = (Button) findViewById(R.id.andButton);
        Button pButton = (Button) findViewById(R.id.pButton);
        Button qButton = (Button) findViewById(R.id.qButton);
        Button notButton = (Button) findViewById(R.id.notButton);
        Button leftparenButton = (Button) findViewById(R.id.leftparenButton);
        Button rightparenButton = (Button) findViewById(R.id.rightparenButton);
        Button clearButtonForTT = (Button) findViewById(R.id.clearButtonForTT);
        Button ifButton = (Button) findViewById(R.id.ifButton);
        Button iffButton = (Button) findViewById(R.id.iffButton);
        Button submitButtonForTT = (Button) findViewById(R.id.submitButtonForTT);


        xorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "⊕");
            }
        });

        orButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "∨");
            }
        });

        andButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "∧");
            }
        });

        notButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "¬");
            }
        });

        leftparenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "(");
            }
        });

        rightparenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + ")");
            }
        });

        ifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "→");
            }
        });

        iffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "↔");
            }
        });

        clearButtonForTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText("");
            }
        });


        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "p");
            }
        });

        qButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "q");
            }
        });

        submitButtonForTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean pp = true;
                boolean qq = false;
                boolean rr = false;

                String header = "  p  q  r  | p∧q p∨q ¬r\n-----------+-----------\n";
                String line = "";


                for (int p = 0; p <= 1; p++) {
                    for (int q = 0; q <= 1; q++) {

                        for (int r = 0; r <= 1; r++) {
                            pp = (p == 1) ? true : false;
                            qq = (q == 1) ? true : false;
                            rr = (r == 1) ? true : false;

                            line = line + "\n" + String.format("%3s%3s%3s  |%3s%3s%3s",
                                    trueOrFalse(pp), trueOrFalse(qq), trueOrFalse(rr),
                                    trueOrFalse(expressionOne(pp, qq, rr)),
                                    trueOrFalse(expressionTwo(pp, qq, rr)),
                                    trueOrFalse(expressionThree(pp, qq, rr)));
                        }
                    }
                }

                ttOutputText.setText(header + line);
            }

            public boolean expressionOne(boolean p, boolean q, boolean r) {
                return (p & q);
            }

            public boolean expressionTwo(boolean p, boolean q, boolean r) {
                return (p | q);
            }

            public boolean expressionThree(boolean p, boolean q, boolean r) {
                return !r;
            }

            public String trueOrFalse(boolean p) {
                return ((p == true) ? "T" : "F");
            }


        });

    }

}