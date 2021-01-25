package day6;

public class MotorBike {
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

    public void info() {
        System.out.println("Это Мотоцикл");
    }

    public int yearDifference(int inputYear) {
            return Math.abs(inputYear - year);

    }
}
