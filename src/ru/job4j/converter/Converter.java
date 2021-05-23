package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        int dollar = Converter.rubleToDollar(180);
        int expected = 3;
        System.out.println("210 рублей это: " + euro + " евро. " + "Test result : " + (euro == expected));
        System.out.println("180 рублей это: " + dollar + " доллара. " + "Test result : " + (dollar == expected));
    }
}
