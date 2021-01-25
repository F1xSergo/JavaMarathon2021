package day6;

import org.w3c.dom.ls.LSOutput;

public class Car {
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

    public void info(){
        System.out.println("Это автомобиль");
    }
//    int yearDifference(int inputYear) {
//        return Math.abs(inputYear - getYear());
//    }
public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}