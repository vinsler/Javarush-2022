package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = bufferedReader.readLine();
            if (str.equals("exit")) {
                break;
            }

            if (str.contains(".")) {
                try {
                    print(Double.parseDouble(str));
                } catch (Exception e) {
                    print(str);
                }
            } else {
                int vint = 0;
                try {
                    vint = Integer.parseInt(str);
                    if (vint > 0 && vint < 128) {
                        print(Short.parseShort(str));
                    } else if (vint <= 0 || vint >= 128) { // можно опустить вообще проверку
                        print(vint);
                    }
                } catch (Exception e){
                    print(str);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
