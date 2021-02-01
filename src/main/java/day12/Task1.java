package day12;

/**Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
  **/

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bmw");
        list.add("opel");
        list.add("mersedes");
        list.add("lada");
        list.add("reno");
        System.out.println(list);
        list.add(3,"tesla");
        list.remove(0);
        System.out.println(list);

    }
}
