package com.javarush.task.task16.task1610;

/* 
Расставь вызовы методов join()
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка"); // создали Мурку -> идем в конструктор Cat
        Cat cat2 = new Cat("Пушинка"); // создали Пушинку
    }

    private static void investigateWorld() throws InterruptedException {
        Thread.sleep(200);
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) throws InterruptedException {
            super(name); // создаем поток Thread(имя кошки)
            kitten1 = new Kitten("Котенок 1, мама - " + getName()); // getName() - метод Thread, т.е. имя кошки
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start(); // запустили run()
        }

        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start(); // и вот тут пошла нить, первый пошел, ждем.
            kitten1.join();
            kitten2.start(); // второй пошел, ждем
            kitten2.join();
        }
    }

    // ======================================================================================================

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name); // А тут еще один поток Thread("Котенок 1, мама - " + getName()))
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            try {
                investigateWorld();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
    }
}
