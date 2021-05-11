package com.company;


import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        System.out.println("Введите свое имя и нажмите Enter: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello,"  + scanner.nextLine() + "!");

    }
}
