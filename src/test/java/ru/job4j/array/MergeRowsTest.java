package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeRowsTest {

    @Test
    public void test() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test2() {
        int[][] input = {
                {6, 4, 2},
                {4, 5, 3},
                {7, 5, 9},
                {9, 3, 4},
        };
        int[] expected = {6, 4, 2, 4, 5, 3, 7, 5, 9, 9, 3, 4};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

    @Test
    public void test3() {
        int[][] input = {
                {5, 5, 2},
                {4, 5, 3}
        };
        int[] expected = {5, 5, 2, 4, 5, 3};
        int[] out = MergeRows.merge(input);
        assertArrayEquals(expected, out);
    }

}