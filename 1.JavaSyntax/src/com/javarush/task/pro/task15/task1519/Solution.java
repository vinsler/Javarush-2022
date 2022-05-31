package com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Поверхностное копирование

Поверхностное копирование
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
Используй соответствующие методы класса Files: newDirectoryStream(), isRegularFile() или isDirectory(), copy().
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код (вопрос зачем нужно проверять на папку? )
        try (DirectoryStream<Path> files = Files.newDirectoryStream(sourceDirectory)) { // делаем поток для работы с папкой
            for (Path path: files) { // проходим по всей папке
                if (Files.isRegularFile(path)) { // если текущий экземпляр файл, то копируем в новую папку + к пути добиваем имя файла
                    Files.copy(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        }
    }
}

