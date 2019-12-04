package com.example.cmsc_355_g18_csbuddy;

import android.graphics.Path;

import androidx.annotation.NonNull;

/*****************************************************************
 File       :JavaCalculation
 Description:Generates an object consisting of two flags and two numbers with methods to perform
             basic arithmetic on both numbers based on the flags present
 Author     :Sean Stitzer
 Created    :10/9/19
 *****************************************************************/
public class JavaCalculation implements JavaArithmetic {

    private Number operand1;
    private Number operand2;

    private Number result;
    private DataTypes resultType;

    public JavaCalculation(DataTypes flag1, Number in1, DataTypes flag2, Number in2) {
        resultType = flag1;
        operand1 = approxNumByType(flag1, in1);
        operand2 = approxNumByType(flag2, in2);
    }

    /*****************************************************************
     Function    :approxNumByType
     Description :It takes a Number containing raw user input and approximates it to an initial value
                 based off of the data type
     Input       :a data type to cast the number as, a raw value encapsulated in a Number obj
     Output      :a Number obj containing the approximate value
     *****************************************************************/
    private Number approxNumByType(DataTypes t, Number n) {
        if (t == DataTypes.DOUBLE)
            return n.doubleValue();
        else if (t == DataTypes.FLOAT)
            return n.floatValue();
        else if (t == DataTypes.INT)
            return n.intValue();
        else if (t == DataTypes.SHORT)
            return n.shortValue();
        else
            return n.longValue();
//        else
//            throw new NumberFormatException();
    }

    @Override
    public void add() {
        result = operand1.longValue() + operand2.longValue();
    }

    @Override
    public void subtract() {
        result = operand1.longValue() - operand2.longValue();
    }

    @Override
    public void multiply() {
        result = operand1.longValue() * operand2.longValue();
    }

    @Override
    public void divide() {
        result = operand1.longValue() / operand2.longValue();
    }

    public String getResult() {
        return "" + approxNumByType(resultType, result);
    }
}
