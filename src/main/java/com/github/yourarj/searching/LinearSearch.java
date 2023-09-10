package com.github.yourarj.searching;

/**
 * Implements Linear search
 * O(n)
 */
public class LinearSearch<T> {
    public int linearSearch( T needle, T[] hayStack) {
        for(int i = 0; i< hayStack.length; i++){
            if (needle.equals(hayStack[i])) return i;
        }
        return -1;
    }
}
