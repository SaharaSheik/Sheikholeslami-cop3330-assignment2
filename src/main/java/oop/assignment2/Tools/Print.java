package oop.assignment2.Tools;

public class Print {

    public static void printStringArray(String[] s, int arraySize){

        int i;

        for (i=0; i<arraySize; i++)
            System.out.println(s[i]);

    }

    public static void printStringArrayElement (String[] s, int element){

        System.out.print(s[element]);
    }


}
