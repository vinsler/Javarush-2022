package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(){
    }

    public static void printMatrix(int m){
    }

    public static void printMatrix(Object o){
    }

    public static void printMatrix(short s){
    }

    public static void printMatrix(boolean b){
    }

    public static void printMatrix(double d){
    }

    public static void printMatrix(long l){
    }

    public static void printMatrix(Integer i){
    }

}
