package com.javarush.task.pro.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
Получение информации по API
Твоя задача — обратиться к публичному API в интернете и получить данные. Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, получать данные и выводить их на экран.

Подсказки:
Используй метод openStream() класса URL.
Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
https://javarush.ru/api/1.0/rest/projects

Requirements:
1. Программа должна выводить полученную информацию на экран.
2. В программе должен вызываться метод openStream() класса URL.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        //напишите тут ваш код
        InputStream inputStream = url.openStream(); // открываем поток
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // буферизуем поток
        while (reader.ready()) { // пока в буфер что-то приходит, читаем
            System.out.println(reader.readLine()); // выводим построчно на экран
        }
    }
}