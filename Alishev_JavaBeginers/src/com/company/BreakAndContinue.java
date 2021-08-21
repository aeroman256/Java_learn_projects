package com.company;

public class BreakAndContinue {
    // EXAMPLE 1
//    public static void main(String[] args) {
//        int i = 0;
//        while (true) {
//            if (i == 10){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Finish");
//    }
    //EXAMPLE 2
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Finish");
    }
}
