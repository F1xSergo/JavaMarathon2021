package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //System.out.println("Введите первое число");
        int a = scaner.nextInt();
        //System.out.println("Введите второе число");
        int b = scaner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = ++a; i < b; i++) { // прогоняем по диапазону между а и b, не включая первую и последнюю цифру
            if (i % 10 != 0 && i % 5 == 0) // делятся на 5 без остатка, но при этом не делятся на 10 без остатка
                System.out.print(i + " ");
        }
    }
}

