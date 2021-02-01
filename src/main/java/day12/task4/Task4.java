package day12.task4;

/**
 *Выполнять в подпапке task4 в day12*
 Скопировать MusicBand из прошлого задания и доработать таким образом,
 чтобы в группу можно было добавлять и удалять участников. Под участником
 понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
 Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать
 метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
 Проверить состав групп после слияния.
 .
 * **/
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(java.lang.String[] args) {

        List<String> string1 = new ArrayList<>();
        string1.add(new String("BOB"));
        string1.add(new String("TOM"));
        string1.add(new String("Serg"));

        MusicBand mb1 = new MusicBand("Band1", 1980, string1);

        List<String> string2 = new ArrayList<>();
        string2.add(new String("Sos"));
        string2.add(new String("Nof"));
        string2.add(new String("Nik"));

        MusicBand mb2 = new MusicBand("Band1", 2000, string2);

        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();


    }
}
