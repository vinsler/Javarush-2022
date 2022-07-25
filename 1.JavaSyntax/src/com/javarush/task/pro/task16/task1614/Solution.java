package com.javarush.task.pro.task16.task1614;

import java.time.Instant;
import java.time.LocalDateTime;

/* 
Конец времен
В классе Solution реализуй три метода:

в методе getMaxFromMilliseconds верни максимальный Instant, который можно получить с помощью метода ofEpochMilli(long milliseconds);
в методе getMaxFromSeconds верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds);
в методе getMaxFromSecondsAndNanos верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

Requirements:
1. Метод getMaxFromMilliseconds нужно реализовать согласно условию.
2. Метод getMaxFromSeconds нужно реализовать согласно условию.
3. Метод getMaxFromSecondsAndNanos нужно реализовать согласно условию.
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код
        Instant timestamp = Instant.MAX;
        Long n;
        try {
            n = timestamp.toEpochMilli();
        } catch (RuntimeException r) {
            n = Long.MAX_VALUE;
        }
        Instant max = Instant.ofEpochMilli(n);
        return max;
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}

