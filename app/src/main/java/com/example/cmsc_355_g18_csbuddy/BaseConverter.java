package com.example.cmsc_355_g18_csbuddy;/*
Author: Cole Delinski
InitDate: 10/10/19
 */

import java.lang.Math;


public class BaseConverter {

    public static String binaryToDecimal(String binNum) {

        long decNum = 0;


        if(binNum.length() > 63) {
            return "Number is too big";
        }

        for(int i = 0; i < binNum.length(); i++) {

            String binDgt = "" + binNum.charAt(i);

            if(binDgt.equals("0")) {
                decNum += 0;
            }

            else if(binDgt.equals("1")) {
                decNum += (long) Math.pow(2, binNum.length() - 1 - i);
            }

            else {
                return "Not a valid binary number";
            }
        }


        return Long.toString(decNum);
    }

    public static String decimalToBinary(String decStr) {
        try {

            long decNum = Long.parseLong(decStr);

            return Long.toBinaryString(decNum);
        }

        catch(NumberFormatException e){
            if(decStr.length() > 18) {
                return "Number is too big";
            }

            return "Not a valid decimal number";
        }
    }

    public static String hexToDecimal(String hexNum) {

        long decNum = 0;

        if(hexNum.length() > 15) {
            String firstHexDgt = "" + hexNum.charAt(0);

            if(hexNum.length() > 16 || !(firstHexDgt.equals("0") || firstHexDgt.equals("1") || firstHexDgt.equals("2") || firstHexDgt.equals("3") || firstHexDgt.equals("4") || firstHexDgt.equals("5") || firstHexDgt.equals("6") || firstHexDgt.equals("7"))) {

                return "Number is too big";

            }
        }


        for(int i = 0; i < hexNum.length(); i++) {

            String hexDgt = "" + hexNum.charAt(i);

            if(hexDgt.equals("0")) {
                decNum += 0;
            }

            else if(hexDgt.equals("1")) {
                decNum += (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("2")) {
                decNum += 2 *  (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("3")) {
                decNum += 3 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("4")) {
                decNum += 4 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("5")) {
                decNum += 5 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("6")) {
                decNum += 6 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("7")) {
                decNum += 7 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("8")) {
                decNum += 8 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("9")) {
                decNum += 9 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("A")) {
                decNum += 10 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("B")) {
                decNum += 11 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("C")) {
                decNum += 12 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("D")) {
                decNum += 13 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("E")) {
                decNum += 14 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else if(hexDgt.equals("F")) {
                decNum += 15 * (long) Math.pow(16, hexNum.length() - 1 - i);
            }

            else {
                return "Not a valid hex number";
            }

        }

        return Long.toString(decNum);

    }

    public static String decimalToHex(String decStr) {

        try {


            long decNum = Long.parseLong(decStr);

            return Long.toHexString(decNum).toUpperCase();
        }

        catch(NumberFormatException e){
            if(decStr.length() > 18) {
                return "Number is too big";
            }

            return "Not a valid decimal number";
        }
    }

    public static String hexToBinary(String hexNum) {

        String binNum = "";

        if(hexNum.length() > 15) {
            String firstHexDgt = "" + hexNum.charAt(0);

            if(hexNum.length() > 16 || !(firstHexDgt.equals("0") || firstHexDgt.equals("1") || firstHexDgt.equals("2") || firstHexDgt.equals("3") || firstHexDgt.equals("4") || firstHexDgt.equals("5") || firstHexDgt.equals("6") || firstHexDgt.equals("7"))) {

                return "Number is too big";

            }
        }


        for(int i = 0; i < hexNum.length(); i++) {

            String hexDgt = "" + hexNum.charAt(i);

            if(hexDgt.equals("0")) {
                binNum += "0000";
            }

            else if(hexDgt.equals("1")) {
                binNum += "0001";
            }

            else if(hexDgt.equals("2")) {
                binNum += "0010";
            }

            else if(hexDgt.equals("3")) {
                binNum += "0011";
            }

            else if(hexDgt.equals("4")) {
                binNum += "0100";
            }

            else if(hexDgt.equals("5")) {
                binNum += "0101";
            }

            else if(hexDgt.equals("6")) {
                binNum += "0110";
            }

            else if(hexDgt.equals("7")) {
                binNum += "0111";
            }

            else if(hexDgt.equals("8")) {
                binNum += "1000";
            }

            else if(hexDgt.equals("9")) {
                binNum += "1001";
            }

            else if(hexDgt.equals("A")) {
                binNum += "1010";
            }

            else if(hexDgt.equals("B")) {
                binNum += "1011";
            }

            else if(hexDgt.equals("C")) {
                binNum += "1100";
            }

            else if(hexDgt.equals("D")) {
                binNum += "1101";
            }

            else if(hexDgt.equals("E")) {
                binNum += "1110";
            }

            else if(hexDgt.equals("F")) {
                binNum += "1111";
            }

            else {
                return "Not a valid hex number";
            }

        }

        return binNum;

    }

    public static String binaryToHex(String binNum) {

        String decNum = binaryToDecimal(binNum);

        if(decNum.equals("Not a valid binary number")) {
            return "Not a valid binary number";
        }

        else if(decNum.equals("Number is too big")) {
            return "Number is too big";
        }

        else {
            String hexNum = decimalToHex(decNum);

            return hexNum;
        }
    }

}

