package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        String [] strA = url.substring(url.indexOf("?") + 1, url.length()).split("&");;
        String temp = "";
        for (int j = 0; j < strA.length; j++) { // по фрагментам строки
            if (strA[j].contains("obj")) {  // если есть obj сохраняем в temp
                temp = strA[j].substring(strA[j].indexOf("=") + 1, strA[j].length());
            }
            if (strA[j].contains("=")) {
                if (j == 0) {
                    System.out.print(strA[j].substring(0, strA[j].indexOf("=")));
                } else {
                    System.out.print(" " + strA[j].substring(0, strA[j].indexOf("=")));
                }
                continue;
            }
            if (j == 0) {
                System.out.print(strA[j].substring(0, strA[j].length()));
            } else {
                System.out.print(" " + strA[j].substring(0, strA[j].length()));
            }
        }
        if (temp.length() > 0) {
            System.out.println();
            try {
                alert(Double.parseDouble(temp));
            } catch (NumberFormatException e) {
                alert(temp);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
