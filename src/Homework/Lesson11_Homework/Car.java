package Homework.Lesson11_Homework;

class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
class CarTest {
    void changeDoorCount(Car car, int doorCount) {
        car.doorCount = doorCount;
    }
    void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("красный", "V4", 2);
        Car car2 = new Car("жёлтый", "V6", 4);
        ct.changeDoorCount(car1, 3);
        ct.changeColor(car1, car2);
        System.out.println("сообщение о первой машине:        Цвет: " + car1.color + " мотор: " + car1.engine + " количество дверей " + car1.doorCount);

        System.out.println("сообщение о второй машине:        Цвет: " + car2.color + " мотор: " + car2.engine + " количество дверей " + car2.doorCount);
    }
}