package com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* 
Тренировка временных зон
Что общего у всех временных зон и Пекина?
Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)

Реализуй два метода:

в методе getSortedZones верни множество TreeSet всех временных зон;
в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").

Requirements:
1. Метод getSortedZones должен вернуть множество всех временных зон.
2. Метод getBeijingDateTime должен вернуть текущую дату и время в Пекине.
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код
//        TreeSet<String> zone = new TreeSet<>(ZoneId.getAvailableZoneIds());
//          zone.addAll(ZoneId.getAvailableZoneIds());
//              for (String s : ZoneId.getAvailableZoneIds()){
//                  zone.add(s);
//              }
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
//        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
//        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai")) ;
    }
}
