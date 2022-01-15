package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then5() {
        int first = 5;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then9() {
        int first = 5;
        int second = 9;
        int result = Max.max(first, second);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqual1To2Then5() {
        int first = 5;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqua3to2Then11() {
        int first = 9;
        int second = 10;
        int third = 11;
        int result = Max.max(first, second, third);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqua4to3Then12() {
        int first = 9;
        int second = 10;
        int third = 11;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}
