package Lesson1;

public interface Total {
    int limitRun =0;
    int limitJump =0;

    default void run(int dist) {
        if (this.limitRun > dist) System.out.println("пробежал");
        if (this.limitRun > dist) System.out.println("не пробежал");
    }

    default void jump(int heigh){
        if (this.limitJump > heigh) System.out.println("перепрыгнул");
        if (this.limitJump > heigh) System.out.println("не перепрыгнул");

    }

}
