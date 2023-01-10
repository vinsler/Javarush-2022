package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        int spaceChar = 0, allChar = 0;
        double fl;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int i;
            while (reader.ready()) {
                i = reader.read();
                allChar++;
                if (i == 32) {
                    spaceChar++;
                }
            }
        } catch (IOException ex) {
        }
        fl = (double) Math.round(((double) spaceChar / allChar * 100) * 100) / 100;
        System.out.println(fl);
    }
}
