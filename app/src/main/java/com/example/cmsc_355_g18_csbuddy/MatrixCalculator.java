package com.example.cmsc_355_g18_csbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MatrixCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_calculator);

        Button zeroButton = (Button) findViewById(R.id.zeroButtonForMatrix);
        Button oneButton = (Button) findViewById(R.id.oneButtonForMatrix);
        Button twoButton = (Button) findViewById(R.id.twoButtonForMatrix);
        Button threeButton = (Button) findViewById(R.id.threeButtonForMatrix);
        Button fourButton = (Button) findViewById(R.id.fourButtonForMatrix);
        Button fiveButton = (Button) findViewById(R.id.fiveButtonForMatrix);
        Button sixButton = (Button) findViewById(R.id.sixButtonForMatrix);
        Button sevenButton = (Button) findViewById(R.id.sevenButtonForMatrix);
        Button eightButton = (Button) findViewById(R.id.eightButtonForMatrix);
        Button nineButton = (Button) findViewById(R.id.nineButtonForMatrix);
        Button decimalButton = (Button) findViewById(R.id.decimalButtonForMatrix);
        Button negateButton = (Button) findViewById(R.id.negateButtonForMatrix);
        Button enterButton = (Button) findViewById(R.id.enterButtonForMatrix);
        Button plusButton = (Button) findViewById(R.id.plusButtonForMatrix);
        Button deleteButton = (Button) findViewById(R.id.deleteButtonForMatrix);
        Button clearButton = (Button) findViewById(R.id.clearButtonForMatrix);
        final TextView inputText = (TextView) findViewById(R.id.inputValueForMatrix);
        final TextView matrixMessage = (TextView) findViewById(R.id.InputMessageForMatrix);
        final TextView MatrixCreated = (TextView) findViewById(R.id.MatrixCreated);
        final TextView MatrixView = (TextView) findViewById(R.id.matrixView);


        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("1");
                }
                else{
                    inputText.setText(inputText.getText()+"1");
                }
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("2");
                }
                else{
                    inputText.setText(inputText.getText()+"2");
                }
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("3");
                }
                else{
                    inputText.setText(inputText.getText()+"3");
                }
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("4");
                }
                else{
                    inputText.setText(inputText.getText()+"4");
                }
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("5");
                }
                else{
                    inputText.setText(inputText.getText()+"5");
                }
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("6");
                }
                else{
                    inputText.setText(inputText.getText()+"6");
                }
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("7");
                }
                else{
                    inputText.setText(inputText.getText()+"7");
                }
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("8");
                }
                else{
                    inputText.setText(inputText.getText()+"8");
                }
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                    inputText.setText("9");
                }
                else{
                    inputText.setText(inputText.getText()+"9");
                }
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputText.getText().equals("0")){
                }
                else{
                    inputText.setText(inputText.getText()+"0");
                }
            }
        });













    }
}
