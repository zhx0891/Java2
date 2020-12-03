package lesson2;

public class Main {
    static String[][] arr1 = new String[4][4];

    static void createArr(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            System.out.println(" ");
            x++;
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ""+(int)(Math.random()*10);
                int c=(int)(Math.random()*4);
                arr[c][c] = "O";
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    static void testArr(String[][] e)  {

        if (e.length == 4 & e[0].length == 4) {

            int sum = 0;
            for (int i = 0; i < e.length; i++) {
                for (int j = 0; j < e[0].length; j++) {
                    int x=0;
                    try {
                         x = Integer.parseInt(e[i][j]);
                    }catch (Exception h){
                        System.out.println("не верный тип элемента массива");
                    }
                    sum +=x;
                }
            }
            System.out.println("Сумма массива = "+sum);
        } else {
            System.out.println("несоразмерный массив");


        }
    }

    public static void main(String[] args)  {
        createArr(arr1);
        testArr(arr1);
    }


}


