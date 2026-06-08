package Homework.Lesson24_Homework;

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
