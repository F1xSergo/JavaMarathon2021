package day12.task5;

public class MusicArtist  {
    private String fio;
    private int age;

    public MusicArtist(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    @Override
    public String toString() {
        return fio +" "+ age;
    }
}
