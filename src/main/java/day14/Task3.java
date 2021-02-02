package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("people");
        parseFileToObjList(f);
    }

    public static List<String> parseFileToObjList(File file) {
        List<String> list = new ArrayList<>();
        Human h = new Human(list);

        try {

            Scanner scanner = new Scanner(file);
            int index = 0;
            while (scanner.hasNext()) {

              //  h.name = scanner.next();
                h.setName(scanner.next());

              //  h.age = scanner.nextInt();
                h.setAge(scanner.nextInt());
                list.add(h.getName() + " " + h.getAge());
                if (h.age < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }
            }

            System.out.println(list.toString());
            scanner.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}
// закинул пока это, под видео посмотрю в чем разница, и исправлю