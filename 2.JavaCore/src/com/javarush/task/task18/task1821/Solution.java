package com.javarush.task.task18.task1821;

import javax.swing.tree.TreeCellRenderer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> goal = new TreeMap<>();
        FileReader freader = new FileReader(args[0]);
        while (freader.ready()) {
            int ich = freader.read();
            if (goal.containsKey((char) ich) ) {
                goal.replace((char) ich, goal.get((char)ich) + 1);
            } else {
                goal.put((char) ich, 1);
            }
        }
        freader.close();

//        for (Map.Entry<Character, Integer> entry : goal.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        goal.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
