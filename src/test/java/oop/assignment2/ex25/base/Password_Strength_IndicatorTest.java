package oop.assignment2.ex25.base;

import oop.assignment2.ex24.base.AnagramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Password_Strength_IndicatorTest {

    @Test
    void passwordValidator_veryWeak() {

        // for 1234567 -> 1
        int expectedOutput = 1;
       int actualOutput = Password_Strength_Indicator.passwordValidator("1234567");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordValidator_Weak() {

        // for Sahar -> 2
        int expectedOutput = 2;
        int actualOutput = Password_Strength_Indicator.passwordValidator("Sahar");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordValidator_Strong() {

        // for Saharsheik777 -> 3
        int expectedOutput = 3;
        int actualOutput = Password_Strength_Indicator.passwordValidator("Saharsheik77");

        assertEquals(expectedOutput, actualOutput);


    }

    @Test
    void passwordValidator_veryStrong() {

        // for Saharsheik777$gh& -> 4
        int expectedOutput = 4;
        int actualOutput = Password_Strength_Indicator.passwordValidator("Saharsheik777$gh&");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordComplexityConvert_1_to_veryWeak() {

        // for 1 -> very weak
        String expectedOutput = "very weak";
        String actualOutput = Password_Strength_Indicator.passwordComplexityConvert(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordComplexityConvert_2_to_weak() {
        // for 2 -> weak
        String expectedOutput = "weak";
        String actualOutput = Password_Strength_Indicator.passwordComplexityConvert(2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordComplexityConvert_3_to_strong() {
        // for 3 -> strong
        String expectedOutput = "strong";
        String actualOutput = Password_Strength_Indicator.passwordComplexityConvert(3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void passwordComplexityConvert_4_to_veryStrong() {
        // for 4 -> very strong
        String expectedOutput = "very strong";
        String actualOutput = Password_Strength_Indicator.passwordComplexityConvert(4);
        assertEquals(expectedOutput, actualOutput);
    }
}