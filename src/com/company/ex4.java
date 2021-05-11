package com.company;


import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль и нажмите enter: ");
        String password1 = scanner.next();
        String password2 = "qwerty";
        if (password1.equals(password2)) {
            System.out.println("Пароль верный. Добро пожаловать!");
        }
        else System.out.println("Пароль неверный. Попробуйте ещё раз.");
    }
}
