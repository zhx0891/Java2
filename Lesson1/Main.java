package Lesson1;

public class Main {
    static Total[] testees = {new Cat(), new Human(), new Robot()};
    static Tests[] test = {new Wall(), new Road()};

    public static void main(String[] args) {
        for (int i = 0; i < testees.length; i++) {
            for (int j = 0; j < test.length; j++) {
                justDoIt(testees[i], test[j]);
            }

        }

    }
   static void justDoIt (Total a, Tests  b) {
        a.run(b.distance);
        a.jump(b.heigh);
    }



    }

