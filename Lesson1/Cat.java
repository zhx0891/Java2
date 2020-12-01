package Lesson1;

public class Cat implements  Total   {


    @Override
    public int getJumpLimit() {
        int lJ = 4;
        return lJ ;
    }

    @Override
    public int getRunLimit() {
        int lR = 20;
        return lR ;
    }

    @Override
    public String getType() {
        String type ="Кот";
        return type;
    }
}
