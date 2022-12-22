package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        int counter = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int i;
            while (reader.ready()) {
                i = reader.read();
                if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                    counter++;
                }
            }
        } catch (IOException e) {
        }
        System.out.println(counter);
    }
}
