package Homework.Lesson25_Homework;

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
