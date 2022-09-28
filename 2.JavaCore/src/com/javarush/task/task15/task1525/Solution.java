package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        BufferedReader bufferedReader;
        String str;
        try {
            bufferedReader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            str = bufferedReader.readLine();
            while (str != null) {
                lines.add(str);
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
