/*
 * Course: CS55 Java Programming, Extra Credit
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print 2d array functions
 * */


import java.util.Scanner;

class Zoo {
    /** member variables */
    public static String[][] monkeyEatenPerWeek;
    public static Integer[][] poundsEatenPerWeek;
    String monkeyNameOne;
    String monkeyNameTwo;
    String monkeyNameThree;

     /** declare zoo constructor  */
    public Zoo() {
        this.monkeyEatenPerWeek = monkeyEatenPerWeek;
        this.poundsEatenPerWeek = poundsEatenPerWeek;
    }

    public void getAverageEaten(int[][] poundsEatenPerWeek) {
        int sum = 0;
        double average = 0.0;

        /** get average value of food eaten for all monkeys */
        for (int i = 0; i < poundsEatenPerWeek.length; i++ ) {
            for (int j = 0; j < poundsEatenPerWeek[i].length; j++) {
                /** iterate over 2d array and add current vvalues to sum  */
                sum = sum + poundsEatenPerWeek[i][j];
                /** from sum divide by array len to get average  */
                average = sum / poundsEatenPerWeek.length;
            }
        }
        System.out.println("The average amount of food eaten for monkey family was: " + average);
    }

    public void getMaxEatenPerFamily(int[][] poundsEatenPerWeek) {
        /** set max value to first value in 2d array */
       int max = poundsEatenPerWeek[0][0];

       /** get max value of food eaten */
       for (int i = 0; i < poundsEatenPerWeek.length; i++ ) {
           for (int j = 0; j < poundsEatenPerWeek[i].length; j++) {
               /** iterate over 2d array and check if current value is < max */
               if (max < poundsEatenPerWeek[i][j]) {
                   max = poundsEatenPerWeek[i][j];
               }
           }
       }
       System.out.println("The maximum amount of food eaten during the week by any one monkey was: " + max);
    }

    public void getMinEatenPerFamily(int[][] poundsEatenPerWeek) {
        /** set min value to first value in 2d array */
        int min = poundsEatenPerWeek[0][0];

        /** get min value of food eaten */
        for (int i = 0; i < poundsEatenPerWeek.length; i++ ) {
            for (int j = 0; j < poundsEatenPerWeek[i].length; j++) {
                /** iterate over 2d array and check if current value is > min */
                if (min > poundsEatenPerWeek[i][j]) {
                    min = poundsEatenPerWeek[i][j];
                }
            }
        }
        System.out.println("The minimum amount of food eaten during the week by any one monkey was: " + min);
    }
}

public class monkeyBusiness {
    public static void main(String[] args) {

        /** declare 2d array 3x5 object */
        Zoo zoo = new Zoo();

        String[][] monkeyReport = {{"MonkeyOne", "MonkeyTwo", "MonkeyThree"}, {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}};
        int[][] poundsEatenReport = new int[3][5];
        int poundsEaten = 0;

        /** declare Scanner object */
        Scanner input = new Scanner (System.in);

        /** ask user for 3 monkey names amd food pounds */
        for (int i = 0; i < poundsEatenReport.length; i++) {
            for (int j = 0; j < poundsEatenReport[i].length; j++) {
                System.out.print ( "For monkey " + i + " enter the pounds of food eaten for the week: ");
                poundsEaten = input.nextInt ();
                /** validate user input is a positive integer */
                if (poundsEaten <= 0) System.out.println ( "Your number must be a positive integer" );
                else poundsEatenReport[i][j] = poundsEaten;

            }
        }

        System.out.println("Monkey Business Report: ");
        System.out.print("Average: ");
        zoo.getAverageEaten(poundsEatenReport);
        System.out.print("Min: ");
        zoo.getMinEatenPerFamily(poundsEatenReport);
        System.out.print("Max: ");
        zoo.getMaxEatenPerFamily(poundsEatenReport);

    }
}
