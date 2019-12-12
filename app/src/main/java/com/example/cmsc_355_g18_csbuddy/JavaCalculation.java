package com.example.cmsc_355_g18_csbuddy;

/*****************************************************************
 File       :JavaCalculation
 Description:Generates an object consisting of two flags and two numbers with methods to perform
             basic arithmetic on both numbers based on the flags present
 Author     :Sean Stitzer
 Created    :10/9/19
 *****************************************************************/
class JavaCalculation extends JavaArithmetic {

    private final Number operand1;
    private final Number operand2;

    private Number result;
    private final DataTypes resultType;

    public JavaCalculation(DataTypes flag1, Number in1, DataTypes flag2, Number in2) {
        resultType = flag1;
        operand1 = approxNumByType(flag1, in1);
        operand2 = approxNumByType(flag2, in2);
    }

    @Override
    public void add() {
        result = operand1.doubleValue() + operand2.doubleValue();
    }

    @Override
    public void subtract() {
        result = operand1.doubleValue() - operand2.doubleValue();
    }

    @Override
    public void multiply() {
        result = operand1.doubleValue() * operand2.doubleValue();
    }

    @Override
    public void divide() {
        result = operand1.doubleValue() / operand2.doubleValue();
    }

    public String getResult() {
        return "" + approxNumByType(resultType, result);
    }
}
