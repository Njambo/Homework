package Homework.Lesson24_Homework;

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}