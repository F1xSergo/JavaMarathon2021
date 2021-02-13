package day19;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("F:/JavaProject/JavaMarathon2021/src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(text);

        Map<String, Integer> wordMap = new HashMap<>();
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        while (scanner.hasNext()) {
            String key = scanner.next();
            Integer value = wordMap.get(key);

            if (value != null)
                wordMap.put(key, value + 1);
            else
                wordMap.put(key, 1);
        }
        List<Map.Entry<String, Integer>> statistics = new ArrayList<>(wordMap.entrySet());
        Collections.sort(statistics, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });

        List<Map.Entry<String, Integer>> topTen = statistics.subList(0, 9);
        System.out.println("Топ 10 слов ");
        for (Map.Entry<String, Integer> word : topTen) {
            System.out.println(word.getKey() + " : " + word.getValue());
        }


        System.out.println("Количество всех слов: " + wordMap.size());
        System.out.println("Количество  слов  'Чичиков' =  " + wordMap.get("Чичиков"));// Чичиков = 601

//        for (Map.Entry<String, Integer> entry : wordMap.entrySet())
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
