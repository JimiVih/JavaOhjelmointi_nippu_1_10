package com.javakurssi;

public class Euklidi {
    static double Laske(double x_1, double y_1, double x_2, double y_2){
        double kokoTulos;
        double xTulos = Math.pow(x_1 - x_2, 2);
        double yTulos = Math.pow(y_1 - y_2, 2);
        double plusTulos = xTulos + yTulos;
        kokoTulos = Math.sqrt(plusTulos);

        return kokoTulos;
    }
}
