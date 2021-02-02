package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {


        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numberString = line.split(" ");
            int[] numbers = new int[10];
            int count = 0;
            int sum = 0;

            for (String number : numberString) {
                numbers[count++] = Integer.parseInt(number);
            }

            for (int s : numbers) {
                sum += s;
            }

            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
