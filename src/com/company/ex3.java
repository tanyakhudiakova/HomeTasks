package com.company;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(rand.nextInt(20));//вывод с переходом на новую строку

        }
        for (int i = 0; i < 20; i++) {
            System.out.print(rand.nextInt(20) + " "); //вывод без перехода на новую строку
        }
    }
}