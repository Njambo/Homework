package Homework.Lesson8_Homework;

public class Task2 {
    public final static double PI = 3.14;

    // square - площадь
    // radius - радиус
    public double square(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }
    // length - длина
    public static double length(double radius2) {
        double dl = 2 * PI * radius2;
        return dl;
    }
    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + square(radius3));
        System.out.println("Длина окружности = " + length(radius3));
    }
}
class Task2Test {
    public static void main(String[] args) {
        Task2 z = new Task2();
        z.square(5);
        Task2.length(7.5);
        z.info(3);
    }
}