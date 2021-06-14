package oop.assignment2.ex33.base;

import java.util.Scanner;

public class AnswerPrinter {

    public static void print (String answer){

        Scanner input = new Scanner(System.in);

        System.out.print("What's your question?\n>");
        String s = input.nextLine();

        System.out.println(answer);


    }


}
