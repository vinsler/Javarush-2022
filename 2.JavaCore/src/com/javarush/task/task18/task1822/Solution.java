package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new FileReader(fileName));

        String str = "";
        while (reader.ready()) {
            str = reader.readLine();
            if (str.startsWith(args[0] + " ")) {
                System.out.println(str);
            }
        }
        reader.close();
    }
}
