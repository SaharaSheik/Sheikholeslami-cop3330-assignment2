package oop.assignment2.ex24.challenge;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */
/*
Exercise 24 - Anagram Checker
Challenge 1 DONE
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should
prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its
arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
Challenge
Complete this program without using built-in language features. Use selection or repetition logic
instead and develop your own algorithm.
 */

import java.util.Scanner;

public class AnagramCheckerChallenge {

    private static Scanner input = new Scanner(System.in);
    private static String word1;
    private static String word2;
    private static final int charCount = 256;


    public static void main(String[] args) {


        getStrings();

        printAnswer(isAnagram(word1, word2));

    }

    public static void getStrings() {


        System.out.print("Enter the first string: ");
        word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        word2 = input.nextLine();


    }


    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int counterArray[] = new int[charCount];
        int i;
        for (i = 0; i < s1.length(); i++) {
            counterArray[s1.charAt(i)]++;
            counterArray[s2.charAt(i)]--;
        }
        for (i = 0; i < charCount; i++) {
            if (counterArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void printAnswer (boolean answer){


        System.out.println("\"" + word1 + "\"" + " and " + "\"" + word2 + "\"" + ( answer? " are anagrams." : " are not anagrams."));
    }
}
