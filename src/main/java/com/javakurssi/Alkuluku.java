package com.javakurssi;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class Alkuluku {
    public static List<Integer> Alkuluvut(int x){
        List<Integer> primaryNumbs = new ArrayList<>();
        int y = x / 2;
        double z = Math.sqrt(x);

        for (int i = y; i < x; i++) {

            for (int j = 2; j < z; j++) {
                if (i % j != 0){
                    primaryNumbs.add(i);
                    System.out.println(primaryNumbs);
                    break;
                }
            }

        }

        return primaryNumbs;
    }


}
