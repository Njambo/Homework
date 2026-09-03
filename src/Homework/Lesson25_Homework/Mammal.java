package Homework.Lesson25_Homework;

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
