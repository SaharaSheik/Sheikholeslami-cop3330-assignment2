package oop.assignment2.ex32.base;



import oop.assignment2.Tools.isNumber;

import java.util.Scanner;

public class getData {


    public static int difficultyLevel() {

        Scanner input = new Scanner(System.in);

        String s;
        int levelOfDifficulty;

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        s=input.nextLine();


            while(true) {
                if (isNumber.isNumericInt(s)) {
                    levelOfDifficulty = Integer.parseInt(s);
                    break;
                } else {
                    System.out.print("Sorry. That's not a valid input.\nPlease enter the difficulty level (1, 2, or 3): ");
                    s = input.nextLine();
                }

            }
           return levelOfDifficulty;
        }


    }

