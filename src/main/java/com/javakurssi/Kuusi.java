package com.javakurssi;

public class Kuusi {

    static int treeHeight = 10;

    static void Start(){
        int width = 1;

        for (int i = 0; i < treeHeight - 1; i++) {
            width += 2;
        }
        System.out.println("Kuusen leveys: " + width);
        Print_Tree(treeHeight, width);
    }

    static void Print_Tree(int height, int width){
        if (height <= 3){
            return;
        }
        else {
            int currentWidth = 3;
            int spacesAmount = width;
            int spacesAmountTrunk = width;
            for (int i = 0; i < spacesAmount; i++) {
                System.out.print(' ');
            }
            System.out.println('*');
            spacesAmount -= 1;
            for (int i = 0; i < height + 1                                                       ; i++) {

                if (currentWidth < width + 1){
                    for (int h = 0; h < spacesAmount; h++) {
                        System.out.print(' ');
                    }
                }


                if (currentWidth < width + 1){
                    for (int j = 0; j < currentWidth ; j++) {
                        System.out.print('*');
                    }
                }
                else {
                    for (int h = 0; h < spacesAmountTrunk - 1; h++) {
                        System.out.print(' ');
                    }
                    System.out.print("***");
                }
                System.out.println();
                spacesAmount -= 1;
                currentWidth += 2;
            }
        }

    }
}
