package oop.assignment2.ex28.base;

import oop.assignment2.ex27.base.ValidatingInputs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Adding_NumbersTest {


    @Test
    void sumCalculatorTest() {

        // for 4+9+10+0+1 -> 24
        int[] test = new int[]{4,9,10,0,1};
        int expectedOutput = 24;
        int actualOutput = Adding_Numbers.sumCalculator(test);
        assertEquals(expectedOutput, actualOutput);

    }
}