package com.javakurssi;

public class Fibbonacci {


    public static int N_nArvo(int n){
        System.out.println(n);
        int tulos = LaskeX(n);
        return tulos;
    }

    static int LaskeX(int n){

        //double tulos = 1 / Math.sqrt(5) * ((Math.pow(1 + Math.sqrt(5) / 2, n) - (Math.pow(1 - Math.sqrt(5) / 2, n))));
        double tulos = (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5);
        int tulos_i = (int)tulos;

        return tulos_i;

    }
}
