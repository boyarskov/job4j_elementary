package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9Then3() {
        int[] data = {3, 6, 1, 9, 10};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas21Then8() {
        int[] data = {4, 2, 9, 20, 23, 54, 19, 5, 21, 43};
        int el = 21;
        int result = FindLoop.indexOf(data, el);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5ThenMinus1() {
        int[] data = {4, 2, 9};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
