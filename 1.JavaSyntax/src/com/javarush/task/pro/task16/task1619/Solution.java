package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
В методе main выведи на экран переменную localDateTime в таком виде:
19.03.2020г. 5ч.4мин


Requirements:
1. Метод main должен вывести в консоли значение переменной localDateTime согласно шаблону.
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        System.out.println(dtf.format(localDateTime));
    }
}
