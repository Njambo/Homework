package Homework.Lesson25_Homework;

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}