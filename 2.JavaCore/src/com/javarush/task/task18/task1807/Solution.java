package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;
        while (fis.available() > 0) {
            //int readByte = fis.read();
            if (fis.read() == 44) {
                count++;
            }
        }
        fis.close();
        System.out.println(count);
    }
}
