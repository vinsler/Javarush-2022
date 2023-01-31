package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (!(str = reader.readLine()).equals("exit")) {
            //str = reader.readLine();
            new ReadThread(str).start();
        }

//        for (String key: resultMap.keySet()) {
//            System.out.println(key + " - " + resultMap.get(key));
//        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        int[] bytes = new int[256];

        String fileName;
        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            int temp;
            try {
                FileInputStream fileInputStream = new FileInputStream(this.fileName);
                while (fileInputStream.available() > 0) {
                    temp = fileInputStream.read();
                    bytes[temp]++;
                    //System.out.println((char)temp);
                }
                fileInputStream.close();

            }  catch (IOException e) {
            }
            int max = 0;
            int pos = 0;
            for (int i = 0; i < 256; i++) {
                if (max < bytes[i]) {
                    max = bytes[i];
                    pos = i;
                }
            }
            resultMap.put(fileName, pos);
            //System.out.println(fileName + " - " + (char) max);
        }

    }


}

