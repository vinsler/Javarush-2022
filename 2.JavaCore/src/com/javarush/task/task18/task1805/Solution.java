package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine(); // "c:/1.txt";
        TreeSet<Integer> set = new TreeSet<>();
        FileInputStream fis = new FileInputStream(filename);

        while (fis.available() > 0) {
            set.add(fis.read());
        }
        fis.close();
        set.forEach(t -> {
            System.out.print(t + " ");
        });
    }
}
