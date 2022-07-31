package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.


Requirements:
1. В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
2. В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
3. Методы min() должны возвращать минимальное из переданных чисел.
4. Методы max() должны возвращать максимальное из переданных чисел.
*/

public class MinMaxUtil {

    public static int min(int t1, int t2)
    {
        return Math.min(t1, t2);
    }

    public static int min(int t1, int t2, int t3)
    {
        int temp = Math.min(t1, t2);
        return Math.min(temp, t3);
    }

    public static int min(int t1, int t2, int t3, int t4)
    {
        return Math.min(Math.min(t1, t2), Math.min(t3, t4));
    }

    public static int min(int t1, int t2, int t3, int t4, int t5)
    {
        return Math.min(Math.min(t1, t2), min(t3, t4, t5));
    }

    public static int max(int t1, int t2)
    {
        return Math.max(t1, t2);
    }

    public static int max(int t1, int t2, int t3)
    {
        int temp = Math.max(t1, t2);
        return Math.max(temp, t3);
    }

    public static int max(int t1, int t2, int t3, int t4)
    {
        return Math.max(Math.max(t1, t2), Math.max(t3, t4));
    }

    public static int max(int t1, int t2, int t3, int t4, int t5)
    {
        return Math.max(Math.max(t1, t2), max(t3, t4, t5));
    }



    
    //напишите тут ваш код
}
