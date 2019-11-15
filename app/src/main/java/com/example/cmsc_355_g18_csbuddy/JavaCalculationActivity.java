package com.example.cmsc_355_g18_csbuddy;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class JavaCalculationActivity extends Fragment{

    private Spinner primitiveTypesSpinner1;
    private Spinner primitiveTypesSpinner2;

    private JavaArithmetic.DataTypes t1;
    private JavaArithmetic.DataTypes t2;

    //if inputting into number 1, true; else false
    private boolean left = true;

    private String number1 = "";
    private String number2 = "";
    private String operator = "+";
    private String answer = "";

    private TextView view1;
    private TextView view2;
    private TextView viewOperation;
    private TextView viewAnswer;

    private Button buttonZero;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiply;
    private Button buttonDivide;
    private Button buttonNegative;
    private Button buttonDecimal;
    private Button buttonCalculate;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_java_calculation, container, false);

        List<JavaArithmetic.DataTypes> primitveDataTypes = Arrays.asList(JavaArithmetic.DataTypes.values());

        primitiveTypesSpinner1 = root.findViewById(R.id.spinner1);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter1 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primitiveTypesSpinner1.setAdapter(adapter1);
        primitiveTypesSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                t1 = (JavaArithmetic.DataTypes)adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                t1 = JavaArithmetic.DataTypes.LONG;
            }
        });

        primitiveTypesSpinner2 = root.findViewById(R.id.spinner2);
        ArrayAdapter<JavaArithmetic.DataTypes> adapter2 = new ArrayAdapter<JavaArithmetic.DataTypes>(this.getActivity(),
                android.R.layout.simple_spinner_item, primitveDataTypes);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        primitiveTypesSpinner2.setAdapter(adapter2);
        primitiveTypesSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                t2 = (JavaArithmetic.DataTypes)adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                t2 = JavaArithmetic.DataTypes.LONG;
            }
        });

        bobTheButtonBuilder(root);
        buildTextViews(root);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(left)
                    number1 += "0";
                else
                    number2 += "0";
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "1";
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "2";
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "3";
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "4";
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "5";
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "6";
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "7";
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "8";
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "9";
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ".";
            }
        });

        buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "-";
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "+";
                viewOperation.setText(operator);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "-";
                viewOperation.setText(operator);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "X";
                viewOperation.setText(operator);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "/";
                viewOperation.setText(operator);
            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JavaCalculation c = new JavaCalculation(t1, Long.parseLong(number1), t2, Long.parseLong(number2));
                if(operator.equals("+"))
                    c.add();
                else if(operator.equals("-"))
                    c.subtract();
                else if(operator.equals("X"))
                    c.multiply();
                else if(operator.equals("/"))
                    c.divide();

                answer += c.getResult();
            }
        });

        //insert text view handlers here

        return root;
    }

    private void bobTheButtonBuilder(View v){
        buttonZero = v.findViewById(R.id.button0);
        buttonOne = v.findViewById(R.id.button1);
        buttonTwo = v.findViewById(R.id.button2);
        buttonThree = v.findViewById(R.id.button3);
        buttonFour = v.findViewById(R.id.button4);
        buttonFive = v.findViewById(R.id.button5);
        buttonSix = v.findViewById(R.id.button6);
        buttonSeven = v.findViewById(R.id.button7);
        buttonEight = v.findViewById(R.id.button8);
        buttonNine = v.findViewById(R.id.button9);
        buttonPlus = v.findViewById(R.id.buttonPlus);
        buttonMinus = v.findViewById(R.id.buttonMinus);
        buttonMultiply = v.findViewById(R.id.buttonMultiply);
        buttonDivide = v.findViewById(R.id.buttonDivide);
        buttonNegative = v.findViewById(R.id.buttonNegative);
        buttonDecimal = v.findViewById(R.id.buttonDecimal);
        buttonCalculate = v.findViewById(R.id.buttonCalculate);
    }

    private void buildTextViews(View v){
        view1 = v.findViewById(R.id.numberTextView1);
        view2 = v.findViewById(R.id.numberTextView2);
        viewOperation = v.findViewById(R.id.operatorTextView);
        viewAnswer = v.findViewById(R.id.answerText);
    }
}
