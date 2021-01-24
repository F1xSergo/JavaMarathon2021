package day5;

/**
 Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 Вывести в консоль значение каждого из полей, используя get методы.
 * **/
public class Task2 {
    public static void main(String[] args) {
        MotorBike motorBike = new MotorBike(2,"blue","x5");
        motorBike.console();
    }
}
class MotorBike {
    private int year;
    private String color;
    private String model;

    public MotorBike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void console() {
        System.out.println(year + ", " + color + ", " + model);
    }
}
