package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        byte [] b = new byte[1000]; // реверс файла только до 1000 байт
        int size = fis.available();

        while (fis.available() > 0) {
            b[fis.available()] = (byte) fis.read();
        }
        for (int i = 1; i <= size; i++) {
            fos.write(b[i]);
        }
        fis.close();
        fos.close();

    }
}
