package com.company;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Введите число");
//            int x = scanner.nextInt();
//            if (x == 5){
//                System.out.println("Окончание цикла");
//                break;
//            }
//            System.out.println("Вы ввели " + x);
//        } while (true);

        int x;
        do {
            System.out.println("Введи 5");
            x = scanner.nextInt();
        } while (x != 5);
        System.out.println("Ввели 5");
    }
}
