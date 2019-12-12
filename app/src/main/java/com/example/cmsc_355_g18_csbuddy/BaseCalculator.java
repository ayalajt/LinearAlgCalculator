package com.example.cmsc_355_g18_csbuddy;

import java.util.ArrayList;
import java.util.Stack;

public class BaseCalculator {

    public static String calculate(String inputExpression, String inputBase, String outputBase){
        if(inputBase.equals("Bin")){
            if(inputExpression.contains("A") || inputExpression.contains("B") || inputExpression.contains("C") || inputExpression.contains("D") || inputExpression.contains("E") || inputExpression.contains("F") || inputExpression.contains("2") || inputExpression.contains("3") || inputExpression.contains("4") || inputExpression.contains("5") || inputExpression.contains("6") || inputExpression.contains("7") || inputExpression.contains("8") || inputExpression.contains("9")){
                return "Not a valid binary expression";
            }
            else{
                String decimalExpression = binaryExpressionToDecimal(inputExpression);
                String answer = decimalCalculate(decimalExpression);
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
            String decimalExpression = hexExpressionToDecimal(inputExpression);
            String answer = decimalCalculate(decimalExpression);
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

    private static String decimalCalculate(String inputExpression){
        ArrayList<String> postfixExpression = infixToPostfix(inputExpression);
        Stack<String> stack = new Stack<>();
        for(String part : postfixExpression){
            if(part.contains("1") || part.contains("2") || part.contains("3") || part.contains("4") || part.contains("5") || part.contains("6") || part.contains("7") || part.contains("8") || part.contains("9") || part.contains("0")){
                stack.push(part);
            }
            else{
                switch (part) {
                    case "+": {
                        double rightSideValue = Double.parseDouble(stack.pop());
                        double leftSideValue = Double.parseDouble(stack.pop());
                        double answer = leftSideValue + rightSideValue;
                        stack.push(Double.toString(answer));
                        break;
                    }
                    case "-": {
                        double rightSideValue = Double.parseDouble(stack.pop());
                        double leftSideValue = Double.parseDouble(stack.pop());
                        double answer = leftSideValue - rightSideValue;
                        stack.push(Double.toString(answer));
                        break;
                    }
                    case "*": {
                        double rightSideValue = Double.parseDouble(stack.pop());
                        double leftSideValue = Double.parseDouble(stack.pop());
                        double answer = leftSideValue * rightSideValue;
                        stack.push(Double.toString(answer));
                        break;
                    }
                    default: {
                        double rightSideValue = Double.parseDouble(stack.pop());
                        double leftSideValue = Double.parseDouble(stack.pop());
                        double answer = leftSideValue / rightSideValue;
                        stack.push(Double.toString(answer));
                        break;
                    }
                }
            }
        }

        return stack.pop();
    }

    private static ArrayList<String> infixToPostfix(String infixExpression){
        ArrayList<String> postfixExpression = new ArrayList<>() ;
        StringBuilder operand = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < infixExpression.length(); i++){
            boolean infixCharIsOperator = infixExpression.charAt(i) == '+' || infixExpression.charAt(i) == '-' || infixExpression.charAt(i) == '*' || infixExpression.charAt(i) == '/';

            if(i < infixExpression.length() - 1){
                if(infixExpression.charAt(i) == ' '){
                    continue;
                }
                else if(infixCharIsOperator){
                    while((!stack.isEmpty()) && OfHigherPrecedence(stack.peek(), infixExpression.charAt(i))){
                        postfixExpression.add(stack.pop().toString());
                    }

                    stack.push(infixExpression.charAt(i));
                }
                else if(infixExpression.charAt(i + 1) != ' '){
                    operand.append(infixExpression.charAt(i));
                }
                else{
                    operand.append(infixExpression.charAt(i));
                    postfixExpression.add(operand.toString());
                    operand = new StringBuilder();
                }
            }
            else{
                if(infixExpression.charAt(i) == ' '){
                    continue;
                }
                else if(infixCharIsOperator){
                        while((!stack.isEmpty()) && OfHigherPrecedence(stack.peek(), infixExpression.charAt(i))){
                        postfixExpression.add(stack.pop().toString());
                    }

                    stack.push(infixExpression.charAt(i));
                }
                else{
                    operand.append(infixExpression.charAt(i));
                    postfixExpression.add(operand.toString());
                    operand = new StringBuilder();
                }
            }
        }

        while(!stack.isEmpty()){
            postfixExpression.add(stack.pop().toString());
        }

        return postfixExpression;
    }

    private static boolean OfHigherPrecedence(char operator1, char operator2) {
        if (operator1 == '+' || operator1 == '-') {
            return operator2 != '*' && operator2 != '/';
        } else {
            return true;
        }
    }

    private static String binaryExpressionToDecimal(String binaryExpression){
        ArrayList<String> binaryTerms = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> decimalTerms = new ArrayList<>();

        String[] expression = binaryExpression.split(" ");

        for(int i = 0; i < expression.length; i++){
            if(i % 2 == 0){
                binaryTerms.add(expression[i]);
            }
            else{
                operators.add(expression[i]);
            }
        }

        for(String term : binaryTerms){
            decimalTerms.add(BaseConverter.binaryToDecimal(term));
        }

        StringBuilder decimalExpression = new StringBuilder();

        for(int i = 0; i < decimalTerms.size() - 1; i++){
            decimalExpression.append(decimalTerms.get(i));
            decimalExpression.append(" ");
            decimalExpression.append(operators.get(i));
            decimalExpression.append(" ");
        }

        decimalExpression.append(decimalTerms.get(decimalTerms.size() - 1));

        return decimalExpression.toString();
    }

    private static String hexExpressionToDecimal(String hexExpression){
        ArrayList<String> hexTerms = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> decimalTerms = new ArrayList<>();

        String[] expression = hexExpression.split(" ");

        for(int i = 0; i < expression.length; i++){
            if(i % 2 == 0){
                hexTerms.add(expression[i]);
            }
            else{
                operators.add(expression[i]);
            }
        }

        for(String term : hexTerms){
            decimalTerms.add(BaseConverter.hexToDecimal(term));
        }

        StringBuilder decimalExpression = new StringBuilder();

        for(int i = 0; i < decimalTerms.size() - 1; i++){
            decimalExpression.append(decimalTerms.get(i));
            decimalExpression.append(" ");
            decimalExpression.append(operators.get(i));
            decimalExpression.append(" ");
        }

        decimalExpression.append(decimalTerms.get(decimalTerms.size() - 1));

        return decimalExpression.toString();
    }
}
