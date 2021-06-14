package oop.assignment2.ex31.base;

public class OutputGenerator {

    public static void printTable(int[] array){

        int i;
        int n = 50;
        System.out.printf("Intensity\t| Rate\n" +
                "------------|--------\n");
        for (i=0; i<array.length; i++){

            System.out.printf("%d%%\t\t\t|%d bpm\n", n+=5, array[i]);

        }



    }
}


//Resting Pulse: 65        Age: 22
//
//Intensity    | Rate
//-------------|--------
//55%          | 138 bpm
//60%          | 145 bpm
//65%          | 151 bpm
//:               :        (extra lines omitted)
//85%          | 178 bpm
//90%          | 185 bpm
//95%          | 191 bpm