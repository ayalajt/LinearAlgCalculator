package com.example.cmsc_355_g18_csbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class TruthTables extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_truth_tables, container, false);


        final TextView ttInputText = (TextView) root.findViewById(R.id.ttInputText);
        final TextView ttOutputText = (TextView) root.findViewById(R.id.ttOutputText);

        //Button deleteButtonForTT = (Button) findViewById(R.id.deleteButtonForTT);
        Button xorButton = (Button) root.findViewById(R.id.xorButton);
        Button orButton = (Button) root.findViewById(R.id.orButton);
        Button andButton = (Button) root.findViewById(R.id.andButton);
        Button pButton = (Button) root.findViewById(R.id.pButton);
        Button qButton = (Button) root.findViewById(R.id.qButton);
        Button notButton = (Button) root.findViewById(R.id.notButton);
        Button leftparenButton = (Button) root.findViewById(R.id.leftparenButton);
        Button rightparenButton = (Button) root.findViewById(R.id.rightparenButton);
        Button clearButtonForTT = (Button) root.findViewById(R.id.clearButtonForTT);
        Button ifButton = (Button) root.findViewById(R.id.ifButton);
        Button iffButton = (Button) root.findViewById(R.id.iffButton);
        Button submitButtonForTT = (Button) root.findViewById(R.id.submitButtonForTT);


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

        return root;
    }

}