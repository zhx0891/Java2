package Lesson1;

public class Human implements Total {
    String type = "Человек";

    @Override
    public int getJumpLimit() {
        int lJ = 2;
        return lJ;
    }

    @Override
    public int getRunLimit() {
        int rJ = 150;
        return rJ;
    }

    @Override
    public String getType() {
        String type = "Человек";
        return type;

    }
}