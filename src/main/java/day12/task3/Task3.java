package day12.task3;

/**
 *Выполнять в подпапке task3 в day12*
 Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в
 классе Task3:
 public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
 основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
 Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года)
 * **/

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("band1", 1980);
        MusicBand mb2 = new MusicBand("band2", 1985);
        MusicBand mb3 = new MusicBand("band3", 1990);
        MusicBand mb4 = new MusicBand("band4", 1995);
        MusicBand mb5 = new MusicBand("band5", 2000);
        MusicBand mb6 = new MusicBand("band6", 2005);
        MusicBand mb7 = new MusicBand("band7", 2010);
        MusicBand mb8 = new MusicBand("band8", 2004);
        MusicBand mb9 = new MusicBand("band9", 2003);
        MusicBand mb10 = new MusicBand("band10", 1970);
        MusicBand mb11 = new MusicBand("band11", 2020);
        List<MusicBand> bandAll = Arrays.asList(mb1, mb2, mb3, mb4, mb5, mb6,
                mb7, mb8, mb9, mb10, mb11);

        Collections.shuffle(bandAll);
        System.out.println(bandAll);

        System.out.println(groupsAfter2000(bandAll));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                list.add(band);
        }
        return list;
    }
}
