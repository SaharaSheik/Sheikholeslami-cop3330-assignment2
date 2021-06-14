package oop.assignment2.ex35.base;

import oop.assignment2.Tools.isNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaker {

    public static ArrayList<String> nameArrayMaker (){

        ArrayList<String> nameArray = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String s;

        while(true){


            System.out.print("Enter a name: ");
            s=input.nextLine();

            if(s=="")
                break;

            else if (s!="") {

                nameArray.add(s);

                continue;
            }else
                continue;
        }

        return nameArray;
    }
}
