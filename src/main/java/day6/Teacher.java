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

        int i = random.nextInt((4) + 2);
         switch (i) {
                case 2:
                    System.out.println("неудовлетворительно");
                    break;
                case 3:
                    System.out.println("удовлетворительно");
                    break;
                case 4:
                    System.out.println("хорошо");
                    break;
                case 5:
                    System.out.println("отлично");
                    break;
            }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + lesson + " на оценку " + i);
    }
}
