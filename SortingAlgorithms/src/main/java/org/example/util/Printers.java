package org.example.util;

public class Printers {
    public static String printArray(int[] arr){
        String temp = "";

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i] + ", ";
        }

        return temp;
    }
}
