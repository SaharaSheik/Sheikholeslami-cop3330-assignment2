package oop.assignment2.Tools;

public class Pseudo_Random_Number_Generator {

    public static int pseudoRandomNumber (int upperBound){

        int randomNumber = (int) ((Math.random()*upperBound)+1);

        return randomNumber;

    }


}
