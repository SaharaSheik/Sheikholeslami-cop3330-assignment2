package oop.assignment2.Tools;

public class isNumber {

    public static boolean isNumericInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
        public static boolean isNumericDouble (String s){
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }

        }
    }


