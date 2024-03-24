package com.javakurssi;

public class Palindrom {

    static boolean TarkistaSana(String _palindromi){
        String stringKaan = Kaanna(_palindromi);
        boolean onPalin = false;
        if (stringKaan.equals(stringKaan)){
            System.out.println("kävin täällä: true");
            onPalin = true;
        }

        System.out.println("Alkuperäinen sana: " + _palindromi);
        System.out.println("Käännetty sana " + stringKaan);
        return onPalin;
    }

    static String Kaanna(String kaannettava){
        String kaannettyString = "";
        for (int i = 0; i < kaannettava.length(); i++) {
            kaannettyString = kaannettava.charAt(i) + kaannettyString;
        }
        return kaannettyString;
    }
}
