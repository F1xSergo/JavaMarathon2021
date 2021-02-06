package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

//2. Реализовать программу, записывающую числа разных типов в 2 файла.
//        Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
//        Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
//
//        Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
//        Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
//        Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее
//        арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50
//        вещественных чисел (1000 / 20 = 50).
//        После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
//        Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив
//        вещественную часть.

public class Task2 {
    public static void main(String[] args) {
        printResult(new File("file2.txt"));

    }

    public static void printResult(File file) {
        File txt1 = new File("file1.txt");
        File txt2 = new File("file2.txt");
        try {
            PrintWriter wr1 = new PrintWriter(txt1);
            PrintWriter wr2 = new PrintWriter(txt2);
            Random r = new Random();
            int number = 0;
            for (int i = 0; i < 1000; i++) {
                number = r.nextInt(100);
                wr1.println(number + " ");
            }
            wr1.close();
            Scanner scanner = new Scanner(txt1);
            int count = 0;
            double sum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                sum += Double.parseDouble(line);
                count++;
                if (count == 20) {
                    wr2.print((sum / 20) + " ");
                    count = 0;
                    sum = 0;
                }
            }
            wr2.close();
           Scanner scanner2 = new Scanner(txt2);
           double result = 0;
           while (scanner2.hasNext()){
               result += Double.parseDouble(scanner2.next());
           }
            System.out.println((int)result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}















