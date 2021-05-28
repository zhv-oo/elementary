package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean chk: data) {
            if (data[0] != chk) {
                result = false;
                break;
            }
        }
        return result;
    }
}