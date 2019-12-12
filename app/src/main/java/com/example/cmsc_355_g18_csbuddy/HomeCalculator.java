package com.example.cmsc_355_g18_csbuddy;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.widget.Toast;

import java.util.Objects;

public class HomeCalculator extends Fragment {
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_home_calculator, container, false);

        final Spinner inputBases = root.findViewById(R.id.inputBases);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(Objects.requireNonNull(getContext()), R.array.bases, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputBases.setAdapter(adapter1);

        final Spinner outputBases = root.findViewById(R.id.outputBases);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getContext(), R.array.bases, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputBases.setAdapter(adapter2);


        final TextView inputText = root.findViewById(R.id.inputText);
        final TextView answerText = root.findViewById(R.id.answerText);
        Button oneButton = root.findViewById(R.id.oneButton);
        Button twoButton = root.findViewById(R.id.twoButton);
        Button threeButton = root.findViewById(R.id.threeButton);
        Button fourButton = root.findViewById(R.id.fourButton);
        Button fiveButton = root.findViewById(R.id.fiveButton);
        Button sixButton = root.findViewById(R.id.sixButton);
        Button sevenButton = root.findViewById(R.id.sevenButton);
        Button eightButton = root.findViewById(R.id.eightButton);
        Button nineButton = root.findViewById(R.id.nineButton);
        Button zeroButton = root.findViewById(R.id.zeroButton);
        Button aButton = root.findViewById(R.id.aButton);
        Button bButton = root.findViewById(R.id.bButton);
        Button cButton = root.findViewById(R.id.cButton);
        Button dButton = root.findViewById(R.id.dButton);
        Button eButton = root.findViewById(R.id.eButton);
        Button fButton = root.findViewById(R.id.fButton);
        Button plusButton = root.findViewById(R.id.plusButton);
        Button minusButton = root.findViewById(R.id.minusButton);
        Button multiplyButton = root.findViewById(R.id.multiplyButton);
        Button divideButton = root.findViewById(R.id.divideButton);
        Button equalsButton = root.findViewById(R.id.equalsButton);
        Button clearButton = root.findViewById(R.id.clearButton);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("1");
                } else {
                    String setTxt = inputTextStr + "1";
                    inputText.setText(setTxt);
                }
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("2");
                } else {
                    String setTxt = inputTextStr + "2";
                    inputText.setText(setTxt);
                }
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("3");
                } else {
                    String setTxt = inputTextStr + "3";
                    inputText.setText(setTxt);
                }
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("4");
                } else {
                    String setTxt = inputTextStr + "4";
                    inputText.setText(setTxt);
                }
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("5");
                } else {
                    String setTxt = inputTextStr + "5";
                    inputText.setText(setTxt);
                }
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("6");
                } else {
                    String setTxt = inputTextStr + "6";
                    inputText.setText(setTxt);
                }
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("7");
                } else {
                    String setTxt = inputTextStr + "7";
                    inputText.setText(setTxt);
                }
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("8");
                } else {
                    String setTxt = inputTextStr + "8";
                    inputText.setText(setTxt);
                }
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("9");
                } else {
                    String setTxt = inputTextStr + "9";
                    inputText.setText(setTxt);
                }
            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("0");
                } else {
                    String setTxt = inputTextStr + "0";
                    inputText.setText(setTxt);
                }
            }
        });

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("A");
                } else {
                    String setTxt = inputTextStr + "A";
                    inputText.setText(setTxt);
                }
            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("B");
                } else {
                    String setTxt = inputTextStr + "B";
                    inputText.setText(setTxt);
                }
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("C");
                } else {
                    String setTxt = inputTextStr + "C";
                    inputText.setText(setTxt);
                }
            }
        });

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("D");
                } else {
                    String setTxt = inputTextStr + "D";
                    inputText.setText(setTxt);
                }
            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("E");
                } else {
                    String setTxt = inputTextStr + "E";
                    inputText.setText(setTxt);
                }
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("F");
                } else {
                    String setTxt = inputTextStr + "F";
                    inputText.setText(setTxt);
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();
                String setTxt;

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    setTxt = inputTextStr + " + ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                } else {
                    setTxt = answerTextStr + inputTextStr + " + ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();
                String setTxt;

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    setTxt = inputTextStr + " - ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                } else {
                    setTxt = answerTextStr + inputTextStr + " - ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();
                String setTxt;

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    setTxt = inputTextStr + " * ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                } else {
                    setTxt = answerTextStr + inputTextStr + " * ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                }

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();
                String setTxt;

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    setTxt = inputTextStr + " / ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                } else {
                    setTxt = answerTextStr + inputTextStr + " / ";
                    answerText.setText(setTxt);
                    inputText.setText("0");
                }

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (!inputTextStr.equals("0")) {
                    inputText.setText("0");
                } else {
                    answerText.setText("");
                }

            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();
                String inputBase = inputBases.getSelectedItem().toString();
                String outputBase = outputBases.getSelectedItem().toString();
                String setTxt;
                String answer = "";

                if(answerTextStr.contains("=")){
                    answerText.setText("");
                    answerTextStr = "";
                }

                boolean answerContainsOperator = answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/");

                if(!(answerTextStr.equals("Answer Box") || answerTextStr.equals(""))) {
                    answer = BaseCalculator.calculate(answerTextStr + inputTextStr, inputBase, outputBase);
                }

                if (inputBase.equals("Bin")) {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.binaryToDecimal(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.binaryToDecimal(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.binaryToHex(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.binaryToHex(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    }

                } else if (inputBase.equals("Dec")) {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.decimalToBinary(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.decimalToBinary(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.decimalToHex(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.decimalToHex(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    }

                } else {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.hexToBinary(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.hexToBinary(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + BaseConverter.hexToDecimal(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + BaseConverter.hexToDecimal(inputTextStr);
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            setTxt = inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else if(answerContainsOperator) {
                            setTxt = answerTextStr + inputTextStr + " = " + answer;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                        else {
                            setTxt = answerTextStr + inputTextStr + " = " + inputTextStr;
                            answerText.setText(setTxt);
                            inputText.setText("0");
                        }
                    }

                }

            }
        });

        inputBases.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String base;

                if(inputBases.getSelectedItem().equals("Dec")){
                    base = "decimal";
                }

                else if(inputBases.getSelectedItem().equals("Bin")){
                    base = "binary";
                }

                else{
                    base = "hexadecimal";
                }

                Toast.makeText(getContext(), "The input base is set to " + base, Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        outputBases.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String base;

                if(outputBases.getSelectedItem().equals("Dec")){
                    base = "decimal";
                }

                else if(outputBases.getSelectedItem().equals("Bin")){
                    base = "binary";
                }

                else{
                    base = "hexadecimal";
                }

                Toast.makeText(getContext(), "The output base is set to " + base, Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return root;
    }
}
