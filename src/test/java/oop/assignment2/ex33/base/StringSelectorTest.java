package oop.assignment2.ex33.base;

import oop.assignment2.Tools.Pseudo_Random_Number_Generator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSelectorTest {

    @Test
    void stringMatch_RandomNumber_1_Test() {

        // ANSWER ={"Yes", "No", "Maybe" ,"Ask again later."};
        // for Random Number 1  -> 1st element of array -> Yes

        String expectedOutput = "Yes";
        String actualOutput = StringSelector.stringMatch(1);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void stringMatch_RandomNumber_2_Test() {

        // ANSWER ={"Yes", "No", "Maybe" ,"Ask again later."};
        // for Random Number 2  -> 2nd element of array -> No

        String expectedOutput = "No";
        String actualOutput = StringSelector.stringMatch(2);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void stringMatch_RandomNumber_3_Test() {

        // ANSWER ={"Yes", "No", "Maybe" ,"Ask again later."};
        // for Random Number 3  -> 3rd element of array -> Maybe

        String expectedOutput = "Maybe";
        String actualOutput = StringSelector.stringMatch(3);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void stringMatch_RandomNumber_4_Test() {

        // ANSWER ={"Yes", "No", "Maybe" ,"Ask again later."};
        // for Random Number 4  -> 4th element of array -> Yes

        String expectedOutput = "Ask again later.";
        String actualOutput = StringSelector.stringMatch(4);
        assertEquals(expectedOutput, actualOutput);
    }
        @Test
        void Pseudo_RandomNumber_Test(){

            // for a 500 upper Bound, the random number ro be between 1 to 500
            int randomNumber = Pseudo_Random_Number_Generator.pseudoRandomNumber(500);

            boolean expectedOutput = true;
            boolean actualOutput = (randomNumber>=1 && randomNumber<=500);
            assertEquals(expectedOutput, actualOutput);

    }
}