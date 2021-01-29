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
        Random random = new Random();
        int i = random.nextInt((4) + 2);
        String evaluation = "";
         switch (i) {
                case 2:
                    evaluation = "неудовлетворительно";
                    break;
                case 3:
                   evaluation = "удовлетворительно";
                    break;
                case 4:
                    evaluation = "хорошо";
                    break;
                case 5:
                    evaluation = "отлично";
                    break;
            }
        System.out.println("Преподаватель " +this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.lesson + " на оценку " + evaluation);
    }
}
