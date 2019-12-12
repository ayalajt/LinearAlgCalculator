package com.example.cmsc_355_g18_csbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;


/*
/  Author: Mark Groves
/  Version: 12/10/19
*/

public class PermutationCombination extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_compute_permutations, container, false);

        final RadioGroup radioGroup = (RadioGroup) root.findViewById(R.id.radioGroup);
        RadioButton combRadioButton = (RadioButton) root.findViewById(R.id.combRadioButton);
        RadioButton permRadioButton = (RadioButton) root.findViewById(R.id.permRadioButton);
        final ToggleButton repetitionToggleButton = (ToggleButton) root.findViewById(R.id.repetitionButton);
        final EditText editText_n = (EditText) root.findViewById(R.id.editText3);
        final EditText editText_r = (EditText) root.findViewById(R.id.editText4);
        Button submitButton = (Button) root.findViewById(R.id.submitButton);
        final TextView textView1 = (TextView) root.findViewById(R.id.textViewRepetition); // repetition
        final TextView textView2 = (TextView) root.findViewById(R.id.chooseTextView); // choose
        final TextView textView3 = (TextView) root.findViewById(R.id.outputTextView); // where answer will display
        radioGroup.clearCheck(); // make buttons initially clear


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(editText_n.getText().toString());
                int r = Integer.parseInt(editText_r.getText().toString());
                Boolean toggleState = repetitionToggleButton.isChecked(); // true if repetition is on
                int output = -1;

                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    // no button selected
                    Toast.makeText(getContext(), "No answer has been selected", Toast.LENGTH_SHORT).show();
                } else {
                    // combination
                    if (selectedId == R.id.combRadioButton) {
                        // w/ repetition
                        if (toggleState) {
                            output = factorial(r + n - 1) / (factorial(r) * factorial(n - 1));
                        }
                        // no repetition
                        else {
                            output = factorial(n) / (factorial(n - r) * factorial(r));
                        }
                    }
                    // permutation
                    else if (selectedId == R.id.permRadioButton) {
                        // w/ repetition
                        if (toggleState) {
                            output = (int) Math.pow(n, r);
                        }
                        // no repetition
                        else {
                            output = factorial(n) / factorial(n - r);
                        }
                    }

                }

                textView3.setText(String.valueOf(output));
            }
        });

        return root;
    }


    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return (n * factorial(n - 1));
    }
}