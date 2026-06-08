package Homework.Lesson24_Homework;
import Homework.Lesson24_Homework.*;
public class One {
    public static void main(String[] args) {
        Mechenosea m = new Mechenosea("Kari");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        Speakable s1 = new Pingvin("Kesha");
        s1.speak();
        Animal a = new Lev("Leva1");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("leva2");
        System.out.println(mam.name);
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();
    }
}