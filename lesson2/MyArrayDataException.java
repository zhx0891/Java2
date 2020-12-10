package lesson2;

public class MyArrayDataException extends NumberFormatException{
public MyArrayDataException() {
        super("неверный тип переданного значения массива");
    }
}
