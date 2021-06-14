package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Filtering_ValuesTest {

    @Test
    void stringConverter_test() {
        // convert string "6 7 11 12 4 77 10" to int array {6, 7, 11, 12, 4, 77, 10,}

        String test = "6 7 11 12 4 77 10";
        int [] expected = new int[] {6, 7, 11, 12, 4, 77, 10};
        int [] actual = Filtering_Values.stringConverter(test);
        int i;

        for (i=0; i<expected.length; i++){
            if(expected[i]!=actual[i])
                break;
        }
        // if i = length of int array that means the loop was completed without breaking hence the elements of actual
        // and expected were all equal

        boolean loopChecker = (i==expected.length);

        assert(loopChecker);

    }

    @Test
    void filterEvenNumbers_test() {

        // filter int array {6, 7, 11, 12, 4, 77, 10} to even int array of {6, 4, 10};
        int [] test = {6, 7, 11, 12, 4, 77, 10};
        int [] expected = new int[] {6, 12, 4, 10};
        int [] actual = Filtering_Values.filterEvenNumbers(test);



        int i;

        for (i=0; i<expected.length; i++){
            if(expected[i]!=actual[i])
                break;
        }
        // if i = length of int array that means the loop was completed without breaking hence the elements of actual
        // and expected were all equal

        boolean loopChecker = (i==expected.length);

        assert(loopChecker);


    }


}