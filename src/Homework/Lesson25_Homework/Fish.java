package Homework.Lesson25_Homework;



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
