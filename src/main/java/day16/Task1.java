package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

//Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из задания 1 дня 14)
// и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
//Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа (со всеми
// знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
//
//Детали реализации: В классе Task1 создать публичный статический метод printResult(File file), в котором реализовать
// вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file),
// передав ему в качестве аргумента объект класса File (txt файл с целыми числами).

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberString = line.split(" ");
            double sum = 0;

            for (String number : numberString) {
                sum = sum + Double.parseDouble(number) / numberString.length;
            }
            String formattedDouble = new DecimalFormat("#0.000").format(sum);
            System.out.print(sum + " --> " + formattedDouble);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

