package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateTest {

    @Test
    void heartRateCalculator() {

        // for Resting Heart Rate 60 age: 40 at intensity of 95% Target heart rate to be -> 174 (I got this data
        // from outside source to ensure my code is producing correct output)

        int expectedOutput = 174;

                int [] testArray = TargetHeartRate.heartRateCalculator(60, 40);

        int actualOutput = testArray[(95-55)/5];;

                assertEquals(expectedOutput, actualOutput);
    }
}