package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class yearCalculatorTest {

    @Test
    void getYear() {

        //for rate: 9.0  -> year = 8
        int expectedOutput = 8;
        int actualOutput = yearCalculator.getYear(9.0);
        assertEquals(expectedOutput, actualOutput);
    }
}