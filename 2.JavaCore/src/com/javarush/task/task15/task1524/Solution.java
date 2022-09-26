package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    // 1 - самые первые выполняются статические блоки, по порядку.
    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    // 3 - перед конструктором обычные блоки тоже по порядку.
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    // 3 - это тоже обычные блоки
    public int i = 6;
    public String name = "First name";

    // вот он конструктор
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    // 2 - psvm начало выполнения программы
    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution(); // тут идем в конструктор
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
