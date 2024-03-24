package com.javakurssi;
import java.lang.reflect.Array;
import java.util.Arrays;

public class NumeroJärjestys {
    static void numJärj(){
        int[] numeroita = {8, 8, 4, 4, 5, 12, 4, 9};
        String järjestetty = Järjestä(numeroita);
        System.out.println(järjestetty);
    }
    static String Järjestä(int[] nums){
        int[] _numeroita = new int[nums.length];
        int suurinLuku = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]){
                    suurinLuku = nums[j];
                }
            }
        }

        int l = 0;
        for (int i = 0; i < suurinLuku + 1; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i){
                    _numeroita[l] = i;
                    l++;
                }
            }
        }

        System.out.println(Integer.toString(suurinLuku));
        return Arrays.toString(_numeroita);
    }


}
