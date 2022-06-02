package com.javarush.task.pro.task16.task1601;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
Проинициализируй переменную birthDate объектом Date с датой своего рождения.
Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.


Requirements:
1. Переменная birthDate должна быть проинициализирована при объявлении.
2. Метод getDayOfWeek(Date date) должен возвращать русское название дня недели.
*/

public class Solution {

    static Date birthDate = new Date("May 03 1982");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 1 -> "Воскресенье";
            case 2 -> "Понедельник";
            case 3 -> "Вторник";
            case 4 -> "Среда";
            case 5 -> "Четверг";
            case 6 -> "Пятница";
            case 7 -> "Суббота";
            default -> null;
        };
    }
}
