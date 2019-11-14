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
/  Init Date: 10/9/19
*/

public class PermutationCombination extends Fragment{


    public View onCreateView(
                @NonNull LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
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

        radioGroup.clearCheck(); // make buttons initially clear


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int n = Integer.parseInt(editText_n.getText().toString());
                int r = Integer.parseInt(editText_r.getText().toString());
                Boolean toggleState = repetitionToggleButton.isChecked(); // true if repetition is on
                int val;

                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    // no button selected
                    Toast.makeText(getContext(), "No answer has been selected", Toast.LENGTH_SHORT).show();
                }
                else {
                    // combination
                    if (selectedId == R.id.combRadioButton){
                        // w/ repetition
                        if(toggleState){

                        }
                        // no repetition
                        else {
                            val = nCr(n,r);
                        }
                        

                    }
                    // permutation
                    else if (selectedId == R.id.permRadioButton){
                        // w/ repetition
                        if(toggleState){

                        }
                        // no repetition
                        else {

                        }
                    }
                }
            }
        });

        return root;
    }

    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    private static int nCr(int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return (n * factorial(n-1));
    }
}
