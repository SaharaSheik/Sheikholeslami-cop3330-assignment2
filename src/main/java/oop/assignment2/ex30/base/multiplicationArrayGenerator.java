package oop.assignment2.ex30.base;

public class multiplicationArrayGenerator {

    public static int[][] multiplier (int row,int col){

        int [][] array = new int [row][col];
        int i, j;

        for (i=0; i<row; i++) {

            for (j = 0; j < col; j++){

                array[i][j]=(i+1)*(j+1);
            }
        }
                return array;
    }


}