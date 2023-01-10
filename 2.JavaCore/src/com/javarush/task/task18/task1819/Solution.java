package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2;
        file1 = reader.readLine();
        file2 = reader.readLine();

        FileInputStream fis1 = new FileInputStream(file1);
        byte[] buff1 = new byte[fis1.available()];
        fis1.read(buff1);
        fis1.close();

        FileInputStream fis2 = new FileInputStream(file2);
        byte[] buff2 = new byte[fis2.available()];
        fis2.read(buff2);
        fis2.close();

        byte[] buff3 = new byte[buff1.length + buff2.length];
        System.arraycopy(buff2, 0, buff3, 0, buff2.length);
        System.arraycopy(buff1, 0, buff3, buff2.length, buff1.length);

        FileOutputStream fos1 = new FileOutputStream(file1);
        fos1.write(buff3);
        fos1.close();
    }
}
