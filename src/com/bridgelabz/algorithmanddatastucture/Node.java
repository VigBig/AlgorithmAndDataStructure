package com.bridgelabz.algorithmanddatastucture;

public class Node<T extends Comparable<T>> {

    T key;
    Node<T> next;

    public Node(T key) {

        this.key = key;
    }
}