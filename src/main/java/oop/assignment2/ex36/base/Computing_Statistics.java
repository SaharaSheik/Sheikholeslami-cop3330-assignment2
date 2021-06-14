package oop.assignment2.ex36.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static oop.assignment2.Tools.isNumber.isNumericInt;

/*
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities. For example,
the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time,
and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55
Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
Challenges
Have the program read in numbers from an external file instead of prompting for the values.
 */
public class Computing_Statistics {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = IntArrayMaker();
        printStats(numbers,minFinder(numbers), maxFinder(numbers), averageFinder(numbers), stdFinder(numbers, averageFinder(numbers)));



    }

    public static ArrayList<Integer> IntArrayMaker (){

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int num;
        String s;
        while(true){

            System.out.print("Enter a number: ");
            s=input.nextLine();

            if (s.equals("done"))
                break;
            else if  (isNumericInt(s)){
                numbers.add(Integer.parseInt(s));
                continue;
            }
            else
                continue;
        }

        return numbers;
    }

    public static int minFinder(ArrayList<Integer> numbers){

        int min = numbers.get(0);

        for (int i =1; i<numbers.size(); i++){

            if (min > numbers.get(i))
                min = numbers.get(i);

        }

        return  min;
    }

    public static int maxFinder(ArrayList<Integer> numbers){

        int max = numbers.get(0);

        for (int i =1; i<numbers.size(); i++){

            if (max < numbers.get(i))
                max = numbers.get(i);

        }

        return  max;
    }

    public static double averageFinder(ArrayList<Integer> numbers){

        int sum = 0;
        double average;

        for (int i =0; i<numbers.size(); i++){

            sum +=numbers.get(i);

        }
        average = sum*1.0/numbers.size();

        return  average;
    }

    public static double stdFinder(ArrayList<Integer> numbers, double average){

        double std, sum=0;

        for (int i =0; i<numbers.size(); i++){

            sum += Math.pow(numbers.get(i)-average,2);

        }

        std = Math.sqrt(sum*1.0/numbers.size());

        return  std;
    }

    public static void printStats (ArrayList<Integer> numbers, int min, int max, double average, double std){
        System.out.print("Numbers: ");
        for (int i=0; i<numbers.size(); i++)
        System.out.print(numbers.get(i) + " ");

        System.out.printf("\nThe average is %.1f\nThe minimum is %d\nThe maximum is %d\nThe standard deviation is %.2f", average, min, max, std);
//        Numbers: 100, 200, 1000, 300
//        The average is 400.0
//        The minimum is 100
//        The maximum is 1000
//        The standard deviation is 353.55
    }




}
