package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {
        Beach b1 = new Beach("b1", 100.0f, 10);
        Beach b2 = new Beach("b2", 10.0f, 10);
        System.out.println(b1.compareTo(b2));
    }

    // ok google compareTO
    // если сейчас пройдет, можно я оторву руки и голову, тому кто пишет условия?

    @Override
    public synchronized int compareTo(Beach o) {
        int res = 0;
        if (this.quality > o.quality) {
            res++;
        }
        if (this.quality < o.quality) {
            res--;
        }
        if (this.distance > o.distance) {
            res--;
        }
        if (this.distance < o.distance) {
            res++;
        }
        return res;
    }
}
