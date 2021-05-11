package com.company;

import java.util.Scanner;

public class ex6 {


    public static void main(String[] args) {
        //6.Ввести с консоли n целых чисел
        System.out.print("Сколько целых чисел вы планируете ввести? ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] Numbers = new int[amount];
        System.out.print("Введите целые числа через пробел " + "и нажмите Enter: ");
        for (int i = 0; i < amount; i++) {
            Numbers[i] = scanner.nextInt();
        }
        //6.1 Четные и нечетные числа.
        for (int i = 0; i < amount; i++)
            if (Numbers[i] % 2 == 0)
                System.out.println("Чётное число:" + Numbers[i]);
            else if (Numbers[i] % 2 != 0)
                System.out.println("Нечётное число:" + Numbers[i]);

            //6.2 Наибольшее и наименьшее число.
        int max = Numbers[0];
        for (int i = 0; i < amount; i++) {
            if (max < Numbers[i])
                max = Numbers[i];
        }
        System.out.println("Наибольшее число:" + max);

        int min = Numbers[0];
        for (int i = 0; i < amount; i++) {
            if (min > Numbers[i])
                min = Numbers[i];
        }
        System.out.println("Наименьшее число:" + min);

        //6.3 Числа, которые делятся на 3 или на 9.
        for (int i = 0; i < amount; i++)
            if ((Numbers[i] % 3 == 0) )
                System.out.println("Число, которое делится на 3 или 9: " + Numbers[i]);

        //6.4 Числа, которые делятся на 5 и на 7.
        for (int i = 0; i < amount; i++)
            if ((Numbers[i] % 5 == 0) && (Numbers[i] % 7 == 0))
                System.out.println("Число, которое делится на 5 и 7: " + Numbers[i]);



        }
    }
