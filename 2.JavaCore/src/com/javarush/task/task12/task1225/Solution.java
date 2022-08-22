package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    // Кот-Корова-Бык от животного
    // Тигр-Лев от Кота
    public static String getObjectType(Object o) {
        //напишите тут ваш код
        if (o instanceof Animal) {
            if (o instanceof Cat) { // Cat - Tiger - Lion
                if (o instanceof Tiger) {
                    return "Тигр";
                }
                if (o instanceof Lion) {
                    return "Лев";
                }
                return "Кот";
            }
            if (o instanceof Cow) {
                return "Корова";
            }
            if (o instanceof Bull) {
                return "Бык";
            }
        }
        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
