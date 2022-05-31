package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        String s = storage.get(0);
        storage.remove(0);
        return s;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.size() == 0;
    }

    public int search(String s) {
        if (storage.contains(s)) {
            for (int i = 0; i < storage.size(); i++) {
                if (storage.get(i).equals(s)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
