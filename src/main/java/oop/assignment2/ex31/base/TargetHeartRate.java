package oop.assignment2.ex31.base;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TargetHeartRate {

    public static int []heartRateCalculator (int restingHR, int age){

        int i,j=0, maxRange = 95, minRange= 55, numOfElements =( (maxRange-minRange)/5) +1;

        int [] heartRateArray = new int[numOfElements];

        for (i=55; i<=95; i+=5 ){

                heartRateArray[j++]= (int) Math.round((((220-age)-restingHR)*(i/100.0))+restingHR);



            }





        return heartRateArray;
    }
}
