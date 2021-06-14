package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void randomNum_Difficulty_Level1() {

        // if level of difficulty is 1 -> random number shall be ->  1 =<random number =<10
        boolean expectedOutput = true;

        int randomNumber = RandomNumberGenerator.randomNum(1);

        boolean actualOutput = (randomNumber >=1 && randomNumber<=10);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void randomNum_Difficulty_Level2() {

        // if level of difficulty is 2 -> random number shall be ->  1 =<random number =<100
        boolean expectedOutput = true;

        int randomNumber = RandomNumberGenerator.randomNum(2);

        boolean actualOutput = (randomNumber >=1 && randomNumber<=100);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void randomNum_Difficulty_Level3() {

        // if level of difficulty is 3 -> random number shall be ->  1 =<random number =<1000
        boolean expectedOutput = true;

        int randomNumber = RandomNumberGenerator.randomNum(3);

        boolean actualOutput = (randomNumber >=1 && randomNumber<=1000);

        assertEquals(expectedOutput, actualOutput);
    }
}