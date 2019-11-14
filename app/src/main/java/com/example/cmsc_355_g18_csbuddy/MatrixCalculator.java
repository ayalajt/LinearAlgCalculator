package com.example.cmsc_355_g18_csbuddy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MatrixCalculator extends Fragment{

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_matrix_calculator, container, false);


        Button zeroButton = (Button) root.findViewById(R.id.zeroButtonForMatrix);
        Button oneButton = (Button) root.findViewById(R.id.oneButtonForMatrix);
        Button twoButton = (Button) root.findViewById(R.id.twoButtonForMatrix);
        Button threeButton = (Button) root.findViewById(R.id.threeButtonForMatrix);
        Button fourButton = (Button) root.findViewById(R.id.fourButtonForMatrix);
        Button fiveButton = (Button) root.findViewById(R.id.fiveButtonForMatrix);
        Button sixButton = (Button) root.findViewById(R.id.sixButtonForMatrix);
        Button sevenButton = (Button) root.findViewById(R.id.sevenButtonForMatrix);
        Button eightButton = (Button) root.findViewById(R.id.eightButtonForMatrix);
        Button nineButton = (Button) root.findViewById(R.id.nineButtonForMatrix);
        Button decimalButton = (Button) root.findViewById(R.id.decimalButtonForMatrix);
        Button negateButton = (Button) root.findViewById(R.id.negateButtonForMatrix);
        Button enterButton = (Button) root.findViewById(R.id.enterButtonForMatrix);
        Button plusButton = (Button) root.findViewById(R.id.plusButtonForMatrix);
        Button deleteButton = (Button) root.findViewById(R.id.deleteButtonForMatrix);
        Button clearButton = (Button) root.findViewById(R.id.clearButtonForMatrix);
        final TextView inputText = (TextView) root.findViewById(R.id.inputValueForMatrix);
        final TextView matrixMessage = (TextView) root.findViewById(R.id.InputMessageForMatrix);
        final TextView MatrixCreated = (TextView) root.findViewById(R.id.MatrixCreated);
        final TextView MatrixView = (TextView) root.findViewById(R.id.matrixView);


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








        return root;




    }
}
