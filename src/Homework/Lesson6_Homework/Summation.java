package Homework.Lesson6_Homework;

public class Summation {
    int sum() {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел: " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Сумма всех чисел: " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Сумма всех чисел: " + result3);
        return result3;
    }

    int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Сумма всех чисел: " + result4);
        return result4;
    }
}

class SummationTest {
    public static void main(String[] args) {
        Summation summation1 = new Summation();
        summation1.sum();
        summation1.sum(3);
        summation1.sum(5, 5);
        summation1.sum(3, 5, 7);
        summation1.sum(3, 5, 7, 11);
    }
}

