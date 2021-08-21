package com.company;

public class Break_continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 10000) break;
        }
        System.out.println("----" + i);
    }
}
