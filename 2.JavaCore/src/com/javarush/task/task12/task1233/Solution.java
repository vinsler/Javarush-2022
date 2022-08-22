package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //напишите тут ваш код
//        int min = Arrays.stream(array).min().getAsInt();
//        int pos = IntStream.range(0, array.length).filter(i -> array[i] == min).findFirst().getAsInt();

        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                pos = i;
                break;
            }
        }
        return new Pair<Integer, Integer>(array[pos], pos);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
