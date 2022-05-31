package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node(); // первая нода
    private Node last = new Node(); // последния нода

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node(); // создаем новую ноду
        node.value = value;     // нода.значение равна значение
        node.next = null;       // нода.следующая равна null
        if (this.first.next == null) { // Если пустой список
            node.prev = null; // нода предыдущая ровная null
            first.next = node; // первая.следующая равна этой ноде
        } else { // если не пустой список
            node.prev = last.prev; // нода.предыдущая равна последней.предыдущей
            node.prev.next = node; // нода.предыдущая.следующая  равна ноде
        }
        last.prev = node; // последняя.предыдущая равна ноде
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
