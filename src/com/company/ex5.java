package com.company;



import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введите два целых числа через пробел и нажмите Enter: ");
        for (int i = 0; true; i++) {
            int x = numbers.nextInt();
            int y = numbers.nextInt();

            System.out.println("Sum = " + (x + y));
            System.out.println("Multiplication = " + (x * y));
        }
    }
}