package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.print(sol.intVar + "\n" + sol.doubleVar + "\n" + sol.DoubleVar + "\n" + sol.booleanVar + "\n" + sol.ObjectVar + "\n" + sol.ExceptionVar + "\n" + sol.StringVar);
    }
}
