package com.company;

public class ClassesAndObjects {

    int x = 100;
    String name = "default";
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Dima";
        one.age = 19;
        one.sayHello();
        int years1 = one.cacl();
        System.out.println("Пенсия " + one.name + " через " + years1 + " лет");

        Person two = new Person();
        two.name = "ivan";
        two.age = 50;
        two.sayHello();
        int years2 = two.cacl();

    }
}

class Person {
    //
    String name;
    int age;

    void sayHello () {
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет");
    }
    int cacl (){
        int years = 65 - age;
        return years;
    }

}

class Test2 {

}
