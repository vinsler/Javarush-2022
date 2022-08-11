package com.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

/* 
Работаем со списком координат
*/

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        //напишите тут ваш код
        setCellColor(x, y, Color.ORANGE);
        if (cells.stream().noneMatch(s -> s.getX() == x && s.getY() == y)) {
            cells.add(new Cell(x, y));
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        //напишите тут ваш код
        setCellColor(x, y, Color.WHITE);
        if (cells.stream().anyMatch(s -> s.getX() == x && s.getY() == y)) {
            cells.remove(new Cell(x, y));
        }
    }
}
