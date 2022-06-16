package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.

Помни, что в григорианском календаре неделя начинается с воскресенья.


Requirements:
1. Переменная birthDate должна быть проинициализирована при объявлении.
2. Метод getDayOfWeek(Calendar calendar) должен возвращать день недели аргумента calendar.
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1982, Calendar.MAY, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        int intDay = calendar.get(Calendar.DAY_OF_WEEK);
        switch (intDay) {
            case 1 -> {
                return "Воскресенье";
            }
            case 2 -> {
                return "Понедельник";
            }
            case 3 -> {
                return "Вторник";
            }
            case 4 -> {
                return "Среда";
            }
            case 5 -> {
                return "Четверг";
            }
            case 6 -> {
                return "Пятница";
            }
            case 7 -> {
                return "Суббота";
            }
        }
        return null;
    }
}
