package oop.assignment2.ex26.base;

import oop.assignment2.ex24.base.AnagramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {

        //for balance:  $10000, interest: 8, monthlyPayment: $200 -> 79
        int expectedOutput = 79;
        int actualOutput = PaymentCalculator.calculateMonthsUntilPaidOff(10000, 200, (15.0/100)/365);
        assertEquals(expectedOutput, actualOutput);
    }


}