package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurn4() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurn5() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurn6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}