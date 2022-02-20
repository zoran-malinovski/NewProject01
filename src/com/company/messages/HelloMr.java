package com.company.messages;

public class HelloMr {

    public static void main(String[] args) {

        System.out.println("Best Regards for Gentlmens :");
        firstPerson("Jack Daniels" + " - CEO");
        secondPerson("Johnie Walker" + " - General Manager");

    }

    public static void firstPerson(String name){

        System.out.println("Mr." +name);
    }

    public static void secondPerson(String name){

        System.out.println("Mr." +name);
    }

}


