/*
Author  :Sean Stitzer
InitDate:10/9/19
 */
public class JavaCalculation {

    private Number operand1;
    private Number operand2;
    private Number result;
    private String type1;
    private String type2;
    private char operator;

    /*
    Calculates the result of the operation of two numbers with accounting for their data types
     */
    public JavaCalculation(String inType1, Number num1, String inType2, Number num2, char op) {
        operator = op;
        operand1 = num1;
        operand2 = num2;
        type1 = inType1;
        type2 = inType2;
        determineDataTypes();
        evaluateOperation();
    }

    /*
    determines the data types of the two operands and will truncate
     */
    private void determineDataTypes() {
        if (type1.equals("int"))
            operand1 = operand1.intValue();
        else if (type1.equals("double"))
            operand1 = operand1.doubleValue();
        else if (type1.equals("long"))
            operand1 = operand1.longValue();
        else if (type1.equals("float"))
            operand1 = operand1.floatValue();
        else if (type1.equals("short"))
            operand1 = operand1.shortValue();
        else {}

        if (type2.equals("int"))
            operand2 = operand2.intValue();
        else if (type2.equals("double"))
            operand2 = operand2.doubleValue();
        else if (type2.equals("long"))
            operand2 = operand2.longValue();
        else if (type2.equals("float"))
            operand2 = operand2.floatValue();
        else if (type2.equals("short"))
            operand2 = operand2.shortValue();
        else {}
    }

    /*
    determines the arithmetic operation based off of the character operator
     */
    private void evaluateOperation() {
        if(operator == '+'){
            add();
        }
        else if(operator == '-'){
            subtract();
        }
        else if(operator == '*'){
            multiply();
        }
        else if(operator == '/') {
            divide();
        }
        else {
            return;
        }
    }

    /*
    operand1 + operand2
     */
    private void add() {
        //result = operand1 + operand2;
    }

    /*
    operand1 - operand2
     */
    private void subtract() {
        //result = operand1 - operand2;
    }

    /*
    operand1 * operand2
     */
    private void multiply() {
        //result = operand1 * operand2;
    }

    /*
    operand1 / operand2
     */
    private void divide() {
        //result = operand1 / operand2;
    }

    public Number getResult() {
        return result;
    }
}
