package ru.mentee.power.datatype;
public class Mentee {
    // Поля
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private int level;

    // Конструктор
    public Mentee(String firstName, String lastName, int age,
                  double averageGrade, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.level = (level >= 1 && level <= 5) ? level : 1;
    }

    // Методы
    public void displayInfo() {
        System.out.println("Менти: " + firstName + " " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Уровень: " + level);
    }

    public boolean isExcellent() {
        return averageGrade >= 4.5;
    }

    public boolean advanceToNextLevel() {
        if (level < 5) {
            level++;
            return true;
        }
        return false;
    }


    public int calculateScholarship() {
        if (level>= 4.5){
            System.out.println("стипендия составляет 2000 рублей");
            if (level>= 4.0 && level < 4.5){
                System.out.println("стипендия составляет 1500 рублей");
            }
            else {
                System.out.println("стипендия составляет 1000 рублей");
            }
        }

        // Геттеры и сеттеры для доступа к приватным полям
        public String getFirstName; () {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        public int getLevel() {
            return level;
        }
    }

