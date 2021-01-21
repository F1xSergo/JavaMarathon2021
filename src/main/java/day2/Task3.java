package day2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //System.out.println("Введите первое число");
        int a = scaner.nextInt();
        //System.out.println("Введите второе число");
        int b = scaner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        while (a < b) {
            a++;
            if (a % 10 != 0 && a % 5 == 0)
                System.out.print(a + " ");
        }
    }
}
