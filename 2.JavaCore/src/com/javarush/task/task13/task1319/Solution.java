package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));
                while (true) {
                    st = bufferedReader.readLine();
                    writer.write(st + "\n");
                    if (st.equals("exit")) {
                        bufferedReader.close();
                        writer.close();
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
