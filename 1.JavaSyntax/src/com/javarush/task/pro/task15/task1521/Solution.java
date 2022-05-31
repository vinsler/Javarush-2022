package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла

Временное сохранение файла
Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете, скачивать его и сохранять во временный файл.
Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files, а также метод openStream() класса URL.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //напишите тут ваш код
        URL url = new URL(line); // создали урл
        InputStream input = url.openStream(); // создали входящий поток, открыли

        Path path = Files.createTempFile(null, null); // создали временный файл temp

        byte[] buffer = input.readAllBytes(); // запихнули в буфер все байты
        Files.write(path, buffer); // записали из буфера
    }
}