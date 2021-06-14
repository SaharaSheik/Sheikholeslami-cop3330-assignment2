package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram_return_true_for_anagram() {
        //for note tone -> true
        boolean expectedOutput = true;
        boolean actualOutput = AnagramChecker.isAnagram("note", "tone");
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void isAnagram_return_false_for_non_anagram() {

        //for dog cat -?false
        boolean expectedOutput = false;
        boolean actualOutput = AnagramChecker.isAnagram("dog", "cat");
        assertEquals(expectedOutput, actualOutput);

    }
}