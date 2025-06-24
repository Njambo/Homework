package Homework.Lesson5_Homework;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    // salaryIncrease - увеличение зарплаты
    double salaryIncrease() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 25, 555.55, "17");
        Employee employee2 = new Employee(2, "Petrov", 30, 888.88, "Sales");
        employee1.salaryIncrease();
        System.out.println("новая зарплата работника: " + employee1.surname + ": " + employee1.salary);
        double nowSalary = employee2.salaryIncrease();
        System.out.println("новая зарплата работника: " + employee2.surname + ": " + employee2.salary);
    }
}

