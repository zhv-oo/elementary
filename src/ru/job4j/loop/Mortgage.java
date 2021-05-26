package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double am = amount;
        while (amount > 0) {
            amount = amount + (int) (am * (percent / 100));
            amount = amount - salary;
            year++;
        }
        return year;
    }
}