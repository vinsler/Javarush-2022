package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (str) {
            case Planet.SUN -> thePlanet = Sun.getInstance();
            case Planet.MOON -> thePlanet = Moon.getInstance();
            case Planet.EARTH -> thePlanet = Earth.getInstance();
            default -> thePlanet = null;
        }
    }
}
