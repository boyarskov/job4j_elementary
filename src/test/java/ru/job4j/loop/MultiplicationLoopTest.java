package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {

    @Test
    public void test0to2() {
        assertEquals(0, MultiplicationLoop.mult(0, 2));
    }

     @Test
     public void test1to2() {
        assertEquals(2, MultiplicationLoop.mult(1, 2));
     }

    @Test
    public void test1to3() {
        assertEquals(6, MultiplicationLoop.mult(1, 3));
    }

    @Test
    public void test4to10() {
        assertEquals(604800, MultiplicationLoop.mult(4, 10));
    }
}