package Homework.Lesson13_Homework;

public class Month {
    // number_of_days - количество дней
    public static void number_of_days(int n) {
        switch (n){
            case 2:
                System.out.println("количество дней в месяце 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("количество дней в месяце 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("количество дней в месяце 31");
                break;
            default:
                System.out.println("Месяца с таким порядковым номером не существует");
        }
    }

    public static void main(String[] args) {
        Month.number_of_days(0);
        number_of_days(1);
        Month.number_of_days(2);
        number_of_days(4);
        Month.number_of_days(-5);
    }
}