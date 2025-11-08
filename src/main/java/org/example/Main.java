package ru.mentee.power;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double d = 15.5;
        byte b = 127;
        float f = 123;
        double DEL = a / f;
        double CK = b * d;
        float FAL = b + f;
        int MIN = a - b;
        System.out.println("Результат деления равен:" + DEL);
        System.out.println("Результат умножения равен:" + CK);
        System.out.println("Результат сложения равен:" + FAL);
        System.out.println("Результат вычитания равен " + MIN);
    }
}
