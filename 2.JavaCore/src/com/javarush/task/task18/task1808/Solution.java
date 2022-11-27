package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName1);
        FileOutputStream fos = new FileOutputStream(fileName2);

        int tofile = fis.available()/2;

        while (fis.available() > tofile) {
            fos.write(fis.read());
        }
        fos.close();
        fos = new FileOutputStream(fileName3);
        while (fis.available() > 0) {
            fos.write(fis.read());
        }
        fis.close();
        fos.close();
    }
}
