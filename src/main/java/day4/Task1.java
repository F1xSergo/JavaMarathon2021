package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }
        int big = 0;
        int low = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for (int s : numbers) {
            if (s > 8)
                big++;
            if (s == 1)
                low++;
            if (s % 2 == 0)
                even++;
            if (s % 2 != 0)
                odd++;
            sum = sum + s;
        }
        System.out.println("Введено число " + a +". Сгенерирован следующий массив: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + big);
        System.out.println("Количество чисел равных 1: " + low);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
