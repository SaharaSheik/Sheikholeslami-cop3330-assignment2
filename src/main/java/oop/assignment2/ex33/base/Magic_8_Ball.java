package oop.assignment2.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sahar Sheikholelsami
 */

/*

Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program.
If you combine that with a random number generator,
you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
Challenges
Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.

*/


import oop.assignment2.Tools.Pseudo_Random_Number_Generator;

public class Magic_8_Ball {

    public static void main(String[] args) {

        int randomNumber = Pseudo_Random_Number_Generator.pseudoRandomNumber(4);

        String answer = StringSelector.stringMatch(randomNumber);

        AnswerPrinter.print(answer);


    }
}
