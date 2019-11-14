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

    private int value;

    private int[][] matrixOne = new int[0][0];
    private int[][] matrixTwo = new int[0][0];
    private int[][] ansMatrix = new int[0][0];
    private String matrixValuesOne = "";
    private String matrixValuesTwo = "";

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
        Button minusButton = (Button) root.findViewById(R.id.minusButtonForMatrix);
        Button clearButton = (Button) root.findViewById(R.id.clearButtonForMatrix);
        final TextView inputText = (TextView) root.findViewById(R.id.inputValueForMatrix);
        final TextView matrixMessage = (TextView) root.findViewById(R.id.InputMessageForMatrix);
        final TextView matrixCreated = (TextView) root.findViewById(R.id.MatrixCreated);
        final TextView matrixView = (TextView) root.findViewById(R.id.matrixView);


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

                matrixOne = new int[0][0];
                matrixTwo = new int[0][0];
                ansMatrix = new int[0][0];
                matrixValuesOne = "";
                matrixValuesTwo = "";
                matrixCreated.setText("MATRIX:");
                matrixMessage.setText("INPUT MATRIX ROW SIZE:");
                inputText.setText("0");
                matrixView.setText("");
            }
        });

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFullOne == false) {
                    if (rowSizeOne == 0) {
                        rowSizeOne = Integer.parseInt(inputText.getText().toString());
                        if (rowSizeOne > 5 || rowSizeOne <= 0) {
                            matrixMessage.setText("INPUT VALID ROW SIZE:");
                            rowSizeOne = 0;
                            inputText.setText("0");
                        } else {
                            matrixMessage.setText("INPUT COL SIZE:");
                            inputText.setText("0");
                        }
                    } else if (colSizeOne == 0) {
                        colSizeOne = Integer.parseInt(inputText.getText().toString());
                        if (colSizeOne > 5 || colSizeOne <= 0) {
                            matrixMessage.setText("INPUT VALID COL SIZE:");
                            colSizeOne = 0;
                            inputText.setText("0");

                        } else {
                            matrixMessage.setText("INPUT VALUES:");
                            inputText.setText("0");
                        }
                    } else if (rowSizeOne > 0 && colSizeOne > 0) {
                        matrixOne = new int[rowSizeOne][colSizeOne];
                        if (rowTrackerOne < rowSizeOne) {
                            if (colTrackerOne < colSizeOne) {
                                value = Integer.parseInt(inputText.getText().toString());
                                matrixView.append(String.valueOf(value) + " ");
                                matrixValuesOne = matrixValuesOne + inputText.getText() + " ";
                                inputText.setText("0");
                                if (colTrackerOne + 1 < colSizeOne) {
                                    colTrackerOne++;
                                } else {
                                    matrixView.append("\n");
                                    rowTrackerOne++;
                                    colTrackerOne = 0;
                                    if (rowTrackerOne >= rowSizeOne) {
                                        String addValue;
                                        for (int i = 0; i < rowSizeOne; i++) {
                                            for (int j = 0; j < colSizeOne; j++) {
                                                String parts[] = matrixValuesOne.split(" ", 2);
                                                addValue = parts[0];
                                                matrixValuesOne = parts[1];
                                                matrixOne[i][j] = Integer.parseInt(addValue);
                                            }
                                        }
                                        matrixMessage.setText("INPUT 2ND MATRIX ROW SIZE:");
                                        inputText.setText("0");
                                        isFullOne = true;
                                    }
                                }
                            }
                        }
                    }
                }
                else if (isFullOne == true && isFullTwo == false) {
                    if (rowSizeTwo == 0) {
                        rowSizeTwo = Integer.parseInt(inputText.getText().toString());
                        matrixView.setText("");
                        if (rowSizeTwo > 5 || rowSizeTwo <= 0) {
                            matrixMessage.setText("INPUT VALID 2ND ROW SIZE:");
                            rowSizeTwo = 0;
                            inputText.setText("0");
                        } else {
                            matrixMessage.setText("INPUT 2ND COL SIZE:");
                            inputText.setText("0");
                        }
                    } else if (colSizeTwo == 0) {
                        colSizeTwo = Integer.parseInt(inputText.getText().toString());
                        if (colSizeTwo > 5 || colSizeTwo <= 0) {
                            matrixMessage.setText("INPUT VALID 2ND COL SIZE:");
                            colSizeTwo = 0;
                            inputText.setText("0");

                        } else {
                            matrixMessage.setText("INPUT 2ND MATRIX VALUES:");
                            inputText.setText("0");
                        }
                    } else if (rowSizeTwo > 0 && colSizeTwo > 0) {
                        matrixTwo = new int[rowSizeTwo][colSizeTwo];
                        if (rowTrackerTwo < rowSizeTwo) {
                            if (colTrackerTwo < colSizeTwo) {
                                value = Integer.parseInt(inputText.getText().toString());
                                matrixView.append(String.valueOf(value) + " ");
                                matrixValuesTwo = matrixValuesTwo + inputText.getText() + " ";
                                inputText.setText("0");
                                if (colTrackerTwo + 1 < colSizeTwo) {
                                    colTrackerTwo++;
                                } else {
                                    matrixView.append("\n");
                                    rowTrackerTwo++;
                                    colTrackerTwo = 0;
                                    if (rowTrackerTwo >= rowSizeTwo) {
                                        String addValue;
                                        for (int i = 0; i < rowSizeTwo; i++) {
                                            for (int j = 0; j < colSizeTwo; j++) {
                                                String parts[] = matrixValuesTwo.split(" ", 2);
                                                addValue = parts[0];
                                                matrixValuesTwo = parts[1];
                                                matrixTwo[i][j] = Integer.parseInt(addValue);
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
                }
                else if (isFullOne == true && isFullTwo == true) {
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rowSizeOne <= 0 || colSizeOne <= 0) {
                    matrixMessage.setText("INPUT SIZE OF 1ST MATRIX:");
                    inputText.setText("0");
                }
                else if (rowSizeTwo <= 0 || colSizeTwo <= 0){
                    matrixMessage.setText("INPUT ROW SIZE OF 2ND MATRIX");
                    inputText.setText("0");
                }
                else if (rowSizeOne == rowSizeTwo && colSizeOne == colSizeTwo) {
                    matrixView.setText("");
                    ansMatrix = new int[rowSizeOne][colSizeOne];
                    int valOne;
                    int valTwo;
                    int a = 0;
                    int b = 0;
                    for(a = 0; a < ansMatrix.length; a++) {
                        if (b != 0) {
                            matrixView.append("\n");
                        }
                        for (b = 0; b < ansMatrix[a].length; b++) {
                            valOne = matrixOne[a][b];
                            valTwo = matrixTwo[a][b];
                            ansMatrix[a][b] = valOne + valTwo;
                            matrixView.append(String.valueOf(ansMatrix[a][b]) + " ");
                        }
                    }
                    matrixCreated.setText("ANSWER MATRIX:");

                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rowSizeOne <= 0 || colSizeOne <= 0) {
                    matrixMessage.setText("INPUT SIZE OF 1ST MATRIX:");
                    inputText.setText("0");
                }
                else if (rowSizeTwo <= 0 || colSizeTwo <= 0){
                    matrixMessage.setText("INPUT ROW SIZE OF 2ND MATRIX");
                    inputText.setText("0");
                }
                else if (rowSizeOne == rowSizeTwo && colSizeOne == colSizeTwo) {
                    matrixView.setText("");
                    ansMatrix = new int[rowSizeOne][colSizeOne];
                    int valOne;
                    int valTwo;
                    int a = 0;
                    int b = 0;
                    for(a = 0; a < ansMatrix.length; a++) {
                        if (b != 0) {
                            matrixView.append("\n");
                        }
                        for (b = 0; b < ansMatrix[a].length; b++) {
                            valOne = matrixOne[a][b];
                            valTwo = matrixTwo[a][b];
                            ansMatrix[a][b] = valOne - valTwo;
                            matrixView.append(String.valueOf(ansMatrix[a][b]) + " ");
                        }
                    }
                    matrixCreated.setText("ANSWER MATRIX:");

                }
            }
        });

        return root;

    }
}
