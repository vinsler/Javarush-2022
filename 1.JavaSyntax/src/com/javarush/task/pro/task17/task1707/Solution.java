package com.javarush.task.pro.task17.task1707;

/* 
Питомцы бывают разные
Класс Pet является родительским классом для классов Cat и Dog. В нем реализован метод printInfo(), который сообщает, что данный объект является питомцем.
В классах Cat и Dog переопредели метод printInfo(), дополнив его функционал следующим образом:

вначале вызови метод printInfo() родительского класса;
потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или "Я люблю людей" для класса Dog.
Пример вывода для класса Cat:
Я домашний питомец.
Я не люблю людей.

Пример вывода для класса Dog:
Я домашний питомец.
Я люблю людей.


Requirements:
1. Метод printInfo() должен быть переопределен в классе Cat.
2. Метод printInfo() должен быть переопределен в классе Dog.
3. В методе printInfo() класса Cat должен вызываться printInfo() родительского класса.
4. В методе printInfo() класса Dog должен вызываться printInfo() родительского класса.
5. Метод printInfo() класса Cat должен выводить в консоли текст согласно условию.
6. Метод printInfo() класса Dog должен выводить в консоли текст согласно условию.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        dog.printInfo();
    }
}
