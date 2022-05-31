package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
В этой задаче необходимо развернуть вывод в обратном порядке с помощью PrintStream.
Метод printSomething(String) выводит в поле stream переданную строку.
Необходимо развернуть вывод в обратном порядке с помощью PrintStream.

В методе main(String[] args) считывается строка с клавиатуры и передается в метод printSomething(String),
который записывает полученную строку в поток stream.

Твоя задача — в методе main(String[]) развернуть переданную строку с помощью поля outputStream
(то есть, outputStream должен хранить в себе перевернутую строку) и вывести в консоли.
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream); // вот с помощью вот этого нужно поменять порядок на обратный

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder(line);
        String result = sb.reverse().toString();

        printSomething(result); // записали строку в поток (уже реверсивную)
        System.out.println(result);
    }

    public static void printSomething(String str) { // ну передаем сюда строку и он ее просто выводит
        stream.print(str); // записываем строку в поток
    }
}