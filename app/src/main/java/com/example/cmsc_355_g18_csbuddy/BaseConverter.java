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

            switch (hexDgt) {
                case "0":
                    decNum += 0;
                    break;
                case "1":
                    decNum += (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "2":
                    decNum += 2 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "3":
                    decNum += 3 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "4":
                    decNum += 4 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "5":
                    decNum += 5 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "6":
                    decNum += 6 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "7":
                    decNum += 7 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "8":
                    decNum += 8 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "9":
                    decNum += 9 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "A":
                    decNum += 10 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "B":
                    decNum += 11 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "C":
                    decNum += 12 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "D":
                    decNum += 13 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "E":
                    decNum += 14 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                case "F":
                    decNum += 15 * (long) Math.pow(16, hexNum.length() - 1 - i);
                    break;
                default:
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

        StringBuilder binNum = new StringBuilder();

        if(hexNum.length() > 15) {
            String firstHexDgt = "" + hexNum.charAt(0);

            if(hexNum.length() > 16 || !(firstHexDgt.equals("0") || firstHexDgt.equals("1") || firstHexDgt.equals("2") || firstHexDgt.equals("3") || firstHexDgt.equals("4") || firstHexDgt.equals("5") || firstHexDgt.equals("6") || firstHexDgt.equals("7"))) {

                return "Number is too big";

            }
        }


        for(int i = 0; i < hexNum.length(); i++) {

            String hexDgt = "" + hexNum.charAt(i);

            switch (hexDgt) {
                case "0":
                    binNum.append("0000");
                    break;
                case "1":
                    binNum.append("0001");
                    break;
                case "2":
                    binNum.append("0010");
                    break;
                case "3":
                    binNum.append("0011");
                    break;
                case "4":
                    binNum.append("0100");
                    break;
                case "5":
                    binNum.append("0101");
                    break;
                case "6":
                    binNum.append("0110");
                    break;
                case "7":
                    binNum.append("0111");
                    break;
                case "8":
                    binNum.append("1000");
                    break;
                case "9":
                    binNum.append("1001");
                    break;
                case "A":
                    binNum.append("1010");
                    break;
                case "B":
                    binNum.append("1011");
                    break;
                case "C":
                    binNum.append("1100");
                    break;
                case "D":
                    binNum.append("1101");
                    break;
                case "E":
                    binNum.append("1110");
                    break;
                case "F":
                    binNum.append("1111");
                    break;
                default:
                    return "Not a valid hex number";
            }

        }

        return binNum.toString();

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

            return decimalToHex(decNum);
        }
    }

}

