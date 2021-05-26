package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double am = amount;
        while (am > 0) {
            am = am + am * (percent / 100);
            am = am - salary;
            year++;
        }
        return year;
    }
}