package oop.assignment2.ex34.base;

import oop.assignment2.Tools.Print;

import java.util.Scanner;

public class RemoveName {

    private static final Scanner input = new Scanner (System.in);

    public static String[] removeNameFromArray(String[] s, String deleteName){


        String[] updatedString = new String[s.length-1];
        int k=0,i;



        for (i=0; i<s.length; i++){

            if (!s[i].equals(deleteName))
            updatedString[k++] = s[i];

        }

        return updatedString;
    }
}
