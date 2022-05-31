package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:
Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.

Requirements:
1. Программа должна выводить полученную информацию на экран.
2. В программе должен вызываться метод openConnection() класса URL.
3. В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection(); // стандартно, подключаемся
        connection.setDoOutput(true); // флаг чтобы выводить инфу, post&put запросы ok google hlp

        OutputStream outputStream = connection.getOutputStream(); // создаем поток туда
        outputStream.write(1); // че тут нужно отправлять хз отправил цифирю 1

        InputStream inputStream = connection.getInputStream(); // создаем поток сюда
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // в буфер его
        while (reader.ready()) { // и пока в буфере теплится жизнь
            System.out.println(reader.readLine()); // выводим на экран построчно
        }



    }
}

