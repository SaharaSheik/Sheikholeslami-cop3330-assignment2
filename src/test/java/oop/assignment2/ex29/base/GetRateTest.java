package oop.assignment2.ex29.base;

import oop.assignment2.ex28.base.Adding_Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetRateTest {

    @Test
    void isNumber_For_Number() {

        //for string = 123456 -> true
       boolean expectedOutput = true;
        boolean actualOutput = GetRate.isNumber("12345");
        assertEquals(expectedOutput, actualOutput);


    }
    @Test
    void isNumber_For_NonNumber() {
        //for string = uydgshukf -> false
        boolean expectedOutput = false;
        boolean actualOutput = GetRate.isNumber("uydgshukf");
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void isNotZero_For_Zero() {

        //for string = 0 -> false
        boolean expectedOutput = false;
        boolean actualOutput = GetRate.isNotZero("0");
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void isNotZero_For_NotZero() {

        //for string = 1234 -> true
        boolean expectedOutput = true;
        boolean actualOutput = GetRate.isNotZero("1234");
        assertEquals(expectedOutput, actualOutput);
    }

}