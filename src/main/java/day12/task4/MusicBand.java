package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(java.lang.String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (String string : band1.getMembers())
            band2.getMembers().add(string);

        band1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public List<MusicBand> getMembers(List<MusicBand> people) {

        return people;
    }

    @Override
    public java.lang.String toString() {
        return name + members;
    }
}


