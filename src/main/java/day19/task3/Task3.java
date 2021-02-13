package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {

        DisplayTaxiMap displayTaxiMap = new DisplayTaxiMap();
        File text = new File("F:/JavaProject/JavaMarathon2021/src/main/resources/taxi_cars.txt");
        Scanner scanner = new Scanner(text);
        Scanner scaner = new Scanner(System.in);


        HashMap<Integer, Point> wordMap = new HashMap<>();
        scanner.useDelimiter(" ");
//проходимся сканером
        while (scanner.hasNextInt()) {
            //дальше не понял как сделать квадрат из координат
            System.out.println("Введите координаты");
            int x1 = scaner.nextInt();
            int x2 = scaner.nextInt();
            int y1 = scaner.nextInt();
            int y2 = scaner.nextInt();
            Point point1 = new Point(x1, y1);
            Point point2 = new Point(x2, y2);
            System.out.println("вы ввели ");
            //потом как-то надо присвоить ключ значения
            Integer id = scanner.nextInt();
            wordMap.put(id,point1);
            // короче потерялся я
// надо посмотреть видео, ьак как не понятно немного, как связать координаты с машиной и вывести это в рисунок

            System.out.println();
        }
    }
}

