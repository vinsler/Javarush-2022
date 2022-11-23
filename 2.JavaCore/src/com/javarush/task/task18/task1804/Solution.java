package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine(); // "c:/1.txt";

        Map<Integer, Integer> minMap = new HashMap<>();
        FileInputStream fis = new FileInputStream(filename);

        while (fis.available() > 0) {
            int readbyte = fis.read();
            if (minMap.containsKey(readbyte)) {
                int t = minMap.get(readbyte);
                minMap.put(readbyte, ++t);
            } else {
                minMap.put(readbyte, 1);
            }
        }
        fis.close();

        int min = 256;
        for (Map.Entry<Integer, Integer> entry : minMap.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : minMap.entrySet()) {
            if (entry.getValue() <= min) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
