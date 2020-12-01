package Lesson1;

public class Main {
    static Total[] testees = {new Cat(), new Human(), new Robot()};
    static Tests[] test = {new Wall(), new Road()};

    public static void main(String[] args) {
        for (int i = 0; i < testees.length; i++) {
                testees[i].jump(test[0].getHeigh(), testees[1]);
                testees[i].run(test[0].getDistance(), testees[1]);
          }

        }

    }






