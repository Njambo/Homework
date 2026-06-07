package Homework.Lesson24_Homework;

public class One {
    public static void main(String[] args) {
        Animal.Mechenosea m = new Animal.Mechenosea("Karl");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        Speakable s1 = new Pingvin("Kovalski");
        s1.speak();
        Animal a = new Lev("Leva1");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("Leva2");
        System.out.println(mam.name);|
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();

    }
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
            System.out.println("Somebody speaks");
        }
    }

    abstract class Mechenosea extends Fish {
        Mechenosea(String name) {
            super(name);
            this.name = name;
        }

        public void swim() {
            System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
        }

        public void eat() {
            System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
        }
    }

    class Pingvin extends Bird {
        Pingvin(String name) {
            super(name);
            this.name = name;
        }

        public void eat() {
            System.out.println("Pingvin lyubit est ribu!");
        }

        public void sleep() {
            System.out.println("Pingvini spyat prijavshis drug k drugu!");
        }

        public void fly() {
            System.out.println("Pingvini ne umeyut letat!");
        }

        public void speak() {
            System.out.println("Pingvini ne umeyut pet kak solovyi");
        }
    }

    class Lev extends Mammal {
        Lev(String name) {
            super(name);
            this.name = name;
        }

        public void eat() {
            System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
        }

        public void sleep() {
            System.out.println("Bolshuyu chast dnya lev spit!");
        }

        public void run() {
            System.out.println("Lev-eto ne samaya bistraya koshka! ");
        }
    }
}