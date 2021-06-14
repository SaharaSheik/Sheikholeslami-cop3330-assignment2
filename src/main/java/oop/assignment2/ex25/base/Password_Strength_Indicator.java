package oop.assignment2.ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */
/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a
value you can evaluate to determine the password strength. Do not have the function return a string—you may need to
support multiple languages in the future.
Use a single output statement.

Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time.
As someone enters a password, determine its strength and display the result
 */

import java.util.Scanner;

public class Password_Strength_Indicator {

    private static final Scanner input = new Scanner(System.in);
    private static String password;
    private static String complexity;

    public static void main(String[] args) {

        getStrings();

        int passwordComplexity = passwordValidator(password);

        complexity = passwordComplexityConvert (passwordComplexity);
        printAnswer(complexity);


    }

    public static void getStrings() {



        System.out.print("Enter password: ");
        password = input.nextLine();

    }

    public static int passwordValidator (String pass) {

        int passLength = pass.length();
        String specialChar = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        int specialCharlength =  specialChar.length();


        int digitFlag=0, charFlag=0, lettersFlag=0, specialCharFlag=0, i, j, strength=0;

        for (i=0; i<passLength; i++){

            if (Character.isDigit(pass.charAt(i)))
                digitFlag++;

            if (Character.isLetter(pass.charAt(i)))
                lettersFlag++;

                for (j=0; j<specialCharlength; j++){

                if (pass.charAt(i) == specialChar.charAt(j))
                    specialCharFlag++;
            }

        }


            if (passLength < 8 && lettersFlag ==0 && specialCharFlag == 0 )
                strength = 1;
            else if (passLength <8 && digitFlag == 0 && specialCharFlag == 0)
                strength =2;
            else if (passLength >=8 && digitFlag>0 && lettersFlag> 0 && specialCharFlag == 0)
                strength = 3;
            else if (passLength>=8 && digitFlag>0 && lettersFlag >0 && specialCharFlag>0)
                strength = 4;



        return strength;


    }

    public static String passwordComplexityConvert (int i) {

        String passComplexity="";

        switch (i){

            case 1:
                passComplexity = "very weak";
                        break;
            case 2:
                passComplexity = "weak";
                break;
            case 3:
                passComplexity = "strong";
                break;
            case 4:
                passComplexity = "very strong";
                break;
            default:
                passComplexity ="undefined category under the assignment";
        }
        return passComplexity;
    }

    public static void printAnswer (String answer){


        System.out.print("The password '" + password + "' is a "+ answer + " password");
    }

}

