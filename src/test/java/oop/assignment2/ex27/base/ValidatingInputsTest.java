package oop.assignment2.ex27.base;

import oop.assignment2.ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void isLessThanTwoCharactersLong_true() {

        // for "S" (an input of less than chars) -> true
        boolean expectedOutput = true;
        boolean actualOutput = ValidatingInputs.isLessThanTwoCharactersLong("S");
        assertEquals(expectedOutput, actualOutput);
    }

    void isLessThanTwoCharactersLong_false() {

        // for "Sahar" (an input of more than or equal to 2 chars) -> false
        boolean expectedOutput = false;
        boolean actualOutput = ValidatingInputs.isLessThanTwoCharactersLong("Sahar");
        assertEquals(expectedOutput, actualOutput);
    }
    @Test

    void isNotNumerical_true() {

        // for s6764ag (a non numerical string) -> true
        boolean expectedOutput = true;
        boolean actualOutput = ValidatingInputs.isNotNumerical("s6764ag");
        assertEquals(expectedOutput, actualOutput);

    }

    void isNotNumerical_true_false() {

        // for 7346832 (a numerical string) -> false
        boolean expectedOutput = false;
        boolean actualOutput = ValidatingInputs.isNotNumerical("7346832");
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void employeeIDFormat_true() {

        // for XYZ1-65ya (a badly formatted employee id ) -> true
        boolean expectedOutput = true;
        boolean actualOutput = ValidatingInputs.employeeIDFormat("XYZ1-65ya");
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    void employeeIDFormat_false() {

        // for XY-765 (a correctly formatted employee id ) -> false
        boolean expectedOutput = false;
        boolean actualOutput = ValidatingInputs.employeeIDFormat("XY-765");
        assertEquals(expectedOutput, actualOutput);
    }


}