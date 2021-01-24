package day4;

import java.util.Arrays;
import java.util.Random;

//сделал с помощью видео,
// так как испытал трудность с поиском строк с максимальной суммой
// c 19 по 22 строку для меня сложно было общую картину увидеть
public class Task3 {
    public static void main(String[] args) {
        int[][] massiv = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < massiv.length ; i++) {
            int sum  = 0;
            for (int j = 0; j <massiv[i].length ; j++) {
                sum += massiv[i][j];
            }
           if(sum >= maxSum){
               maxSum = sum;
               maxSumIndex = i;
           }
        }
        System.out.println("Индекс с максимальной суммой - " + maxSumIndex);
    }
}
    






