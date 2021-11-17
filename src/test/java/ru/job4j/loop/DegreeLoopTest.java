package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeLoopTest {

    @Test
    public void test1() {
        assertEquals(4, DegreeLoop.calculate(2, 2));
    }

        @Test
        public void test2() {
        assertEquals(9, DegreeLoop.calculate(3, 2));
        }

            @Test
            public void test3() {
        assertEquals(3, DegreeLoop.calculate(3, 1));
            }

                @Test
                public void test4() {
        assertEquals(128, DegreeLoop.calculate(2, 7));
    }

}