package com.jhonas.encrypt.util;

public class CryptCesar {

    static String txt1 = "", txt2 = "";
    static int numCar = 0, num = 0;

    public static String encrypt(String dado) {

        txt1 = dado;
        numCar = txt1.length();

        for (int i = 0; i < numCar; i++)
        {
            num = txt1.charAt(i) + 5;
            txt2 += (char) num;
        }
        return txt2;

    }

    public static String decrypt(String dado) {

        txt1 = dado;
        numCar = txt1.length();

        for (int i = 0; i < numCar; i++)
        {
            num = txt1.charAt(i) - 5;
            txt2 += (char) num;

        }

        return txt2;
    }

}
