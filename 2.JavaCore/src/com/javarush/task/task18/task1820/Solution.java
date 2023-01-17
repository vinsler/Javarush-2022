package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = reader.readLine(); // "c:\\1.txt"; //
//        String fileName2 = reader.readLine();
//
//        FileInputStream fis1 = new FileInputStream(fileName1);
//        FileOutputStream fis2 = new FileOutputStream(fileName2);
//
//        StringBuffer strb = new StringBuffer();
//        while (fis1.available() > 1) {
//            strb.append((char) fis1.read());
//        }
//        fis1.close();
//        String[] str = String.valueOf(strb).split(" ");
//        for (int i = 0; i < str.length; i++) {
//            //System.out.println(str[i] + " " + (int) Math.round(Double.parseDouble(str[i])));
//            if (str[i].contains(".")) {
//                fis2.write(Integer.toString((int) Math.round(Double.parseDouble(str[i]))).getBytes());
//                if (i < str.length - 1) {
//                    fis2.write((char) 32);
//                }
//            } else {
//                fis2.write(Integer.toString(Integer.parseInt(str[i])).getBytes());
//                if (i < str.length - 1) {
//                    fis2.write((char) 32);
//                }
//            }
//        }
//        fis2.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        BufferedReader br = new BufferedReader(new FileReader(filename1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename2));

        while (br.ready()) {
            String[] str = br.readLine().split(" ");
            for (String t : str) {
                bw.write(Math.round(Double.parseDouble(t)) + " ");
            }
        }
        br.close();
        bw.close();
        }
}
