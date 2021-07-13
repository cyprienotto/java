package com.cyprienotto.generics;

public class Utils {
    // static so that we do not need to create an instance of  the class.
    // <T> before the return type  which is T here
    public static <T extends Comparable<T>> T max( T first, T second) {
        return ( first.compareTo(second) < 0 ) ? second : first;
    }
    // Multiple Type Parameters : Functions
    public static <K, V> void print(K key, V value) {
        System.out.println(key + "="+ value);
    }
}
