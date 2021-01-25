package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        int min = 2;
        int max = 5;
        Random random = new Random();
        int i = random.nextInt(((max - min) + 1) + max);
        String mark = switch (i) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "";
        };
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + lesson + " на оценку " + mark);
    }
}
