package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static String[][] arr1 = new String[4][4];

    static void createArr(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            System.out.println(" ");
            x++;
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ""+(int)(Math.random()*10);
//                arr[2][2] = "O";
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args)  {
        createArr(arr1);
        testArr(arr1);
    }

    static void testArr(String[][] e) {

        if (e.length == 4 & e[0].length == 4) {
            int sum = 0;
            for (int i = 0; i < e.length; i++) {
                for (int j = 0; j < e[0].length; j++) {
                    int x = Integer.parseInt (e[i][j]);
                    sum +=x;
                }
            }
            System.out.println("Сумма массива = "+sum);
        } else {
            System.out.println("несоразмерный массив");


        }
    }
}


