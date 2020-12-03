package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static int[][] arr1 = new int[4][5];

    static void createArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            System.out.println(" ");
            x++;
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        createArr(arr1);
        testArr(arr1);
        //        try {
//            testArr(arr);
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }
//        System.out.println(arr[0].length);
    }

    static void testArr(int[][] e) {

        if (e.length == 4 & e[0].length == 4) {
            int sum = 0;
            for (int i = 0; i < e.length; i++) {
                for (int j = 0; j < e[0].length; j++) {
                    sum = sum + e[i][j];
                }
            }
            System.out.println(sum);
        } else {
            ArrayIndexOutOfBoundsException myExc = new ArrayIndexOutOfBoundsException("массив слишком большой");
            throw myExc;

        }
    }
}


