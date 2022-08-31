package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stFile = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fis = new FileInputStream(stFile); // сделали, потому что просили, бесполезная строчка

        bufferedReader = new BufferedReader(new FileReader(stFile));
        ArrayList<Integer> list = new ArrayList();
        int i;

        while (bufferedReader.ready()) {
            stFile = bufferedReader.readLine();
            //System.out.println(stFile);
            i = Integer.parseInt(stFile);
            if ((i % 2) == 0 & i != 0) {
                list.add(Integer.parseInt(stFile));
            }
        }
        Collections.sort(list);

        for (int in : list) {
            System.out.println(in);
        }
        bufferedReader.close();
        fis.close();
    }
}
