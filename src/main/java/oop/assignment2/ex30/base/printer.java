package oop.assignment2.ex30.base;

public class printer {

    public static void printArray (int[][] array, int row, int col){

        int i, j;

        for (i=0; i<row; i++) {

            for (j = 0; j < col; j++){

                System.out.printf("%5d", array[i][j]);

            }
            System.out.println();
        }
    }
}
