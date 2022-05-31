package com.javarush.task.pro.task15.task1506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {

    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ) {
            List<String> str = Files.readAllLines(Paths.get(reader.readLine()));
            for (String st1: str) {
                System.out.print(st1.replaceAll("[., ]", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}

