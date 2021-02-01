package day12.task5;
/**
 * *Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
 * но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist. Необходимо
 * реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом, чтобы участники были
 * - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы
 * и проверить состав групп после слияния. Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
 * чтобы они работали с объектами класса MusicArtist.
 * **/

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtist1 = new ArrayList<>();
        musicArtist1.add(new MusicArtist("BOB", 26));
        musicArtist1.add(new MusicArtist("TOM", 45));
        musicArtist1.add(new MusicArtist("Serg",54));

        MusicBand mb1 = new MusicBand("Band1", 1980, musicArtist1);

        List<MusicArtist> musicArtist2 = new ArrayList<>();
        musicArtist2.add(new MusicArtist("Sos",53));
        musicArtist2.add(new MusicArtist("Nof",45));
        musicArtist2.add(new MusicArtist("Nik",23));

        MusicBand mb2 = new MusicBand("Band1", 2000, musicArtist2);

        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();
    }
}
