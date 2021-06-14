package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Computing_StatisticsTest {

    @Test
    void minFinder() {
        //to ensure test accuracy I obtained std data from outside source lised below:
        //https://www.calculator.net/standard-deviation-calculator.html?numberinputs=1090%2C+98%2C+700%2C+650%2C+100&ctype=p&x=58&y=21
        // for numbers {1090, 98, 700, 650, 100} - > Min = 98

        ArrayList<Integer> numbers = new ArrayList<>(){{add(1090); add(98);add(700); add(650); add(100);}};

        int expected = 98;
        int actual = Computing_Statistics.minFinder(numbers);

        assertEquals(expected, actual);

    }

    @Test
    void maxFinder() {
        //to ensure test accuracy I obtained std data from outside source lised below:
        //https://www.calculator.net/standard-deviation-calculator.html?numberinputs=1090%2C+98%2C+700%2C+650%2C+100&ctype=p&x=58&y=21
        // for numbers {1090, 98, 700, 650, 100} - > Max = 1090

        ArrayList<Integer> numbers = new ArrayList<>(){{add(1090); add(98);add(700); add(650); add(100);}};

        int expected = 1090;
        int actual = Computing_Statistics.maxFinder(numbers);

        assertEquals(expected, actual);

    }

    @Test
    void averageFinder() {

        //to ensure test accuracy I obtained std data from outside source lised below:
        //https://www.calculator.net/standard-deviation-calculator.html?numberinputs=1090%2C+98%2C+700%2C+650%2C+100&ctype=p&x=58&y=21
        // for numbers {1090, 98, 700, 650, 100} - > average = 527.6

        ArrayList<Integer> numbers = new ArrayList<>(){{add(1090); add(98);add(700); add(650); add(100);}};

        double expected = 527.6;
        double actual = Math.round(Computing_Statistics.averageFinder(numbers)*10)/10.0;

        assertEquals(expected, actual);
    }

    @Test
    void stdFinder() {
        //to ensure test accuracy I obtained std data from outside source lised below:
        //https://www.calculator.net/standard-deviation-calculator.html?numberinputs=1090%2C+98%2C+700%2C+650%2C+100&ctype=p&x=58&y=21
        // for numbers {1090, 98, 700, 650, 100} and average -> 527.6 - > expected std rounded to two -> 381.68

        ArrayList<Integer> numbers = new ArrayList<>(){{add(1090); add(98);add(700); add(650); add(100);}};

        double expected = 381.68;
        double actual = Math.round(Computing_Statistics.stdFinder(numbers, 527.6)*100)/100.0;

        assertEquals(expected, actual);


    }
}