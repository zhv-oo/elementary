package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax0ToMinus2Then0() {
        int left = 0;
        int right = -2;
        int result = Max.max(left, right);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFrom3Then1() {
        int left = 0;
        int right = -2;
        int three = 1;
        int result = Max.max(left, right, three);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxFrom4Then11() {
        int left = 0;
        int right = -2;
        int three = 1;
        int four = 11;
        int result = Max.max(left, four, right, three);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }
}