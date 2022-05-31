package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        List<String> arrayList = Files.readAllLines(Path.of(file));
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0){
                System.out.println(arrayList.get(i));
            }
        }

    }
}

