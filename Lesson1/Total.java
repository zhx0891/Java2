package Lesson1;

public interface Total {


    default void run(int dist, Total testee) {
        int limitRun=testee.getRunLimit();
        if (limitRun > dist) System.out.println(testee.getType()+" пробежал");
        if (limitRun < dist) System.out.println(testee.getType()+" не пробежал");
    }

    default void jump(int heigh, Total testee){
        int limitJump=testee.getJumpLimit();
        if (limitJump > heigh) System.out.println(testee.getType()+" перепрыгнул");
        if (limitJump < heigh) System.out.println(testee.getType()+" не перепрыгнул");

    }
    abstract int getJumpLimit();
    abstract int getRunLimit();
    abstract String getType();

}
