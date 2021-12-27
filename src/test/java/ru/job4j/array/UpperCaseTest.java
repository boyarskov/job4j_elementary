package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void test() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }

    @Test
    public void test1() {
        char[] input = "javaDeveloper-9d3aA".toCharArray();
        char[] expect = "JAVADEVELOPER-9D3AA".toCharArray();
    }

}