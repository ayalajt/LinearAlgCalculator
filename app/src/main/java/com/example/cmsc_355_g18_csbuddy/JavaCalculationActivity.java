package com.example.cmsc_355_g18_csbuddy;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class JavaCalculationActivity extends Fragment{

    private Spinner primitiveTypesSpinner1;
    private Spinner primitiveTypesSpinner2;

    private JavaArithmetic.DataTypes t1;
    private JavaArithmetic.DataTypes t2;

    private Number number1 = 0;
    private String str = "";
    private Number number2 = 0;
    private String operator = "+";
    private String answer = "";

    private TextView viewOperation;
    private TextView viewAnswer;

    private EditText numberTextLeft;
    private EditText numberTextRight;

    private Button buttonCalculate;
    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonMultiply;
    private Button buttonDivide;

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
        bobTheTextViewBuilder(root);
        bobTheEditTextBuilder(root);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = numberTextLeft.getText()+"";
                number1 = Long.parseLong(str);
                str = numberTextRight.getText()+"";
                number2 = Long.parseLong(str);
                JavaCalculation c = new JavaCalculation(t1, number1, t2, number2);
                if(operator.equals("+"))
                    c.add();
                else if(operator.equals("-"))
                    c.subtract();
                else if(operator.equals("x"))
                    c.multiply();
                else if(operator.equals("/"))
                    c.divide();

                answer = c.getResult();
                viewAnswer.setText(answer);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "+";
                viewOperation.setText(operator);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "-";
                viewOperation.setText(operator);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = "x";
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
        return root;
    }

    private void bobTheButtonBuilder(View v){
        buttonCalculate = v.findViewById(R.id.buttonCalculate);
        buttonAdd = v.findViewById(R.id.add);
        buttonSubtract = v.findViewById(R.id.subtract);
        buttonMultiply = v.findViewById(R.id.multiply);
        buttonDivide = v.findViewById(R.id.divide);
    }

    private void bobTheTextViewBuilder(View v){
        viewOperation = v.findViewById(R.id.operatorTextView);
        viewAnswer = v.findViewById(R.id.answerTextView);
    }

    private void bobTheEditTextBuilder(View v){
        numberTextLeft = v.findViewById(R.id.numberTextLeft);
        numberTextRight = v.findViewById(R.id.numberTextRight);
    }
}
