package com.company;

public class Arrays {
    public static void main(String[] args) {
        int number = 100; //примитивный тип данных
        char character = 'a'; //примитивный тип данных
        String s = "hello"; // ссылочный тип данных
        String s1 = new String("world"); // ссылочный тип данных

        int[] numbers = new int[10];    // numbers => [массив]
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;
            System.out.println(numbers[i]);
        }
        System.out.println();

        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }




    }
}
