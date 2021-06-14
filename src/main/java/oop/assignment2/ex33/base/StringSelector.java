package oop.assignment2.ex33.base;

public class StringSelector {

    private static final String[] ANSWER ={"Yes", "No", "Maybe" ,"Ask again later."};

    public static String stringMatch (int randomNumber){

        return ANSWER[randomNumber-1];
    }
}
