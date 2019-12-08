/*
Author  : Sean Stitzer
Date    :11/5/19
 */
package com.example.cmsc_355_g18_csbuddy;

public abstract class JavaArithmetic {

    enum DataTypes { DOUBLE, FLOAT, INT, LONG, SHORT}

    abstract void add();
    abstract void subtract();
    abstract void multiply();
    abstract void divide();
    abstract String getResult();

    /*****************************************************************
     Function    :approxNumByType
     Description :It takes a Number containing raw user input and approximates it to an initial value
     based off of the data type
     Input       :a data type to cast the number as, a raw value encapsulated in a Number obj
     Output      :a Number obj containing the approximate value
     *****************************************************************/
    public static Number approxNumByType(DataTypes t, Number n) {
        if (t == DataTypes.DOUBLE)
            return n.doubleValue();
        else if (t == DataTypes.FLOAT)
            return n.floatValue();
        else if (t == DataTypes.INT)
            return n.intValue();
        else if (t == DataTypes.SHORT)
            return n.shortValue();
        else if (t == DataTypes.LONG)
            return n.longValue();
        else
            return n.shortValue();
//        else
//            throw new NumberFormatException();
    }
}
