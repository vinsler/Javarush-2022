package com.javarush.task.task16.task1626;

/* 
Создание по образцу
*/

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        //Add your code here - добавь код тут
        private int countIndexUp = 1;

        @Override
        public void run() {
            //long time = System.nanoTime();
            try {
                while (true) {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + ": " + countIndexUp);
                    countIndexUp += 1;
                    if (countIndexUp == 6) {
                        //System.out.println(TimeUnit.MILLISECONDS.convert(System.nanoTime() - time, TimeUnit.NANOSECONDS));
                        return;
                    };
                    //Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
