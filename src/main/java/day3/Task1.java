package day3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (true) {
            String x = scaner.nextLine();// не понимаю почему эта строчка вне цикла делает бесконечный вывод
            switch (x) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим":
                case "Милан":
                case "Тури":
                    System.out.println("Италия");
                    continue;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    continue;
                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    continue;
            }
            break;
        }
    }
}


