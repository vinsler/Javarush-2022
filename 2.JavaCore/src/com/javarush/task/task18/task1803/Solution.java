package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int date = inputStream.read();
            if (map.containsKey(date)) {
                int t = map.get(date);
                map.put(date, ++t);
            } else {
                map.put(date, 1);
            }
        }
        inputStream.close();
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
