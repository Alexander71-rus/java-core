package ru.mentee.power;

import java.util.HashMap;

public class DataTypesInAction {
    public static void main(String[] args) {
        int a =5;
        int b= 2;
        System.out.println(a/b);// 1. Деление целых чисел с отбрасыванием дробной части
        int c =7;
        double w =2.0;
        System.out.println(c/w);// 2. Деление целого числа на число с плавающей точкой
        int v= 7;// 3. Явное приведение типов (различные варианты)
        double i= v;
        System.out.println(i);
        long x =1000000000000L;
        int u=(int)x;
        System.out.println(u);
        int z =42;
        char ch =(char) z;
        System.out.println(ch);
        byte p =15;
        byte t =25;
        System.out.println(p+t);
        int d =10;
        double g =2.5;
        System.out.println(d*g);// 4. Автоматическое повышение типа при операциях
        // 5. Операции с boolean значениями
        // 6. Работа с символами (char) и их кодами

        // Выведите результаты всех операций с пояснениями
    }
}

