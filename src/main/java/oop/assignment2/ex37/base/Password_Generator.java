package oop.assignment2.ex37.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */

import oop.assignment2.Tools.Pseudo_Random_Number_Generator;

import javax.sound.midi.Soundbank;
import java.util.*;

/*
Coming up with a password that meets specific requirements is something your computer can do.
And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length,
the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
Challenges
Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.

 */
public class Password_Generator {

    public static void main(String[] args) {



        String initialPassword = inputTaker();

        List<String> randomPassword= randomPasswordMaker(initialPassword);

        printRandomPassword(randomPassword);


        //ask for num of special char
        // call pseudo to pick num special chars,
        // add each to list

        // ask for num of numbers
        // call pseudo to pick num numbers
        // add each to list

        // deduct num and special from total and come up with num of letters you need,
        // call pass that many time to get the numbers
    }

    public static String inputTaker() {

        String s = "";

        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int minLength = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int numOfSpecialChars = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int numOfNumbers = Integer.parseInt(input.nextLine());

        int numOfLetters = numOfNumbers + numOfSpecialChars + 1;

        if ((numOfLetters + numOfLetters + numOfSpecialChars) < minLength)
            numOfLetters += (minLength - numOfLetters - numOfLetters - numOfSpecialChars);

        int i;

        for (i = 0; i < numOfNumbers; i++) {

            s += randomNumberGenerator();

        }
        for (i = 0; i < numOfSpecialChars; i++) {

            s += randomSpecialCharGenerator();
        }
        for (i = 0; i < numOfLetters; i++) {

           s += randomletterGenerator();

        }




            return s;

    }
        public static char randomNumberGenerator(){

        String numberList = "0123456789";

        int i = Pseudo_Random_Number_Generator.pseudoRandomNumber(numberList.length())-1;
        char randomNumber = numberList.charAt(i);

        return randomNumber;
    }


    public static char randomSpecialCharGenerator(){

            String specialChar = "!#$%&()*+-/:;<=>?@[]^_{|}~";

              int i = Pseudo_Random_Number_Generator.pseudoRandomNumber(specialChar.length())-1;

              char randomSpecialChar = specialChar.charAt(i);

              return randomSpecialChar;
          }

    public static char randomletterGenerator(){

       //pseudoRandomNumber picks a number between 1 & upper bond.  I deducted -1 to represent numbers from 0 to 25
        //then added 97 to represent ASCII values of a to z and casted it to char

        char randomLetter  = (char) (Pseudo_Random_Number_Generator.pseudoRandomNumber(26)-1+97);


        return randomLetter;
    }

    public static List<String> randomPasswordMaker(String initialPassword){

        List<String> shuffledPassword = new ArrayList<String>(Arrays.asList(initialPassword.split("")));

         Collections.shuffle(shuffledPassword);


        return shuffledPassword;

    }

    public static void printRandomPassword(List<String> randomPassword){

        String output =  String.join("", randomPassword);
        System.out.println("Your password is "+ output);


    }
}