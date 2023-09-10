package com.github.yourarj.searching;

public class BinarySearch<T extends Comparable<T>> {
    public int binarySearch(T needle, T[] haystack) {
        if (haystack.length == 0) {
            return -1;
        }
        int start = 0;
        int end = haystack.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int comparison = haystack[start].compareTo(haystack[mid]);
            if (comparison > 0) {
                start = mid + 1;
            } else if (comparison < 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
