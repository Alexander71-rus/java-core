package org.example;

import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age= scanner.nextInt();
        System.out.println("Ваш возраст составляет"+ "   "+  age);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Есть ли у вас права?");
        String rights=scanner1.nextLine();
        if(rights.equals("Да")){
            System.out.println("Отлично , у вас есть права");
        }
        else{
            System.out.println("Плохо , у вас нет прав");
        }
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Теперь проверим сможете ли вы арендовать автомобиль");

        if(age>=18 && rights.equals("Да")) {
            System.out.println("Автомобиль можно арендовать");
        }else {
            System.out.println("Вы не можете арендовать машину");
        }
    }
}

