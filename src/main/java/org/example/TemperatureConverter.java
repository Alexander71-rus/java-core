package org.example;

class TemperatureConverter {
    public static void main(String[] args) {
        final int CALVIN=0;
        int c=25;
        double FARENGEIT=(c*9/5)+32; //Цельсий в Фаренгейт
        System.out.println("Температура в градусах Фаренгейт"+FARENGEIT);
        double CELCIA =(FARENGEIT-32)*5/9; //Фаренгейт в Цельсий
        System.out.println("Температура в градусах Цельсия"+CELCIA);
        double CELVIN =c+237.15; //Цельсий в Кельвин
        System.out.println("Температура в градусах Кельвин"+CELVIN);
        double CELCIA2=CELVIN-273.15;//Кельвин в Цельсий
        System.out.println("Температура в градусах Цельсия"+FARENGEIT);
    }
}