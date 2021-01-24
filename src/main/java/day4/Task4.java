package day4;

import java.util.Arrays;
import java.util.Random;

// сделал с помощью видео(
// я думал что надо сначала найти самый большой элемент и сплюсовать рядом стоящие,
// и копал не в том направлении
public class Task4 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++)
            massiv[i] = random.nextInt(10000);
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < massiv.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += massiv[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}

