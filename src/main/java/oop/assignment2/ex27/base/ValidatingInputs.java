package oop.assignment2.ex27.base;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */

/*
Exercise 27 - Validating Inputs

Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter an employee ID: A12-1234
"J" is not a valid first name. It is too short.
The last name must be filled in.
The ZIP code must be numeric.
A12-1234 is not a valid ID.
Or

Enter the first name: Jimmy
Enter the last name: James
Enter the ZIP code: 55555
Enter an employee ID: TK-421
There were no errors found.
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function
that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.

 */

import java.util.Scanner;

public class ValidatingInputs {

    private static final Scanner input = new Scanner(System.in);
    private static String firstName;
    private static String lastName;
    private static String employeeID;
    private static String zipCode;




    public static void main(String[] args) {

        validateInput();


    }

    public static void validateInput() {

        String output="";

        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

            if (firstName.isEmpty()) {
                output = "The first name must be filled in\n";

            } else if (isLessThanTwoCharactersLong(firstName))
                output += "\"" + firstName + "\" is not a valid last name. It is too short.\n";


        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

            if (lastName.isEmpty())
                output += "The last name must be filled in\n";
            else if (isLessThanTwoCharactersLong(lastName))
                output += "\"" + lastName + "\" is not a valid last name. It is too short.\n";

        System.out.print("Enter the ZIP code: ");
        zipCode = input.nextLine();
            if(isNotNumerical(zipCode))
                output += "The ZIP code must be numeric.\n";

        System.out.print("Enter an employee ID: ");
        employeeID = input.nextLine();
            if (employeeIDFormat(employeeID))
                output +=employeeID + " is not a valid ID.";

        System.out.print((output =="")? "There were no errors found." : output);

    }

    public static boolean isLessThanTwoCharactersLong (String s){

        int i;

        if (s.length()<2)
            return true;

        for (i=0; i<s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)))
               return true;
        }

            return false;

    }

    public static boolean isNotNumerical (String s){

        int i;
        for (i=0; i<s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                break;
        }

        if (i<s.length())
            return true;

        else
            return false;

    }

    public static boolean employeeIDFormat (String s){

//        NOTE: the program had asked for 4 digits after the "-" in employee id, but in the example employee id
//        TK-421 was considered correct.  So I made my employee loop up tp 6 to produce the output expected but
//        I understand to get the 4 numbers this numbers needs to change to 7 and my test would need to be adjusted


        int i, flag=0;

        if (s.charAt(2) != '-' || s.length()!=6)
        return true;


        for (i=0; i<2; i++) {
            if (!Character.isLetter(s.charAt(i)))
                return true;
        }

        for (i=3; i<s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return true;
        }

            return false;

    }

}