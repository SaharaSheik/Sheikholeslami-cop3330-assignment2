package oop.assignment2.ex32.base;

import oop.assignment2.Tools.isNumber;

import java.util.Locale;
import java.util.Scanner;

public class GuessChecker {

    public static String guessNum (int randomNumber){

        Scanner input = new Scanner(System.in);
        String s;
        int guess, counter=1;

        System.out.print("I have my number. What's your guess? ");
        s = input.nextLine();

        while(true) {

            if (isNumber.isNumericInt(s)) {
                guess = Integer.parseInt(s);
                if (guess == randomNumber) {
                    System.out.printf("You got it in %d guesses!", counter);
                    break;
                } else {

                    System.out.print(guess<randomNumber ? "Too low. Guess again: " : "Too high. Guess again: ");
                    s = input.nextLine();
                    counter++;
                    continue;
                }
            }else{
                System.out.print("Sorry. That's not a valid input.\nPlease enter a digit as your guess: ");
                s = input.nextLine();
                counter++;
            }
        }


        System.out.print("\nDo you wish to play again (Y/N)? ");

        s = input.nextLine();
        s.toUpperCase();



        return s;
    }
}
