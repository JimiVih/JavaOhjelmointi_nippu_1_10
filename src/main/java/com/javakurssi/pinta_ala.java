package com.javakurssi;

public class pinta_ala {
    static void laskePinta_alat(){
        System.out.println("Ympyrän pinta-ala: " + Ympyrä_Pintala(8));
        System.out.println("Neliön pinta-ala: " + Neliö_Pintala(4));
        System.out.println("Suorakulmaisen kolmion pinta-ala: " + SuorakulmainenKolmio_Pintala(6, 8));
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
