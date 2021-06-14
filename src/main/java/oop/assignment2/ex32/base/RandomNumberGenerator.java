package oop.assignment2.ex32.base;

import java.util.Random;

public class RandomNumberGenerator {

    public static int randomNum (int levelOfDifficulty){
        int randomNumber;
        Random rand = new Random();

        if (levelOfDifficulty == 1)
            randomNumber = (rand.nextInt(10))+1;

        else if (levelOfDifficulty == 2)
            randomNumber = (rand.nextInt(100)) + 1;

        else
            randomNumber = (rand.nextInt(1000))+1;


        return randomNumber;
    }
}
