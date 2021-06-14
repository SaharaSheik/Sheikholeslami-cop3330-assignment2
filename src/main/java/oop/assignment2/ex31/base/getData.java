package oop.assignment2.ex31.base;

import oop.assignment2.ex29.base.GetRate;

import java.util.Scanner;

public class getData {

    public static int[] getDataArray() {

        int[] userData = new int[2];

        Scanner input = new Scanner(System.in);

        String s;

        System.out.print("Enter your Resting Pulse: ");
        s = input.nextLine();

        while (true) {

            if (GetRate.isNumber(s)) {
                userData[0] = Integer.parseInt(s);
                break;
            }
            else {
                System.out.printf("%s is not a valid input. Please enter a digit for your resting heart rate: ", s);
                s = input.nextLine();
            }
        }
            System.out.print("Enter your Age: ");
            s = input.nextLine();

            while (true) {

                if (GetRate.isNumber(s)) {
                    userData[1] = Integer.parseInt(s);
                    break;
                }
                else {
                    System.out.printf("%s is not a valid input. Please enter a digit for your age: ", s);
                    s = input.nextLine();
                }

            }

        System.out.printf("Resting Pulse: %d        Age: %d\n\n", userData[0], userData[1]);

            return userData;
        }

    }
