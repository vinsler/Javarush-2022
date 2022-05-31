package com.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файловые операции

Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.

Если файла по первому пути не существует, его нужно создать.
Если же файл по первому пути существует, нужно переместить этот файл по второму пути, но только в том случае, если по второму пути файла нет.
Если же он есть, нужно просто удалить файл по первому пути.

если первого нет, и мы его создаем, он всегда будет )))

Files: createFile(), move(), delete(), exists()/notExists().
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine()); // first path
        Path fileNewPath = Path.of(scanner.nextLine()); // second path uuuhyyuuu fc i programmer? )))
        //напишите тут ваш код

        if (Files.notExists(filePath)) { // если нет 1 создаем
            Files.createFile(filePath);
        } else if (Files.exists(filePath)) { // если есть то ...
            if (Files.notExists(fileNewPath)) { // если второго нет
                Files.move(filePath, fileNewPath); // перемещаем первый во второй
            } else if (Files.exists(fileNewPath)) { // если есть, удаляем первый
                Files.delete(filePath);
            }
        }
    }
}

