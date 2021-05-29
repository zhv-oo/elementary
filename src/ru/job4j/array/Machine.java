package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int bck = money - price;
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (bck >= coins[i]) {
                bck = bck - coins[i];
                rsl[size++] = coins[i];
            }
            if (bck == 0) {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}