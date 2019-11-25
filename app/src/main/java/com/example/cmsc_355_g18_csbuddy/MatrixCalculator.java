/*
/ Author: Jesus Ayala
/ InitDate: 10/11/19
*/
package com.example.cmsc_355_g18_csbuddy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MatrixCalculator extends Fragment{
    private int rowSizeOne = 0;
    private int colSizeOne = 0;
    private int rowTrackerOne = 0;
    private int colTrackerOne = 0;
    private boolean isFullOne = false;

    private int rowSizeTwo = 0;
    private int colSizeTwo = 0;
    private int rowTrackerTwo = 0;
    private int colTrackerTwo = 0;
    private boolean isFullTwo = false;
    private boolean ansFull = false;

    private double value;
    private boolean plusClicked = false;
    private boolean minusClicked = false;

    private double[][] matrixOne = new double[0][0];
    private double[][] matrixTwo = new double[0][0];
    private double[][] ansMatrix = new double[0][0];
    private String matrixValuesOne = "";
    private String matrixValuesTwo = "";

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_matrix_calculator, container, false);

        Button zeroButton = root.findViewById(R.id.zeroButtonForMatrix);
        Button oneButton = root.findViewById(R.id.oneButtonForMatrix);
        Button twoButton = root.findViewById(R.id.twoButtonForMatrix);
        Button threeButton = root.findViewById(R.id.threeButtonForMatrix);
        Button fourButton = root.findViewById(R.id.fourButtonForMatrix);
        Button fiveButton = root.findViewById(R.id.fiveButtonForMatrix);
        Button sixButton = root.findViewById(R.id.sixButtonForMatrix);
        Button sevenButton = root.findViewById(R.id.sevenButtonForMatrix);
        Button eightButton = root.findViewById(R.id.eightButtonForMatrix);
        Button nineButton = root.findViewById(R.id.nineButtonForMatrix);
        Button decimalButton = root.findViewById(R.id.decimalButtonForMatrix);
        Button negateButton = root.findViewById(R.id.negateButtonForMatrix);
        Button enterButton = root.findViewById(R.id.enterButtonForMatrix);
        Button plusButton = root.findViewById(R.id.plusButtonForMatrix);
        Button minusButton = root.findViewById(R.id.minusButtonForMatrix);
        Button clearButton = root.findViewById(R.id.clearButtonForMatrix);
        final TextView inputText = root.findViewById(R.id.inputValueForMatrix);
        final TextView matrixMessage = root.findViewById(R.id.InputMessageForMatrix);
        final TextView matrixCreated = root.findViewById(R.id.MatrixCreated);
        final TextView matrixViewOne = root.findViewById(R.id.matrixViewOne);
        final TextView matrixViewOp = root.findViewById(R.id.matrixViewOp);
        final TextView matrixViewTwo = root.findViewById(R.id.matrixViewTwo);


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
        negateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(inputText.getText().toString());
                number = number * -1;
                inputText.setText(String.valueOf(number));

            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rowSizeOne = 0;
                colSizeOne = 0;
                rowTrackerOne = 0;
                colTrackerOne = 0;
                isFullOne = false;

                rowSizeTwo = 0;
                colSizeTwo = 0;
                rowTrackerTwo = 0;
                colTrackerTwo = 0;
                isFullTwo = false;
                ansFull = false;
                plusClicked = false;

                matrixOne = new double[0][0];
                matrixTwo = new double[0][0];
                ansMatrix = new double[0][0];
                matrixValuesOne = "";
                matrixValuesTwo = "";
                matrixCreated.setText("MATRIX:");
                matrixMessage.setText("INPUT MATRIX ROW SIZE:");
                inputText.setText("0");
                matrixViewOne.setText("");
                matrixViewTwo.setText("");
                matrixViewOp.setText("");
            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().equals("0")){

                }
                else {
                    inputText.setText(inputText.getText() + ".");
                }
            }
        });

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ansFull) {
                    matrixOne = ansMatrix;
                    rowSizeOne = ansMatrix.length;
                    colSizeOne = ansMatrix[0].length;
                    isFullOne = true;
                    rowSizeTwo = 0;
                    colSizeTwo = 0;
                    matrixTwo = new double[0][0];
                    matrixValuesTwo = "";
                    rowTrackerTwo = 0;
                    colTrackerTwo = 0;
                    isFullTwo = false;
                    ansFull = false;
                }
                if (!(isFullOne)) {
                    if (rowSizeOne == 0) {
                        if (inputText.getText().toString().contains(".")) {
                            inputText.setText("0");
                            matrixMessage.setText("INPUT VALID ROW SIZE");
                        }
                        else {
                            rowSizeOne = Integer.parseInt(inputText.getText().toString());
                            if (rowSizeOne > 4 || rowSizeOne <= 0) {
                                matrixMessage.setText("INPUT VALID ROW SIZE:");
                                rowSizeOne = 0;
                                inputText.setText("0");
                            } else {
                                matrixMessage.setText("INPUT MATRIX COLUMN SIZE:");
                                inputText.setText("0");
                            }
                        }
                    } else if (colSizeOne == 0) {
                        if (inputText.getText().toString().contains(".")) {
                            inputText.setText("0");
                            matrixMessage.setText("INPUT VALID COLUMN SIZE");
                        }
                        else {
                            colSizeOne = Integer.parseInt(inputText.getText().toString());
                            if (colSizeOne > 4 || colSizeOne <= 0) {
                                matrixMessage.setText("INPUT VALID COLUMN SIZE:");
                                colSizeOne = 0;
                                inputText.setText("0");

                            } else {
                                matrixMessage.setText("INPUT VALUES:");
                                inputText.setText("0");
                            }
                        }
                    } else if (rowSizeOne > 0 && colSizeOne > 0) {
                        matrixOne = new double[rowSizeOne][colSizeOne];
                        if (rowTrackerOne < rowSizeOne) {
                            if (colTrackerOne < colSizeOne) {
                                value = Double.parseDouble(inputText.getText().toString());
                                matrixViewOne.append(String.valueOf(value) + " ");
                                matrixValuesOne = matrixValuesOne + inputText.getText() + " ";
                                inputText.setText("0");
                                if (colTrackerOne + 1 < colSizeOne) {
                                    colTrackerOne++;
                                } else {
                                    matrixViewOne.append("\n");
                                    rowTrackerOne++;
                                    colTrackerOne = 0;
                                    if (rowTrackerOne >= rowSizeOne) {
                                        String addValue;
                                        for (int i = 0; i < rowSizeOne; i++) {
                                            for (int j = 0; j < colSizeOne; j++) {
                                                String parts[] = matrixValuesOne.split(" ", 2);
                                                addValue = parts[0];
                                                matrixValuesOne = parts[1];
                                                matrixOne[i][j] = Double.parseDouble(addValue);
                                            }
                                        }
                                        matrixMessage.setText("INPUT OPERATION:");
                                        inputText.setText("0");
                                        isFullOne = true;
                                    }
                                }
                            }
                        }
                    }
                }
                else if (isFullOne && !isFullTwo && plusClicked) {
                    if (rowSizeTwo == 0) {
                        if (inputText.getText().toString().contains(".")) {
                            inputText.setText("0");
                            matrixMessage.setText("INPUT VALID ROW SIZE");
                        }
                        else {
                            rowSizeTwo = Integer.parseInt(inputText.getText().toString());
                            matrixViewTwo.setText("");
                            if (rowSizeTwo != rowSizeOne) {
                                matrixMessage.setText("INPUT VALID 2ND MATRIX ROW SIZE:");
                                rowSizeTwo = 0;
                                inputText.setText("0");
                            } else {
                                matrixMessage.setText("INPUT VALID 2ND COLUMN SIZE:");
                                inputText.setText("0");
                            }
                        }
                    } else if (colSizeTwo == 0) {
                        if (inputText.getText().toString().contains(".")) {
                            inputText.setText("0");
                            matrixMessage.setText("INPUT VALID COLUMN SIZE");
                        }
                        else {
                            colSizeTwo = Integer.parseInt(inputText.getText().toString());
                            if (colSizeTwo != colSizeOne) {
                                colSizeTwo = 0;
                                inputText.setText("0");

                            } else {
                                matrixMessage.setText("INPUT 2ND MATRIX VALUES:");
                                inputText.setText("0");
                            }
                        }
                    } else if (rowSizeTwo == rowSizeOne && colSizeTwo == colSizeOne) {
                        matrixTwo = new double[rowSizeTwo][colSizeTwo];
                        if (rowTrackerTwo < rowSizeTwo) {
                            if (colTrackerTwo < colSizeTwo) {
                                value = Double.parseDouble(inputText.getText().toString());
                                matrixViewTwo.append(String.valueOf(value) + " ");
                                matrixValuesTwo = matrixValuesTwo + inputText.getText() + " ";
                                inputText.setText("0");
                                if (colTrackerTwo + 1 < colSizeTwo) {
                                    colTrackerTwo++;
                                } else {
                                    matrixViewTwo.append("\n");
                                    rowTrackerTwo++;
                                    colTrackerTwo = 0;
                                    if (rowTrackerTwo >= rowSizeTwo) {
                                        String addValue;
                                        for (int i = 0; i < rowSizeTwo; i++) {
                                            for (int j = 0; j < colSizeTwo; j++) {
                                                String parts[] = matrixValuesTwo.split(" ", 2);
                                                addValue = parts[0];
                                                matrixValuesTwo = parts[1];
                                                matrixTwo[i][j] = Double.parseDouble(addValue);
                                            }
                                        }
                                        matrixMessage.setText("INPUT OPERATION:");
                                        inputText.setText("0");
                                        isFullTwo = true;
                                    }
                                }
                            }
                        }
                    }
                    if (isFullOne && isFullTwo) {
                        matrixViewOne.setText("");
                        ansMatrix = new double[rowSizeOne][colSizeOne];
                        double valOne;
                        double valTwo;
                        int a = 0;
                        int b = 0;
                        for (a = 0; a < ansMatrix.length; a++) {
                            if (b != 0) {
                                matrixViewOne.append("\n");
                            }
                            for (b = 0; b < ansMatrix[a].length; b++) {
                                valOne = matrixOne[a][b];
                                valTwo = matrixTwo[a][b];
                                ansMatrix[a][b] = valOne + valTwo;
                                matrixViewOne.append(String.valueOf(ansMatrix[a][b]) + " ");
                            }
                        }
                        matrixCreated.setText("ANSWER MATRIX:");
                        plusClicked = false;
                        matrixViewOp.setText("");
                        matrixViewTwo.setText("");
                        matrixMessage.setText("INPUT OPERATION FOR MATRIX");
                        ansFull = true;
                    }
                }

                else if (isFullOne && !isFullTwo && minusClicked) {
                    if (rowSizeTwo == 0) {
                        rowSizeTwo = Integer.parseInt(inputText.getText().toString());
                        matrixViewTwo.setText("");
                        if (rowSizeTwo != rowSizeOne) {
                            matrixMessage.setText("INPUT VALID 2ND MATRIX ROW SIZE:");
                            rowSizeTwo = 0;
                            inputText.setText("0");
                        } else {
                            matrixMessage.setText("INPUT VALID 2ND COLUMN SIZE:");
                            inputText.setText("0");
                        }
                    } else if (colSizeTwo == 0) {
                        colSizeTwo = Integer.parseInt(inputText.getText().toString());
                        if (colSizeTwo != colSizeOne) {
                            colSizeTwo = 0;
                            inputText.setText("0");

                        } else {
                            matrixMessage.setText("INPUT 2ND MATRIX VALUES:");
                            inputText.setText("0");
                        }
                    } else if (rowSizeTwo == rowSizeOne && colSizeTwo == colSizeOne) {
                        matrixTwo = new double[rowSizeTwo][colSizeTwo];
                        if (rowTrackerTwo < rowSizeTwo) {
                            if (colTrackerTwo < colSizeTwo) {
                                value = Double.parseDouble(inputText.getText().toString());
                                matrixViewTwo.append(String.valueOf(value) + " ");
                                matrixValuesTwo = matrixValuesTwo + inputText.getText() + " ";
                                inputText.setText("0");
                                if (colTrackerTwo + 1 < colSizeTwo) {
                                    colTrackerTwo++;
                                } else {
                                    matrixViewTwo.append("\n");
                                    rowTrackerTwo++;
                                    colTrackerTwo = 0;
                                    if (rowTrackerTwo >= rowSizeTwo) {
                                        String addValue;
                                        for (int i = 0; i < rowSizeTwo; i++) {
                                            for (int j = 0; j < colSizeTwo; j++) {
                                                String parts[] = matrixValuesTwo.split(" ", 2);
                                                addValue = parts[0];
                                                matrixValuesTwo = parts[1];
                                                matrixTwo[i][j] = Double.parseDouble(addValue);
                                            }
                                        }
                                        matrixMessage.setText("INPUT OPERATION:");
                                        inputText.setText("0");
                                        isFullTwo = true;
                                    }
                                }
                            }
                        }
                    }
                    if (isFullOne && isFullTwo) {
                        matrixViewOne.setText("");
                        ansMatrix = new double[rowSizeOne][colSizeOne];
                        double valOne;
                        double valTwo;
                        int a = 0;
                        int b = 0;
                        for (a = 0; a < ansMatrix.length; a++) {
                            if (b != 0) {
                                matrixViewOne.append("\n");
                            }
                            for (b = 0; b < ansMatrix[a].length; b++) {
                                valOne = matrixOne[a][b];
                                valTwo = matrixTwo[a][b];
                                ansMatrix[a][b] = valOne - valTwo;
                                matrixViewOne.append(String.valueOf(ansMatrix[a][b]) + " ");
                            }
                        }
                        matrixCreated.setText("ANSWER MATRIX:");
                        minusClicked = false;
                        matrixViewOp.setText("");
                        matrixViewTwo.setText("");
                        matrixMessage.setText("INPUT OPERATION FOR MATRIX");
                        ansFull = true;
                    }
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFullOne) {
                    plusClicked = true;
                    matrixViewOp.setText("+");
                }
                else {
                    inputText.setText("0");
                    matrixViewOp.setText("");
                    plusClicked = false;
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFullOne) {
                    minusClicked = true;
                    matrixViewOp.setText("-");
                }
                else {
                    inputText.setText("0");
                    matrixViewOp.setText("");
                    minusClicked = false;
                }
            }
        });

        return root;

    }
}
