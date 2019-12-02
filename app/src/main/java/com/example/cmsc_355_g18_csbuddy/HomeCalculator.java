package com.example.cmsc_355_g18_csbuddy;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;

public class HomeCalculator extends Fragment {
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_home_calculator, container, false);

        final Spinner inputBases = root.findViewById(R.id.inputBases);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getContext(), R.array.bases, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputBases.setAdapter(adapter1);

        final Spinner outputBases = root.findViewById(R.id.outputBases);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(getContext(), R.array.bases, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputBases.setAdapter(adapter2);

        final TextView inputText = (TextView) root.findViewById(R.id.inputText);
        final TextView answerText = (TextView) root.findViewById(R.id.answerText);
        Button oneButton = (Button) root.findViewById(R.id.oneButton);
        Button twoButton = (Button) root.findViewById(R.id.twoButton);
        Button threeButton = (Button) root.findViewById(R.id.threeButton);
        Button fourButton = (Button) root.findViewById(R.id.fourButton);
        Button fiveButton = (Button) root.findViewById(R.id.fiveButton);
        Button sixButton = (Button) root.findViewById(R.id.sixButton);
        Button sevenButton = (Button) root.findViewById(R.id.sevenButton);
        Button eightButton = (Button) root.findViewById(R.id.eightButton);
        Button nineButton = (Button) root.findViewById(R.id.nineButton);
        Button zeroButton = (Button) root.findViewById(R.id.zeroButton);
        Button aButton = (Button) root.findViewById(R.id.aButton);
        Button bButton = (Button) root.findViewById(R.id.bButton);
        Button cButton = (Button) root.findViewById(R.id.cButton);
        Button dButton = (Button) root.findViewById(R.id.dButton);
        Button eButton = (Button) root.findViewById(R.id.eButton);
        Button fButton = (Button) root.findViewById(R.id.fButton);
        Button plusButton = (Button) root.findViewById(R.id.plusButton);
        Button minusButton = (Button) root.findViewById(R.id.minusButton);
        Button multiplyButton = (Button) root.findViewById(R.id.multiplyButton);
        Button divideButton = (Button) root.findViewById(R.id.divideButton);
        Button equalsButton = (Button) root.findViewById(R.id.equalsButton);
        Button clearButton = (Button) root.findViewById(R.id.clearButton);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputTextStr = inputText.getText().toString();

                if (inputTextStr.equals("0")) {
                    inputText.setText("1");
                } else {
                    inputText.setText(inputTextStr + "1");
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
                    inputText.setText(inputTextStr + "2");
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
                    inputText.setText(inputTextStr + "3");
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
                    inputText.setText(inputTextStr + "4");
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
                    inputText.setText(inputTextStr + "5");
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
                    inputText.setText(inputTextStr + "6");
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
                    inputText.setText(inputTextStr + "7");
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
                    inputText.setText(inputTextStr + "8");
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
                    inputText.setText(inputTextStr + "9");
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
                    inputText.setText(inputTextStr + "0");
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
                    inputText.setText(inputTextStr + "A");
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
                    inputText.setText(inputTextStr + "B");
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
                    inputText.setText(inputTextStr + "C");
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
                    inputText.setText(inputTextStr + "D");
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
                    inputText.setText(inputTextStr + "E");
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
                    inputText.setText(inputTextStr + "F");
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    answerText.setText(inputTextStr + " + ");
                    inputText.setText("0");
                } else {
                    answerText.setText(answerTextStr + inputTextStr + " + ");
                    inputText.setText("0");
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    answerText.setText(inputTextStr + " - ");
                    inputText.setText("0");
                } else {
                    answerText.setText(answerTextStr + inputTextStr + " - ");
                    inputText.setText("0");
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    answerText.setText(inputTextStr + " * ");
                    inputText.setText("0");
                } else {
                    answerText.setText(answerTextStr + inputTextStr + " * ");
                    inputText.setText("0");
                }

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String answerTextStr = answerText.getText().toString();
                String inputTextStr = inputText.getText().toString();

                if (answerTextStr.equals("Answer Box") || answerTextStr.contains("=")) {
                    answerText.setText(inputTextStr + " / ");
                    inputText.setText("0");
                } else {
                    answerText.setText(answerTextStr + inputTextStr + " / ");
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

                if(answerTextStr.contains("=")){
                    answerText.setText("");
                    answerTextStr = "";
                }

                String answer = BaseCalculator.calculate(answerTextStr + inputTextStr, inputBase, outputBase);

                if (inputBase.equals("Bin")) {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.binaryToDecimal(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.binaryToDecimal(inputTextStr));
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.binaryToHex(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.binaryToHex(inputTextStr));
                            inputText.setText("0");
                        }
                    }

                } else if (inputBase.equals("Dec")) {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.decimalToBinary(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.decimalToBinary(inputTextStr));
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.decimalToHex(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.decimalToHex(inputTextStr));
                            inputText.setText("0");
                        }
                    }

                } else {

                    if (outputBase.equals("Bin")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.hexToBinary(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.hexToBinary(inputTextStr));
                            inputText.setText("0");
                        }
                    } else if (outputBase.equals("Dec")) {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + BaseConverter.hexToDecimal(inputTextStr));
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + BaseConverter.hexToDecimal(inputTextStr));
                            inputText.setText("0");
                        }
                    } else {
                        if (answerTextStr.equals("Answer Box")) {
                            answerText.setText(inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                        else if(answerTextStr.contains("+") || answerTextStr.contains("-") || answerTextStr.contains("*") || answerTextStr.contains("/")) {
                            answerText.setText(answerTextStr + inputTextStr + " = " + answer);
                            inputText.setText("0");
                        }
                        else {
                            answerText.setText(answerTextStr + inputTextStr + " = " + inputTextStr);
                            inputText.setText("0");
                        }
                    }

                }

            }
        });

        return root;
    }
}
