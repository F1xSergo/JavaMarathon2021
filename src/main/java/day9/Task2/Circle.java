package day9.Task2;

public class Circle extends Figure {
    private int rad;

    public Circle(int r, String color) {
        super(color);
        rad = r;

    }

    @Override
    public double area() {
        return (Math.PI  * (rad *  rad));
    }

    @Override
    public double perimeter() {
        return (2* Math.PI * rad);
    }

}
