package com.cyprienotto.generics;

// "T" : convention  letter for "type", only Reference type
// for store primitive type  use wrapper class (Integer, Float, Boolean etc..).

public class GenericsList<T extends Comparable & Cloneable> { // Only object which could  be comparable & cloneable
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
