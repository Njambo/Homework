package Homework.Lesson20_Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public ArrayList<String> abc(String ... s) {
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s) {
            if (!list.contains(s1)) {
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.abc("привет", "ок", "пока", "привет", "как дела?", "ок", "здравствуйте");
    }
}