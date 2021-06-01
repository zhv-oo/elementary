package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int left, int right, int three) {
        return max(max(left, right), three);
    }

    public static int max(int left, int right, int three, int four) {
        return max(max(left, right, three), four);
    }
}