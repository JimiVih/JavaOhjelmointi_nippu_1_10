package com.javakurssi;

public class pinta_ala {
    static void laskePinta_alat(int x, int y, int z1, int z2){
        System.out.println("Ympyrän pinta-ala: " + Ympyrä_Pintala(x));
        System.out.println("Neliön pinta-ala: " + Neliö_Pintala(y));
        System.out.println("Suorakulmaisen kolmion pinta-ala: " + SuorakulmainenKolmio_Pintala(z1, z2));
    }

    static double Ympyrä_Pintala(double r){
        return Math.PI * Math.pow(r, 2);
    }

    static double Neliö_Pintala(double a){
        return a * a;
    }

    static double SuorakulmainenKolmio_Pintala(double a, double b){
        return a * b / 2;
    }
}
