package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream reader = new FileInputStream(bufferedReader.readLine());
            bufferedReader.close();
            while (reader.available() > 0) {
                System.out.print((char)reader.read());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}