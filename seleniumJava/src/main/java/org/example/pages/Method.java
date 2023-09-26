package org.example.pages;

public class Method {

    public static void main(String[] args) {
        System.out.println(stringClean("Hello Bookkeeper"));
    }

    public static String stringClean(String str) { //abba
        //string with chars
        if (str.isEmpty() || str.length() <= 1) {
            return str;
        }

        char charac = str.charAt(0);
        if (charac == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            return charac + stringClean(str.substring(1));
        }
    }
}