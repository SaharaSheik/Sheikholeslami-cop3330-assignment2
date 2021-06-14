package oop.assignment2.ex29.base;


public class yearCalculator {

    public static int getYear (double rate) {
        int year = (int) (Math.ceil(72 / rate));

        return year;
    }
}
