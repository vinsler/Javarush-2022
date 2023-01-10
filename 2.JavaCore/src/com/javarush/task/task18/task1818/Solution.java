package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2, file3;
        file1 = reader.readLine();
        file2 = reader.readLine();
        file3 = reader.readLine();
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file1));

        reader = new BufferedReader(new FileReader(file2));
        while (reader.ready()) {
            writer.append(reader.readLine());
        }
        reader.close();
        reader = new BufferedReader(new FileReader(file3));
        while (reader.ready()) {
            writer.append(reader.readLine());
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
