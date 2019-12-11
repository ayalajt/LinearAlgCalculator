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
        Button leftparenButton = root.findViewById(R.id.leftparenButton);
        Button rightparenButton = root.findViewById(R.id.rightparenButton);
        Button clearButtonForTT = root.findViewById(R.id.clearButtonForTT);
        Button ifButton = root.findViewById(R.id.ifButton);
        Button iffButton = root.findViewById(R.id.iffButton);
        Button submitButtonForTT = root.findViewById(R.id.submitButtonForTT);

        xorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttInputText.setText(ttInputText.getText() + "⊕");
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
                ttInputText.setText(" ");
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

                if ((ttInputText.getText().toString().equals(" ¬(p∧q)") || ttInputText.getText().toString().equals(" ¬p∨¬q"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n");
                }

                if ((ttInputText.getText().toString().equals(" p→q") || ttInputText.getText().toString().equals(" ¬p∨q") ||
                        ttInputText.getText().toString().equals(" ¬q→¬p"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n");
                }

                if ((ttInputText.getText().toString().equals(" p∨q") || ttInputText.getText().toString().equals(" ¬p→q") ||
                        ttInputText.getText().toString().equals(" q∨p"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n");
                }

                if ((ttInputText.getText().toString().equals(" p↔q") || ttInputText.getText().toString().equals(" (p→q)∧(q→p)") ||
                        ttInputText.getText().toString().equals(" ¬p↔¬q") || ttInputText.getText().toString().equals(" (p∧q)∨(¬p∧¬q)") ||
                        ttInputText.getText().toString().equals(" ¬(p⊕q)"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n");
                }

                if ((ttInputText.getText().toString().equals(" p⊕q") || ttInputText.getText().toString().equals(" q⊕p") ||
                        ttInputText.getText().toString().equals(" ¬(p↔q)") || ttInputText.getText().toString().equals(" p↔¬q"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n");
                }

                if ((ttInputText.getText().toString().equals(" ¬(p∨q)") || ttInputText.getText().toString().equals(" ¬p∧¬q") ||
                        ttInputText.getText().toString().equals(" ¬(¬p→q)"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n");
                }

                if ((ttInputText.getText().toString().equals(" p∧q") || ttInputText.getText().toString().equals(" ¬(p→¬q)") ||
                        ttInputText.getText().toString().equals(" q∧p"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n");
                        }

                if ((ttInputText.getText().toString().equals(" ¬p∧q") || ttInputText.getText().toString().equals(" p∧¬q"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n");
                }

                if ((ttInputText.getText().toString().equals(" ¬(p→q)") || ttInputText.getText().toString().equals(" p∧¬q"))){
                    ttOutputText.setText( "  " + ttInputText.getText() + "  \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "F \n"
                            + "---------\n"
                            + "T \n"
                            + "---------\n"
                            + "F \n");
                }
            }
        });

        return root;
    }
}