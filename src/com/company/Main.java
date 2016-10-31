package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String names[];


        perfectSqur info = new perfectSqur();
        int randomnumber = info.getPass;

        Scanner For = new Scanner(System.in);
        System.out.println("Hello, what is your name");
        String name = For.next();
        names = For.next();
        System.out.println("Nice to meet you "+name +"your random number is"+ BLANK);
        System.out.println("If you'd like to exit type (0), if you'd like to list names type (1), if you'd like to continue press (2)");
        int answer = For.nextInt();
        do {
            if (answer == 0) {
                System.out.println("Goodbye");
                break;
            }
            if (answer == 1) {
                System.out.println(names);
                break;
            }
            if (answer == 2) {
                System.out.println("Hello, what is your name");
                String name = For.next();
                names = For.next();
                System.out.println("Nice to meet you " + name + "your random number is" + BLANK);
                System.out.println("If you'd like to exit type (0), if you'd like to list names type (1), if you'd like to continue press (2)");
                answer = For.nextInt();

            }

        }while(answer == 0|| answer == 1 || answer == 2);
    }
 }