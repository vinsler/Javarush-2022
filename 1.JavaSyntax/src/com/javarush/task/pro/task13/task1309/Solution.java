package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("aaa", 1.1);
        grades.put("bbb", 2.1);
        grades.put("ccc", 3.1);
        grades.put("ddd", 4.1);
        grades.put("eee", 5.1);

        //напишите тут ваш код
    }
}
