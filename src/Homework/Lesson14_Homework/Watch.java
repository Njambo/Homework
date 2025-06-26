package Homework.Lesson14_Homework;

public class Watch {
    public static void time() {
        OUTER:
        // hour - час
        for (int hour = 0; hour < 23; hour++) {
            MIDDLE:
            // minute - минута
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                // second - секунда
                for (int second = 0; second < 60; second++) {
                    if (second + hour > minute) {
                        continue INNER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
