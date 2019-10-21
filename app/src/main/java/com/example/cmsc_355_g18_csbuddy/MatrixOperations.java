package com.example.cmsc_355_g18_csbuddy;/*
/ Author: Jesus Ayala
/ InitDate: 10/11/19
*/

public class MatrixOperations {

    public static int[][] matrixCreate(int row, int col) {
        int[][] matrix = new int[row][col];
        int value;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // value would be set to button presses until enter is hit
                // matrix[i][j] = value;
            }
        }
        return matrix;
    }
    public static int[][] MatrixAddition(int[][] matrixOne, int[][] matrixTwo) {
        // if "+" is pressed, then ask for 2nd matrix and then call this method
        int rowOne = matrixOne.length;
        int colOne = matrixOne[0].length;
        int rowTwo = matrixTwo.length;
        int colTwo = matrixTwo[0].length;
        int valueOne;
        int valueTwo;
        if (rowOne == rowTwo && colOne == colTwo) {
            int[][] matrixAns = new int[rowOne][colOne];
            for(int a = 0; a < matrixAns.length; a++) {
                for (int b = 0; b < matrixAns[a].length; b++) {
                    valueOne = matrixOne[a][b];
                    valueTwo = matrixTwo[a][b];
                    matrixAns[a][b] = valueOne + valueTwo;
                }
            }
            return matrixAns;
        }
        else {
            // Return: ERROR: Matrices must be same dimensions
            return null;
        }

    }
}