package com.company;

public class HelloWorld {

    public HelloWorld(int age) {
        this.age = age;

    }

    public static void main(String[] args) {

        System.out.println("Best Regards for" + ":");
        firstPerson("Zoran " + "Malinovski");
        secondPerson("Zlatko " + "Kalinski");

    }

    private int age = 35;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int birthDay = 28;

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    private int birthMonth = 4;

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public static void firstPerson(String name){
        System.out.println("Mr. " +name);
    }

    public static void secondPerson(String name){
        System.out.println("Mr. " +name);
    }

}
