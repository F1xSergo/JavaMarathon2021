//package Tests.day6;
//
//import Tests.AbstractTest;
//import day6.MotorBike;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class Day6MotorbikeTest extends AbstractTest {
//
//    MotorBike motorbike = new MotorBike(34, "red", "x");
//
//    @Test
//    public void info() {
//        motorbike.info();
//        assertEquals("Это Мотоцикл" + System.lineSeparator(), getOutput());
//    }
//
//    @Test
//    public void yearDifference() {
//        int diff = motorbike.yearDifference(45);
//        assertEquals(11, diff, "Год выпуска мотоцикла 2000, год для сравнения 1980");
//    }
//}