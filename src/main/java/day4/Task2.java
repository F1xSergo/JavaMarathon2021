package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10000);
        }

        int maxIndex = massiv[0];
        int minIndex = massiv[0];
        int count = 0;
        int countSum = 0;
        for (int s : massiv) {
            if (s > maxIndex)
                maxIndex = s;
            if (s < minIndex)
                minIndex = s;
            if (s % 10 == 0)
                count++;
            if (s % 10 == 0)
                countSum = countSum + s;
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println("наибольший элемент массива " + maxIndex);
        System.out.println("наименьший элемент массива " + minIndex);
        System.out.println("количество элементов массива, оканчивающихся на 0 = " + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0 = " + countSum);
    }
}


