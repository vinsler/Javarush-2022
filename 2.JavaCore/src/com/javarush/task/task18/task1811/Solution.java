package com.javarush.task.task18.task1811;

/* 
Wrapper (Decorator)
*/

public class Solution {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorRunnableImpl body");
            component.run();
        }
    }

    public static class DecoratorMyRunnableImpl implements Runnable {
        private Runnable component; // ref by class

        public DecoratorMyRunnableImpl(Runnable component) { // cnstrct
            this.component = component;
        }

        @Override
        public void run() { // and there run wth sout by name class
            System.out.println("DecoratorMyRunnableImpl body");
            component.run();
        }
    }
}
