package oop.assignment2.ex30.base;

import oop.assignment2.ex29.base.GetRate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class multiplicationArrayGeneratorTest {

    @Test
    void multiplier_test_Element() {

        //for a 10 x 10 multiplication -> int [9][9] ->100
        int expectedOutput = 100;
        int [][] array = multiplicationArrayGenerator.multiplier(10,10);
        int actualOutput = array [9][9];

        assertEquals(expectedOutput, actualOutput);


    }
}