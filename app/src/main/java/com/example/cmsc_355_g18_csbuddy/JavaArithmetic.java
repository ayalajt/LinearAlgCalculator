/*
Author  : Sean Stitzer
Date    :11/5/19
 */
package com.example.cmsc_355_g18_csbuddy;

public interface JavaArithmetic {

    public enum DataTypes { DOUBLE, FLOAT, INT, LONG, SHORT}

    public void add();
    public void subtract();
    public void multiply();
    public void divide();
    public Number getResult();
}
