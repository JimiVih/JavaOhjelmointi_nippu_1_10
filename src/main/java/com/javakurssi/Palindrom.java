package com.javakurssi;

public class Palindrom {

    static boolean TarkistaSana(String _palindromi){
        String stringKaan = Kaanna(_palindromi);
        stringKaan = stringKaan.replaceAll(" ", "");
        boolean onPalin = false;
        if (stringKaan.equals(_palindromi.replaceAll(" ", ""))){
            onPalin = true;
        }

        return onPalin;
    }

    static String Kaanna(String kaannettava){
        String kaannettyString = "";
        for (int i = 0; i < kaannettava.length(); i++) {
            kaannettyString = kaannettava.charAt(i) + kaannettyString;
        }
        return kaannettyString.toLowerCase();
    }
}
