package oop.assignment2.ex26.challenge2;

import oop.assignment2.ex26.base.PaymentCalculator;
import oop.assignment2.ex26.challenge1.PaymentCalculator_challenge1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserChoiceCalculatorTest {

    void calculateMonthsUntilPaidOff_test() {

        //for balance:  $10000, interest: 15, monthlyPayment: $200 -> 79
        int expectedOutput = 79;
        int actualOutput = UserChoiceCalculator.choiceCalculateMonthsUntilPaidOff(10000, 200, (15.0/100));
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void calculateMonthyPayment_test() {

        // for balance $5000, Number of months 70, Interest rate: 12% , - > $100 payment

        int expectedOutput = 100;
        int actualOutput = UserChoiceCalculator.choiceCalculateMonthyPayment(5000, 70, 12.0/(100));


        assertEquals(expectedOutput, actualOutput);
    }
}