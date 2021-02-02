package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);
    }


    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            if (list.toString().contains("-")) {
                throw new IllegalArgumentException("Некорректный входной файл");
            }
            System.out.println(list);
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}

