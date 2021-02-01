package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MusicArtist musicArtist : band1.getMembers())
            band2.getMembers().add(musicArtist);

        band1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public List<MusicBand> getMembers(List<MusicBand> people) {

        return people;
    }

    @Override
    public String toString() {
        return name + members;
    }
}

