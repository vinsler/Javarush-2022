package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[1]);
        FileWriter fileWriter = new FileWriter(args[2]);
        if (args[0].equals("-e")) {
            while (fileReader.ready()) {
                fileWriter.write(fileReader.read() + 1);
            }
        } else if (args[0].equals("-d")) {
            while (fileReader.ready()) {
                fileWriter.write(fileReader.read() - 1);
            }
        }
        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }

}
