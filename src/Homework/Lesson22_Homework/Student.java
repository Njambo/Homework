package Homework.Lesson22_Homework;

public class Student {
    // Имя
    private StringBuilder name;
    // Курс
    private int course;
    // Оценка
    private int grade;

    // Метод который выводит имя на экран
    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    // Метод который изменяет имя
    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    // Метод который выводит курс на экран
    public int getCourse() {
        return course;
    }

    // Метод который изменяет курс
    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    // Метод который выводит оценку на экран
    public int getGrade() {
        return grade;
    }

    // Метод который изменяет оценку
    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    // Метод который показывает информацию
    public void showInfo() {
        System.out.println("Имя: " + getName() + " курс: " + getCourse() + " оценка: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        StringBuilder sb = new StringBuilder("Ivan");
        student1.setName(sb);
        student1.setCourse(2);
        student1.setGrade(7);
        student1.showInfo();
    }
}