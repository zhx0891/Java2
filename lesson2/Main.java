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
//                int c=(int)(Math.random()*4);
//                arr[c][c] = "O";
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    static void testArr(String[][] e)  throws MyArrayDataException{

        if (e.length != 4 || e[0].length != 4) {
            throw new MyArraySizeException();
        }

            int sum =0;
            int x=0;
            for (int i = 0; i < e.length; i++) {
                for (int j = 0; j < e[0].length; j++) {
                    x = Integer.parseInt(e[i][j]);
                    sum +=x;
                }

                }System.out.println("Сумма массива = "+sum);

            }

    public static void main(String[] args) {
        createArr(arr1);
        try {
            testArr(arr1);
        } catch (MyArrayDataException exc) {
            System.err.println(exc);

        }catch (MyArraySizeException exc){

        }finally {
            System.out.println("FINAL");
        }


    }


}


