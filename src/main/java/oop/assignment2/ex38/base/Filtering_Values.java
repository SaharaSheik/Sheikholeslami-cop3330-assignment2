package oop.assignment2.ex38.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */
/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the
program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in
function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old
array and returns the new array.
Challenge
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.

 */
public class Filtering_Values {

    public static void main(String[] args) {

        String s = inputTaker();
        int[] initialArray = stringConverter(s);
        int[] updatedArray = filterEvenNumbers(initialArray);
        printEvenNumbers(updatedArray);


    }

    public static String inputTaker(){
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Enter a list of numbers, separated by spaces: ");
        s=input.nextLine();

        return s;
    }

    public static int[] stringConverter(String s){

        String [] splitS= s.split(" ");
        int[] intArray = new int[splitS.length];

        for(int i=0; i< splitS.length; i++){

            intArray [i]= Integer.parseInt(splitS[i]);
        }
        return intArray;
    }

    public static int [] filterEvenNumbers(int[] numbers){
        String evenNumbers="";
        int i;
        for (i=0; i< numbers.length; i++){
            if (numbers[i]%2 == 0)
                evenNumbers +=(numbers[i]+ " ");

        }

        int[] evenNumbersIntArray = stringConverter(evenNumbers);

        return evenNumbersIntArray;
    }

    public static void printEvenNumbers(int[] numbers){

        System.out.print("The even numbers are ");
        for(int i=0; i<numbers.length; i++)
            System.out.print(numbers[i]+ " ");


    }
}
