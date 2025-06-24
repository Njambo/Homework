package Homework.Lesson3_Homework;

public class test1 {
    public static void main(String[] args) {
        // №1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("№1");
        System.out.println("Ответ: " + result);
        // №2
        int a = 5;
        int b = 8;
        int c = a-- - --a + ++a + a++ + a;
        int c1 = ++b - b++ + ++b - --b;
        System.out.println("№2");
        System.out.println("a) " + c);
        System.out.println("b) " + c1);
    }
}