package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String filename = reader.readLine();
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        byte min = 127;
        while (inputStream.available() > 0) {
            int date = inputStream.read();
            if (date < min) {
                min = (byte) date;
            }
        }
        inputStream.close();
        System.out.println(min);
    }
}
