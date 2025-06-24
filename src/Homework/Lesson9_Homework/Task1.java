package Homework.Lesson9_Homework;
class Task1 {
    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("ABCD");
    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        abc();
        abc();
        String s1 = new String("DEP");
        abc();
    }
}