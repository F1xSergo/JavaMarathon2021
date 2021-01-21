package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите количество этажей");
        int floor = scan.nextInt();
        if (floor <= 4 && floor >= 1) {
            System.out.println("Малоэтажный дом");
        } else if (floor <= 8 && floor >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
