package com.company;

class Books {
    String title;
    String author;
}

public class Main {

    public static void main(String[] args) {
	    Books[] myBooks = new Books[3];
//	    myBooks[0] = new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
	    int x = 0;
	    myBooks[0].title = "1";
        myBooks[1].title = "2";
        myBooks[2].title = "3";

        myBooks[0].author = "111";
        myBooks[1].author = "222";
        myBooks[2].author = "333";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор");
            System.out.print(myBooks[x].author);
            x++;
        }

    }
}
