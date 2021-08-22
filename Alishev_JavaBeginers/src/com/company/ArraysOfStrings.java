package com.company;

public class ArraysOfStrings {

    public static void main(String[] args) {
        String[] strings = new String[10];
        String res = "";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Здесь лежит " + i;
            //System.out.println(strings[i]);
        }
        System.out.println(res);
        for (String str: strings){
            System.out.println(str);
        }




        for (String str: strings) {
            res += str + " ";
        }

        System.out.println(res);
    }
}
