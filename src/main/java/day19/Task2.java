package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("F:/JavaProject/JavaMarathon2021/src/main/resources/numbers19.txt");
        Scanner scanner = new Scanner(text);
        long start = System.currentTimeMillis();
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()) {
            int count = scanner.nextInt();

            if (count > 500_000_000 && count < 600_000_000) {
                hashSet.add(count);
                //list.add(count);
            }

        }
        System.out.println("Кол-во цифр входящих в диапазон от 500млн до 600млн - " + hashSet);
       // System.out.println("Кол-во цифр входящих в диапазон от 500млн до 600млн - " + list);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " ms");
    }
}
