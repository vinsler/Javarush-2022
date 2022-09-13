package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int value1 = Integer.parseInt(bufferedReader.readLine());
        int value2 = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int max = Math.max(value1, value2);

        for (int i = max; i > 0; i--) {
            if (value1 % i == 0) {
                if (value2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
