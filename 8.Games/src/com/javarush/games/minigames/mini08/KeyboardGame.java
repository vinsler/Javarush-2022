package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.Collections;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Collections.addAll(num, 0, 1, 2);
        switch (key) {
            case LEFT : {
                num.forEach(s -> setCellColor(0, s, Color.GREEN));
                break;
            }
            case RIGHT : {
                num.forEach(s -> setCellColor(2, s, Color.GREEN));
                break;
            }
            case UP : {
                num.forEach(s -> setCellColor(s, 0, Color.GREEN));
                break;
            }
            case DOWN : {
                num.forEach(s -> setCellColor(s, 2, Color.GREEN));
                break;
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        switch (key) {
            case LEFT : {
                    for (int y = 0; y < 3; y++) {
                        setCellColor(0, y, Color.WHITE);
                    }
                break;
            }
            case RIGHT : {
                for (int y = 0; y < 3; y++) {
                    setCellColor(2, y, Color.WHITE);
                }
                break;
            }
            case UP : {
                for (int y = 0; y < 3; y++) {
                    setCellColor(y, 0, Color.WHITE);
                }
                break;
            }
            case DOWN : {
                for (int y = 0; y < 3; y++) {
                    setCellColor(y, 2, Color.WHITE);
                }
                break;
            }
        }
    }
}
