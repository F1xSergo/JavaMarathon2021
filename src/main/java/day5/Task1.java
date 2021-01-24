package day5;

/**
 * . Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
 * используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 * **/

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(34);
        car.setColor("red");
        car.setModel("f34");
        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int years) {
        year = years;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String colors) {
        color = colors;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String models) {
        model = models;
    }

    public String getModel() {
        return model;
    }


}