package com.company;

public class Main {

    public static void main(String[] args) {
	// Variables assignment
        String sByte = "8-bit signed integer. Can be used in place of int to save memory. example: ";
        String sShort = "16-bit signed integer. Can be used in place of int to save memory. example: ";
        String sInt = "32 bit signed integer. Has a supporting Integer class (Links to an external site.)Links to an " +
                "external site.example: ";
        String sLong = "64 bit integer. example: ";
        String sFloat = "Single-precision floating point (small number with a decimal point). example: ";
        String sDouble = "64 bit floating point (large number with a decimal point). example: ";
        String sBoolean = "true / false values. example: ";
        String sChar = "single 16-bit Unicode Character. example: ";

        byte bValue = 5;
        short shValue = 1024;
        int iValue = 100000;
        long lValue = 3000000;
        float fValue = (float) 2.07;
        double dValue = 42.424242;
        boolean booValue = true;
        char cValue = 'a';

        System.out.println(sByte + bValue);
        System.out.println(sShort + shValue);
        System.out.println(sInt + iValue);
        System.out.println(sLong + lValue);
        System.out.println(sFloat + fValue);
        System.out.println(sDouble + dValue);
        System.out.println(sBoolean + booValue);
        System.out.println(sChar + cValue);



    }
}
