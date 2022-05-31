package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // открываем поток для чтения с клавиатуры
        InputStream file1 = Files.newInputStream(Paths.get(reader.readLine())); // вводим путь к первому файлу и открываем поток для чтения
        OutputStream file2 = Files.newOutputStream(Paths.get(reader.readLine())); // вводим путь ко второму файлу и открываем поток для записи
        // однако эти действия бесполезны, без ввода файла и расширения, ну да ладно.
        ) {
            // читать будем по 2 байта,
            byte f1 = 0;
            byte f2 = 0;
            while (file1.available() != 0) { // пока не конец файла
                f1 = (byte) file1.read(); // читаем не четный байт
                if (file1.available() != 0) { // есть ли следующий байт или конец файла?
                    f2 = (byte) file1.read(); // есть, читаем четный байт
                    file2.write(f2); // записываем во 2ой файл четный байт первым
                }
                file2.write(f1); // записываем во 2ой файл не четный байт вторым
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

