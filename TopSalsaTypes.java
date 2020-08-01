package com.company;
import  java.util.Scanner;

/*
 * Course: CS55 Java Programming
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print out top >= average salsa types
 */

public class TopSalsaTypes {

    public static void main(String[] args) {
        /* instantiate our Scanner class */
        Scanner input = new Scanner(System.in);

        /* declare two arrays int and string */
        String[] salsaArray = { "mild", "medium", "sweet", "hot", "zesty" };
        int[] jarsArray = {0, 0, 0, 0, 0};

        /* iterate over jars array to get each sales number for salsa type */
        System.out.print("Enter sales for each salsa type in the order of: mild, medium, sweet, hot, and zesty: ");
        for (int i = 1; i < jarsArray.length; i++) {
            jarsArray[i] = input.nextInt();
        }

        /* declare average value from method */
        double averageSalesValue = averageSales ( jarsArray );
        /* call method to print out top selling >= average salsas */
        topSellingSalsas ( averageSalesValue, jarsArray, salsaArray );
    }

    public static double averageSales(int[] jarsArray) {

        /* declare average variables */
        double sumSalesValue = 0.0;
        int n = jarsArray.length-1;

        /* iterate over our jarsArray for sum of sales */
        for (int i = 0; i < jarsArray.length; i++) {
            sumSalesValue += jarsArray[i];
        }

        /* calculate our average sales value */
        double averageSalesValue = sumSalesValue / n;
        return averageSalesValue;
    }

    public static void topSellingSalsas(double averageSalesValue, int[] jarsArray, String[] salsaArray) {

        /* iterate over our jarsArray and salsaArray to print to user >= average selling salsas */
        for (int i = 0; i < salsaArray.length; i++) {
            for (int j = 0; j < jarsArray.length+1; i++) {
                if (jarsArray[j] >= averageSalesValue) {
                    System.out.println("This top selling salsa, " +  salsaArray[i] +
                            ", was above or equal to average sales of, " +  jarsArray[i]);
                }
            }
        }
    }
}