package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rls = value / 70;
        return rls;
    }

    public static int rubleToDollar(int value) {
        int rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("210 рублей это: "+euro+" евро");
        System.out.println("180 рублей это: "+dollar+" доллара");
    }
}
