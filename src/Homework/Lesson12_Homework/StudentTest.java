package Homework.Lesson12_Homework;

 class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // swap - менять
    public static void swap(Student student1, Student student2) {
        Student student3 = student1;
        student1 = student2;
        student2 = student3;
        System.out.println(student1.name);
        System.out.println(student2.name);
        student3 = null;
    }

    public static void changeName(Student student1) {
        student1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 3, 9.5);
        Student student2 = new Student("Petr", 1, 5.3);
        changeName(student2);
        System.out.println(student2.name);
    }
}

public class StudentTest {
    public static void method1(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course && student1.grade == student2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void method2(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            if (student1.course == student2.course) {
                if (student1.grade == student2.grade) {
                    System.out.println("Имена студентов курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println(" имена студентов одинаковые, но курсы различаются");
            }
        } else {
            System.out.println("именно студентов различаются");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petr", 4, 9.5);
        Student st2 = new Student("Ivan", 2, 5.5);
        method1(st1, st2);
        method2(st1, st2);
    }

}