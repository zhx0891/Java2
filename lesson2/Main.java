package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static String [][] arr = new String[4][5] ;

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            testArr(arr);
        }catch(Exception e){
            e.printStackTrace();

        }

    }

    static void testArr(String[][]  e) {

        if (e.length>4){
            ArrayIndexOutOfBoundsException myExc=new ArrayIndexOutOfBoundsException("массив слишком большой");
            throw myExc;

        }
    }
}

