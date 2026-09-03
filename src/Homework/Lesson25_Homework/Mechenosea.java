package Homework.Lesson25_Homework;

class Mechenosea extends Fish {
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
