package oop.assignment2.ex26.challenge1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculator_challenge1Test {

    @Test
    void calculateMonthyPayment_test() {

        // for balance $5000, Number of months 70, Interest rate: 12% , - > $100 payment

        int expectedOutput = 100;
        int actualOutput = PaymentCalculator_challenge1.calculateMonthyPayment(5000, 70, 12.0/(100*12));


        assertEquals(expectedOutput, actualOutput);
    }
}