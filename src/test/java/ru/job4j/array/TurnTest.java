package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void secondWhenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{6, 1, 6, 9, 2, 10, 22};
        int[] result = Turn.back(input);
        int[] expected = new int[]{22, 10, 2, 9, 6, 1, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    }
