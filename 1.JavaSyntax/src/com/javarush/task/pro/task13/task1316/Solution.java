package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuest = JavarushQuest.values();
        for (JavarushQuest j : javarushQuest) {
            System.out.println(j.ordinal());
        }
    }
}
