package Homework.Lesson7_Homework.Homework_Lesson7_1;
import Homework.Lesson7_Homework.Employee;
public class EmployeeTest2 {
    public static void main(String[] args) {
        Homework.Lesson7_Homework.Employee employee1 = new Homework.Lesson7_Homework.Employee(5);
//        Homework.Lesson7_Homework.Employee employee2 = new Homework.Lesson7_Homework.Employee("Ivanov");
//        Homework.Lesson7_Homework.Employee employee3 = new Homework.Lesson7_Homework.Employee(555.5);
//       System.out.println(employee1.id);
        System.out.println(employee1.surname);
//       System.out.println(employee1.salary);

        employee1.getId();
        employee1.getSurname();
        employee1.getSalary();
    }
}