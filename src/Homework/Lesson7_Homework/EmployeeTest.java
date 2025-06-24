package Homework.Lesson7_Homework;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(5);
        Employee employee2 = new Employee("Ivanov");
        //   Employee employee3 = new Employee(555.5);

        System.out.println(employee1.id);
        System.out.println(employee1.surname);
        //   System.out.println(employee1.salary);

        System.out.println(employee2.id);
        System.out.println(employee2.surname);
        //System.out.println(employee2.salary);

        employee1.getId();
        employee1.getSurname();
        employee1.getSalary();

        employee2.getId();
        employee2.getSurname();
        employee2.getSalary();
    }
}