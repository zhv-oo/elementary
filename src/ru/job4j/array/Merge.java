package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int a = 0, b = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (a != left.length && left[a] <= right[b]) {
                rsl[i] = left[a++];
            } else {
                rsl[i] = right[b++];
            }
        }
        return rsl;
    }
}