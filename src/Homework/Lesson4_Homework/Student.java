package Homework.Lesson4_Homework;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    // оценки по 10-ти бальной шкале
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 1;
        student1.name = "Nikolay";
        student1.surname = "Ivanov";
        student1.course = 3;
        student1.mathAverageGrade = 7.8;
        student1.economicsAverageGrade = 9.2;
        student1.foreignLanguageAverageGrade = 8.8;

        Student student2 = new Student();
        student2.studentId = 2;
        student2.name = "Aleksey";
        student2.surname = "Petrov";
        student2.course = 1;
        student2.mathAverageGrade = 6.3;
        student2.economicsAverageGrade = 7;
        student2.foreignLanguageAverageGrade = 8.5;

        Student student3 = new Student();
        student3.studentId = 3;
        student3.name = "Anton";
        student3.surname = "Sidorov";
        student3.course = 4;
        student3.mathAverageGrade = 9.1;
        student3.economicsAverageGrade = 9;
        student3.foreignLanguageAverageGrade = 10;
        System.out.println("Средняя арифметическая оценка студента " + student1.name + " " + student1.surname + " = " + (student1.mathAverageGrade + student1.economicsAverageGrade + student1.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента " + student2.name + " " + student2.surname + " = " + (student2.mathAverageGrade + student2.economicsAverageGrade + student2.foreignLanguageAverageGrade) / 3);
        System.out.println("Средняя арифметическая оценка студента " + student3.name + " " + student3.surname + " = " + (student3.mathAverageGrade + student3.economicsAverageGrade + student3.foreignLanguageAverageGrade) / 3);    }
}