package com.example.cmsc_355_g18_csbuddy;

import android.graphics.Path;

/*
Author  :Sean Stitzer
InitDate:10/9/19
 */
public class JavaCalculation implements JavaArithmetic {

    public enum DataTypes { DOUBLE, FLOAT, INT, LONG, SHORT}

    private Number operand1;
    private Number operand2;

    private Number result;
    private DataTypes resultType;

    public JavaCalculation(DataTypes flag1, Number in1, DataTypes flag2, Number in2) {
        resultType = flag1;
        operand1 = approxNumByType(flag1, in1);
        operand2 = approxNumByType(flag2, in2);
    }

    private Number approxNumByType(DataTypes t, Number n) {
        if (t == DataTypes.DOUBLE)
            return n.doubleValue();
        else if (t == DataTypes.FLOAT)
            return n.floatValue();
        else if (t == DataTypes.INT)
            return n.intValue();
        else if (t == DataTypes.LONG)
            return n.longValue();
        else if (t == DataTypes.SHORT)
            return n.shortValue();
        else
            throw new NumberFormatException();
    }

    @Override
    public void add() {
        result = operand1.longValue() + operand2.longValue();
        result = approxNumByType(resultType, result);
    }

    @Override
    public void subtract() {
        result = operand1.longValue() - operand2.longValue();
        result = approxNumByType(resultType, result);
    }

    @Override
    public void multiply() {
        result = operand1.longValue() * operand2.longValue();
        result = approxNumByType(resultType, result);
    }

    @Override
    public void divide() {
        result = operand1.longValue() + operand2.longValue();
        result = approxNumByType(resultType, result);
    }

    public Number getResult() {
        return result;
    }
}
