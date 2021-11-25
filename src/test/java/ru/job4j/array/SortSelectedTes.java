package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTes {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[] {5, 2, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 5, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[] {6, 3, 2, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 6, 9, 10};
        Assert.assertArrayEquals(expected, result);
    }
}
