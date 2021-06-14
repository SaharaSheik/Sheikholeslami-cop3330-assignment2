package oop.assignment2.ex29.challenge;

import oop.assignment2.ex29.base.GetRate;
import oop.assignment2.ex29.base.yearCalculator;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */

/*
Exercise 29 - Handling Bad Input
Challenge 1 DONE


 */

public class Handling_Bad_Input_Challenge1 {


        public static void main(String[] args) {


            GetRate_Challenge1 yearlyRate = new GetRate_Challenge1();
            double rate =yearlyRate.getInterestRate();


            yearCalculator year = new yearCalculator();
            int investmentDoubleYears = year.getYear(rate);

            printAnswer(investmentDoubleYears);

        }

        public static void printAnswer (int year){

            System.out.print("It will take "+ year + " years to double your initial investment.");

        }
    }


