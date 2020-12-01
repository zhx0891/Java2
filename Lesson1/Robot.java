package Lesson1;

public class Robot implements Total {
    String type = "Робот";

    @Override
    public int getJumpLimit() {
        int lJ = 10;
        return lJ;
    }

    @Override
    public int getRunLimit() {
        int lR = 200;
        return lR;
    }

    @Override
    public String getType() {
        String type = "Робот";
        return type;
    }
}