package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        if (10 / A == 0)
        {
            throw new ExceptionInInitializerError();
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
