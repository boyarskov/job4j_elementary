package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoSquareArraysTest {
    @Test
    public void collectArray() {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] expected = {2, 10, 92, 82, 32, 40, 8, 27, 35};
        int[] rsl = TwoSquareArrays.collectArray(left, right);
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectArray2() {
        int[][] left = {{90, 3, 89}, {32, 76, 45}, {66, 1, 32}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] expected = {90, 4, 92, 82, 76, 45, 66, 17, 35};
        int[] rsl = TwoSquareArrays.collectArray(left, right);
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectArray3() {
        int[][] left = {{90, 3, 89}, {32, 76, 45}, {66, 1, 32}, {64, 221, 98}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}, {62, 271, 99}};
        int[] expected = {90, 4, 92, 82, 76, 45, 66, 17, 35, 64, 271, 99};
        int[] rsl = TwoSquareArrays.collectArray(left, right);
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectArray4() {
        int[][] left = {{90, 3, 89}, {32, 76, 45}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}};
        int[] expected = {90, 4, 92, 82, 76, 45};
        int[] rsl = TwoSquareArrays.collectArray(left, right);
        assertThat(rsl, is(expected));
    }
}