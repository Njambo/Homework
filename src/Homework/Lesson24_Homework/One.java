package Homework.Lesson24_Homework;

public class One {
}

abstract class Animal {
    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
    abstract class Fish extends Animal {
        Fish(String name) {
            super(name);
            this.name = name;
        }
        public void sleep() {
            System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
        }
        abstract void swim();
    }
    abstract class Bird extends Animal implements Speakable {
        Bird(String name) {
            super(name);
            this.name = name;
        }
        abstract void fly();
        public void speak() {
            System.out.println(name + " sings");
        }
    }
    abstract class Mammal extends Animal implements Speakable {
        Mammal(String name) {
            super(name);
            this.name = name;
        }
        abstract void run();
    }
    interface Speakable {
        default void speak() {
            System. out.println ("Somebody speaks");
        }
    }
    abstract class Mechenosea extends Fish {
        Mechenosea(String name) {
            super(name);
            this.name = name;
        }
    }
}