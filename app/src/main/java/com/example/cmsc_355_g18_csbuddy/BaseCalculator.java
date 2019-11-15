package com.example.cmsc_355_g18_csbuddy;

import java.util.ArrayList;
import java.util.Stack;

public class BaseCalculator {

    public static String calculate(String inputExpression, String inputBase, String outputBase){
        if(inputBase.equals("Bin")){
            return "not ready";
        }
        else if(inputBase.equals("Dec")){
            if(inputExpression.contains("A") || inputExpression.contains("B") || inputExpression.contains("C") || inputExpression.contains("D") || inputExpression.contains("E") || inputExpression.contains("F")){
                return "Not a valid decimal expression";
            }
            else{
                String answer = decimalCalculate(inputExpression);
                if(outputBase.equals("Bin")){
                    int intAnswer = (int) Double.parseDouble(answer);
                    answer = Integer.toString(intAnswer);
                    return BaseConverter.decimalToBinary(answer);
                }
                else if(outputBase.equals("Dec")){
                    if(answer.contains(".0")) {
                        int intAnswer = (int) Double.parseDouble(answer);
                        answer = Integer.toString(intAnswer);
                    }
                    return answer;
                }
                else{
                    int intAnswer = (int) Double.parseDouble(answer);
                    answer = Integer.toString(intAnswer);
                    return BaseConverter.decimalToHex(answer);
                }
            }
        }
        else{
            return "not ready";
        }
    }

    private static String decimalCalculate(String inputExpression){
        ArrayList<String> postfixExpression = infixToPostfix(inputExpression);
        Stack<String> stack = new Stack<String>();
        for(String part : postfixExpression){
            if(part.contains("1") || part.contains("2") || part.contains("3") || part.contains("4") || part.contains("5") || part.contains("6") || part.contains("7") || part.contains("8") || part.contains("9") || part.contains("0")){
                stack.push(part);
            }
            else{
                if(part.equals("+")){
                    double rightSideValue = Double.parseDouble(stack.pop());
                    double leftSideValue = Double.parseDouble(stack.pop());
                    double answer = leftSideValue + rightSideValue;
                    stack.push(Double.toString(answer));
                }
                else if(part.equals("-")){
                    double rightSideValue = Double.parseDouble(stack.pop());
                    double leftSideValue = Double.parseDouble(stack.pop());
                    double answer = leftSideValue - rightSideValue;
                    stack.push(Double.toString(answer));
                }
                else if(part.equals("*")){
                    double rightSideValue = Double.parseDouble(stack.pop());
                    double leftSideValue = Double.parseDouble(stack.pop());
                    double answer = leftSideValue * rightSideValue;
                    stack.push(Double.toString(answer));
                }
                else{
                    double rightSideValue = Double.parseDouble(stack.pop());
                    double leftSideValue = Double.parseDouble(stack.pop());
                    double answer = leftSideValue / rightSideValue;
                    stack.push(Double.toString(answer));
                }
            }
        }

        return stack.pop();
    }

    private static ArrayList<String> infixToPostfix(String infixExpression){
        ArrayList<String> postfixExpression = new ArrayList<String>() ;
        String operand = "";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < infixExpression.length(); i++){
            if(i < infixExpression.length() - 1){
                if(Character.compare(infixExpression.charAt(i), ' ') == 0){

                }
                else if(Character.compare(infixExpression.charAt(i), '+') == 0 || Character.compare(infixExpression.charAt(i), '-') == 0 || Character.compare(infixExpression.charAt(i), '*') == 0 || Character.compare(infixExpression.charAt(i), '/') == 0){
                    while((!stack.isEmpty()) && OfHigherPrecedence(stack.peek().charValue(), infixExpression.charAt(i))){
                        postfixExpression.add(stack.pop().toString());
                    }

                    stack.push(infixExpression.charAt(i));
                }
                else if(Character.compare(infixExpression.charAt(i + 1), ' ') != 0){
                    operand += infixExpression.charAt(i);
                }
                else{
                    operand += infixExpression.charAt(i);
                    postfixExpression.add(operand);
                    operand = "";
                }
            }
            else{
                if(Character.compare(infixExpression.charAt(i), ' ') == 0){

                }
                else if(Character.compare(infixExpression.charAt(i), '+') == 0 || Character.compare(infixExpression.charAt(i), '-') == 0 || Character.compare(infixExpression.charAt(i), '*') == 0 || Character.compare(infixExpression.charAt(i), '/') == 0){
                    while((!stack.isEmpty()) && OfHigherPrecedence(stack.peek().charValue(), infixExpression.charAt(i))){
                        postfixExpression.add(stack.pop().toString());
                    }

                    stack.push(infixExpression.charAt(i));
                }
                else{
                    operand += infixExpression.charAt(i);
                    postfixExpression.add(operand);
                    operand = "";
                }
            }
        }

        while(!stack.isEmpty()){
            postfixExpression.add(stack.pop().toString());
        }

        return postfixExpression;
    }

    private static boolean OfHigherPrecedence(char operator1, char operator2) {
        if (Character.compare(operator1, '+') == 0 || Character.compare(operator1, '-') == 0) {
            if (Character.compare(operator2, '*') == 0 || Character.compare(operator2, '/') == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
