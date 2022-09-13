package com.javarush.task.task14.task1421;

public final class Singleton {
    static private Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    };
}
