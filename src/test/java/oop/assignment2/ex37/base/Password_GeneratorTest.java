package oop.assignment2.ex37.base;

import oop.assignment2.ex25.base.Password_Strength_Indicator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Password_GeneratorTest {

    @Test
    void randomNumberGenerator() {


        char randomChar = Password_Generator.randomNumberGenerator();

        boolean actualOutput = (randomChar>='0' && randomChar <='9');
        Assertions.assertTrue(actualOutput);
    }


    @Test
    void randomletterGenerator() {
        char randomLetter = Password_Generator.randomletterGenerator();
        boolean actualOutput = (randomLetter>='a' && randomLetter <='z');
        Assertions.assertTrue(actualOutput);



    }

    @Test
    void randomPasswordMaker() {

        String initialPassword = "12%$abcde";

        List<String> initialPass = new ArrayList<String>(Arrays.asList(initialPassword.split("")));

        List<String> shuffledPassword = Password_Generator.randomPasswordMaker(initialPassword);

        // checking if the initial string password  was shuffled and Not equal to final shuffled password
        boolean actualOutPut =  !(initialPass.equals(shuffledPassword));

        Assertions.assertTrue(actualOutPut);


    }
}