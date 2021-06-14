package oop.assignment2.ex29.challenge;

import java.util.Scanner;

public class GetRate_Challenge1 {

    public static double getInterestRate (){
        Scanner input = new Scanner(System.in);
        double rate=0;
        String s;

        System.out.print("What is the rate of return? ");
        s=input.nextLine();

        while(true){
            if (isNumber(s) && isNotZero(s)) {
                rate = Double.parseDouble(s);
                break;
            }else
            {
                System.out.print(!isNotZero(s) ? "Sorry, 0 is not valid.  \nPlease enter a number greater than 0: " : "Sorry. That's not a valid input." + "\nWhat is the rate of return? ");
                s=input.nextLine();
            }


        }
        return rate;
    }

    public static boolean isNumber(String s){
        try {
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }


    }


    public static boolean isNotZero(String s){

        if(s.equals("0"))
            return false;

        return true;
    }

}
