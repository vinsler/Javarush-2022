package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {

    public static class Thread4 extends Thread implements Message {
        private static boolean bool = true;
        @Override
        public void run() {
            while(bool){
            }
        }

        @Override
        public void showWarning() {
            bool = false;
        }

//        @Override
//        public void showWarning() {
//            Thread.currentThread().interrupt();
//        }
//        @Override
//        public void run() {
//            while (!Thread.currentThread().isInterrupted()){
//            }
//        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            int sum = 0;
            String str = "";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    str = bufferedReader.readLine();
                    if (str .equals("N")) {
                        System.out.println(sum);
                        Thread.currentThread().interrupt();
                    }
                    sum += Integer.parseInt(str);
                }
                } catch (IOException e) {
            }
        }
    }

    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        // 1
        threads.add(new Thread(() -> {
            while (true) {
            }
        }));
        threads.add(new Thread(() -> { // 2
            if (Thread.currentThread().isInterrupted()) {
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }));
        threads.add(new Thread(() -> { // 3
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }));
        threads.add(new Thread4()); // 4
        threads.add(new Thread5()); // 5
    }

    public static void main(String[] args) {
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();
    }
}