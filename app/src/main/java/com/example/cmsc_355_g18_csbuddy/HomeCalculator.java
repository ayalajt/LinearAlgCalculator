package com.example.cmsc_355_g18_csbuddy;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
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

                if (inputText.getText().equals("0")) {
                    inputText.setText("1");
                } else {
                    inputText.setText(inputText.getText() + "1");
                }

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("2");
                } else {
                    inputText.setText(inputText.getText() + "2");
                }

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("3");
                } else {
                    inputText.setText(inputText.getText() + "3");
                }


            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("4");
                } else {
                    inputText.setText(inputText.getText() + "4");
                }

            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("5");
                } else {
                    inputText.setText(inputText.getText() + "5");
                }

            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("6");
                } else {
                    inputText.setText(inputText.getText() + "6");
                }

            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("7");
                } else {
                    inputText.setText(inputText.getText() + "7");
                }

            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("8");
                } else {
                    inputText.setText(inputText.getText() + "8");
                }

            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("9");
                } else {
                    inputText.setText(inputText.getText() + "9");
                }

            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("0");
                } else {
                    inputText.setText(inputText.getText() + "0");
                }

            }
        });

        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("A");
                } else {
                    inputText.setText(inputText.getText() + "A");
                }

            }
        });

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("B");
                } else {
                    inputText.setText(inputText.getText() + "B");
                }

            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("C");
                } else {
                    inputText.setText(inputText.getText() + "C");
                }

            }
        });

        dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("D");
                } else {
                    inputText.setText(inputText.getText() + "D");
                }

            }
        });

        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("E");
                } else {
                    inputText.setText(inputText.getText() + "E");
                }

            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputText.getText().equals("0")) {
                    inputText.setText("F");
                } else {
                    inputText.setText(inputText.getText() + "F");
                }

            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answerText.getText().equals("Answer Box")) {
                    answerText.setText(inputText.getText() + " + ");
                    inputText.setText("");
                } else {
                    answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " + ");
                    inputText.setText("");
                }
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answerText.getText().equals("Answer Box")) {
                    answerText.setText(inputText.getText() + " - ");
                    inputText.setText("");
                } else {
                    answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " - ");
                    inputText.setText("");
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answerText.getText().equals("Answer Box")) {
                    answerText.setText(inputText.getText() + " * ");
                    inputText.setText("");
                } else {
                    answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " * ");
                    inputText.setText("");
                }

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (answerText.getText().equals("Answer Box")) {
                    answerText.setText(inputText.getText() + " / ");
                    inputText.setText("");
                } else {
                    answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " / ");
                    inputText.setText("");
                }

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!inputText.getText().equals("")) {
                    inputText.setText("");
                } else {
                    answerText.setText("");
                }

            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (inputBases.getSelectedItem().toString().equals("Bin")) {

                    if (outputBases.getSelectedItem().toString().equals("Bin")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        }
                    } else if (outputBases.getSelectedItem().toString().equals("Dec")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.binaryToDecimal(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.binaryToDecimal(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    } else {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.binaryToHex(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.binaryToHex(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    }

                } else if (inputBases.getSelectedItem().toString().equals("Dec")) {

                    if (outputBases.getSelectedItem().toString().equals("Bin")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.decimalToBinary(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.decimalToBinary(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    } else if (outputBases.getSelectedItem().toString().equals("Dec")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        }
                    } else {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.decimalToHex(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.decimalToHex(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    }

                } else {

                    if (outputBases.getSelectedItem().toString().equals("Bin")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.hexToBinary(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.hexToBinary(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    } else if (outputBases.getSelectedItem().toString().equals("Dec")) {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + BaseConverter.hexToDecimal(inputText.getText().toString()));
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + BaseConverter.hexToDecimal(inputText.getText().toString()));
                            inputText.setText("");
                        }
                    } else {
                        if (answerText.getText().toString().equals("Answer Box")) {
                            answerText.setText(inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        } else {
                            answerText.setText(answerText.getText().toString() + inputText.getText().toString() + " = " + inputText.getText().toString());
                            inputText.setText("");
                        }
                    }

                }

            }
        });

        return root;
    }
}
