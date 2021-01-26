package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("boing",34,55,233);
        Airplane a2 = new Airplane("airbus",15,55,233);
        Airplane.compareAirplanes(a1, a2);
    }
}