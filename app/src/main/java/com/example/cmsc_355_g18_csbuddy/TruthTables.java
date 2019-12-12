/*
/ Author: Quincey Cuthbert
/ InitDate: 10/12/19
*/

package com.example.cmsc_355_g18_csbuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.os.Bundle;

public class TruthTables extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_truth_tables, container, false);

        final TextView ttInputText = root.findViewById(R.id.ttInputText);
        final TextView ttOutputText = root.findViewById(R.id.ttOutputText);

        Button deleteButtonForTT = root.findViewById(R.id.deleteButtonForTT);
        Button xorButton = root.findViewById(R.id.xorButton);
        Button orButton = root.findViewById(R.id.orButton);
        Button andButton = root.findViewById(R.id.andButton);
        Button pButton = root.findViewById(R.id.pButton);
        Button qButton = root.findViewById(R.id.qButton);
        Button notButton = root.findViewById(R.id.notButton);
        Button leftparentButton = root.findViewById(R.id.leftparenButton);
        Button rightparentButton = root.findViewById(R.id.rightparenButton);
        Button clearButtonForTT = root.findViewById(R.id.clearButtonForTT);
        Button ifButton = root.findViewById(R.id.ifButton);
        Button iffButton = root.findViewById(R.id.iffButton);
        Button submitButtonForTT = root.findViewById(R.id.submitButtonForTT);

        xorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "⊕";
                ttInputText.setText(setTxt);
            }
        });

        deleteButtonForTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ttInputText.getText().toString();
                if (text.length() == 1) {
                    ttInputText.setText("");
                }
                else {
                    text = text.substring(0, text.length() - 1);
                    ttInputText.setText(text);
                }
            }
        });

        orButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "∨";
                ttInputText.setText(setTxt);
            }
        });

        andButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "∧";
                ttInputText.setText(setTxt);
            }
        });

        notButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "¬";
                ttInputText.setText(setTxt);
            }
        });

        leftparentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "(";
                ttInputText.setText(setTxt);
            }
        });

        rightparentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + ")";
                ttInputText.setText(setTxt);
            }
        });

        ifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "→";
                ttInputText.setText(setTxt);
            }
        });

        iffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "↔";
                ttInputText.setText(setTxt);
            }
        });

        clearButtonForTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(" ");
            }
        });

        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "p";
                ttInputText.setText(setTxt);
            }
        });

        qButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String setTxt = ttInputText.getText() + "q";
                ttInputText.setText(setTxt);
            }
        });

        submitButtonForTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((ttInputText.getText().toString().equals(" ¬(p∧q)") || ttInputText.getText().toString().equals(" ¬p∨¬q"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" p→q") || ttInputText.getText().toString().equals(" ¬p∨q") ||
                        ttInputText.getText().toString().equals(" ¬q→¬p"))){
                    String setTxt =  "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" p∨q") || ttInputText.getText().toString().equals(" ¬p→q") ||
                        ttInputText.getText().toString().equals(" q∨p"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" p↔q") || ttInputText.getText().toString().equals(" (p→q)∧(q→p)") ||
                        ttInputText.getText().toString().equals(" ¬p↔¬q") || ttInputText.getText().toString().equals(" (p∧q)∨(¬p∧¬q)") ||
                        ttInputText.getText().toString().equals(" ¬(p⊕q)"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" p⊕q") || ttInputText.getText().toString().equals(" q⊕p") ||
                        ttInputText.getText().toString().equals(" ¬(p↔q)") || ttInputText.getText().toString().equals(" p↔¬q"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" ¬(p∨q)") || ttInputText.getText().toString().equals(" ¬p∧¬q") ||
                        ttInputText.getText().toString().equals(" ¬(¬p→q)"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" p∧q") || ttInputText.getText().toString().equals(" ¬(p→¬q)") ||
                        ttInputText.getText().toString().equals(" q∧p"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n";
                    ttOutputText.setText(setTxt);
                        }

                if ((ttInputText.getText().toString().equals(" ¬p∧q") || ttInputText.getText().toString().equals(" p∧¬q"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n";
                    ttOutputText.setText(setTxt);
                }

                if ((ttInputText.getText().toString().equals(" ¬(p→q)") || ttInputText.getText().toString().equals(" p∧¬q"))){
                    String setTxt = "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n";
                    ttOutputText.setText(setTxt);
                }
            }
        });

        return root;
    }
}