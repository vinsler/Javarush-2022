package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String filename = reader.readLine();
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        byte max = 0;
        while (inputStream.available() > 0) {
            int date = inputStream.read();
            if (date > max) {
                max = (byte) date;
            }
        }
        inputStream.close();
        System.out.println(max);
    }
}
