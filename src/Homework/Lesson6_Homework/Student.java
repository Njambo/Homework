package Homework.Lesson6_Homework;

public class Student {
    Student(int studentId2, String name2, String surname2, int course2, double mathAverageGrade2, double economicsAverageGrade2, double foreignLanguageAverageGrade2) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }
    Student(int studentId3, String name3, String surname3, int course3){
        this(studentId3, name3, surname3, course3, 0,0,0);
    }
    Student(){

    }

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
    // theAverageArithmeticScore - средняя арифметическая оценка
    // averageScore - средняя оценка
    double theAverageArithmeticScore(Student student) {
        double averageScore = (student.mathAverageGrade + student.economicsAverageGrade + student.foreignLanguageAverageGrade) / 3;
        System.out.println("средняя арифметическая оценка студента: " + student.name +" " + student.surname + ": " + averageScore);
        return averageScore;
    }

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
        StudentTest studentTest1 = new StudentTest();
        studentTest1.theAverageArithmeticScore(student1);
        studentTest1.theAverageArithmeticScore(student2);
        studentTest1.theAverageArithmeticScore(student3);
    }
}
