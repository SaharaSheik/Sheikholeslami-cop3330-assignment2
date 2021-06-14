package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNameTest {

    @Test
    void removeNameFromArray_Try_Deleting_pink () {

        // initial string {"red", "white", "pink", "blue"} for pink deletion ->
        // expected Array return array  {"red", "white", "blue"}

        String[] original = {"red", "white", "pink", "blue"};
        String [] expected = {"red", "white", "blue"};
        String [] actual = RemoveName.removeNameFromArray(original, "pink");

        for(int i =0; i<expected.length; i++)
        assertTrue(expected[i].equals(actual[i]));



    }
}