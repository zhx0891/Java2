package lesson2;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        try {
         div(5, 0);
        }catch(Exception e){
            System.out.println("Исключение:" + e);
        }
    }
    static int div(int a, int b){
       return a/b;
    }
}

