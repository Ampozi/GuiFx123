package com.example.guifx;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What s your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + ", How old are you?");
        int age = scan.nextInt();
        System.out.println("Okay, so you are " + age + " years old and your name is " + name);

        //System.out.println
    }
}