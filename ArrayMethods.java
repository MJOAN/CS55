import java.util.Scanner;

/**
 * Course: CS55 Java Programming
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Final Exam
 * */


public class ArrayMethods {
    public static Object rowMul;
    public static Object columnMul;
    public static Object sum2DArray;
    static int[][] inputArray;
    static int x;

    ArrayMethods(int[][] inputArray, int x) {
        this.inputArray = this.inputArray;
        this.x = this.x;
    }

    public ArrayMethods() {
    }

    /** sums up all elements in array array param and returns sum */
    public static int sum2DArray( int[][] inputArray ) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i ++) {
            for (int j = 0; j < inputArray[i].length; i ++) {
                sum += inputArray[i][j];
            }
        }
        return sum;
    }

    /** returns multiplication of all elements in column x  */
    public static int columnMul(int[][] inputArray, int x) {
        int colMultiply = 0;
        for (int i = 0; i < inputArray[x].length; i ++) {
            for (int j = 0; j < inputArray[i].length; i ++) {
                colMultiply *= inputArray[i][j];
            }
        }
        return colMultiply;
    }

    /** returns multiplication of all elements in row x  */
    public static int rowMul(int[][] inputArray, int x) {
        int rowMultiply = 0;
        for (int i = 0; i < inputArray.length; i ++) {
            for (int j = 0; j < inputArray[x].length; i ++) {
                rowMultiply *= inputArray[i][j];
            }
        }
        return rowMultiply;
    }
}


class ArrayMethodsTest {
    public static void main(String[] args) {
        /** initialize 2d array 5 x 5 */
        int[][] inputArray = new int[5][5];

        /** create new Scanner object from Scanner class */
        Scanner input = new Scanner(System.in);

        /** ask user to input positive even numbers  */
        System.out.println("Please enter " + inputArray.length + " positive even numbers for rows and "
                + inputArray[0].length + " positive even numbers for columns: ");

        /** iterate over input array reading user input numbers thru i, and j */
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                inputArray[i][j] = input.nextInt();

                /** 1st attempt ensure user input is positive even numbers */
                if (i % 2 == 0 || j % 2 == 0  || i > 0 || j > 0) {
                    continue;
                } else {
                    System.out.println("Please enter an even and positive number");
                }
            }
        }

        /** print our new user input array  */
        System.out.println("Our user input array is: " + inputArray);

        /** call static methods for testing */
        ArrayMethods.columnMul (inputArray, 3);
        ArrayMethods.rowMul(inputArray, 2);
        ArrayMethods.sum2DArray (inputArray);

    }
}