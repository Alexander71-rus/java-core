package ru.mentee.power;

public  class Cisco{
    public static void main(String[] args) {
        final double RUB=0;
        final double USD = 90.50;
        final double EUR  =98.20;
        final double CNY = 12.50;
        System.out.println("Курсы валют");
        System.out.println("1USD"+USD+"RUB");
        System.out.println("1EUR"+EUR+ "RUB");
        System.out.println("1CNY"+CNY+ "RUB");

        System.out.println("Примеры конвертации:");
        System.out.println("100 USD ="+100*90.50+"RUB");
        System.out.println("100 RUB ="+100/90.50+"USD");
        System.out.println("50 EUR  ="+50*98.20+"RUB");
        System.out.println("1000 RUB  ="+1000/98.20+"EUR");
        System.out.println("250 CNY  ="+250*12.50+"RUB");


    }
}