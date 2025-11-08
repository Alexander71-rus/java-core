package ru.mentee.power;
public class ConstantsAndScope {
    public static final int MAX = 34567;
    public static final String MIN = "NAME";
    // Константы класса (static final)

    public static void main(String[] args) {
        // Локальные переменные и локальные константы
        int a = 45;
        final String X = "AGE";      // локальная константа
        final double LOCAL_CONST = 2.5;

        // Объявляем n вне блока, чтобы она была видна и после блока
        double n;
        {
            // Переменные, видимые только внутри этого блока
            double innerValue = 1.5;
            n = innerValue; // присваиваем значение локальной переменной n
            System.out.println("Внутри блока: innerValue = " + innerValue);
        }

        // n доступна здесь, потому что объявлена в внешней области
        System.out.println("Вне блока: n = " + n);

        // Доступ к константам класса возможен напрямую (в статическом методе)
        System.out.println("MAX = " + MAX + ", MIN = " + MIN);

        // Если попытаться обратиться к innerValue здесь — будет ошибка:
        // System.out.println(innerValue); // compile error: cannot find symbol
    }

    // Метод с локальными переменными
    public static void someMethod() {
        String C = "START";
        double b = 3.5;
        // Локальные переменные метода видны только внутри someMethod
    }
}
