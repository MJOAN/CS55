import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Course: CS55 Java Programming
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Final Exam
 * */


public class ArrayCountMethods {
    static int[] inputArray;

    public ArrayCountMethods() {
    }

    /** counts how many even numbers are in array returns total even numbers */
    public static int countEven(int[] inputArray) {
        int totalEvenNums = 0;
        for (int i = 0; i < inputArray.length; i ++) {
            if (i % 2 == 0) totalEvenNums += inputArray[i];
            else continue;
        }
        return totalEvenNums;
    }

    /** counts how many odd numbers are in array returns total odd numbers  */
    public static int countOdd(int[] inputArray) {
        int totalOddNums = 0;
        for (int i = 0; i < inputArray.length; i ++) {
            if (i % 2 != 0) totalOddNums += inputArray[i];
            else continue;
        }
        return totalOddNums;
    }

    /** prints out all numbers that can be divided by 5 with no remainder  */
    public static void printDividedBy5(int[] inputArray) {

        /** store the count of nums  */
        int moduloFive = 0;
        /** store all nums that are modulo 5 could use ArrayList<>() because works with unknown size */
        ArrayList<Integer> moduloFiveArray = new ArrayList<Integer>();

        /** iterate over input array if num % 5 output to new array  */
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 5 == 0) {
                moduloFive += inputArray[i];
                int moduloFiveValue = inputArray[i];
                moduloFiveArray.add(moduloFiveValue);
            }
        }

        /** print out to user results  */
        if (moduloFive > 0) {
            System.out.println ( "The total count of numbers that are % 5 no remainder: " + moduloFive );
            System.out.println ( "These are all the numbers that are % 5 no remainder: " + moduloFiveArray);
        }
        else System.out.println ( "Good bye!" );
    }

}


class ArrayMethodsTest {
    public static void main(String[] args) {
        /** instantiate ArrayMethods class */
        // ArrayCountMethods a = new ArrayCountMethods ();

        /** initialize 1d array 20 integers */
        int[] inputArray = new int[20];

        /** create new Scanner object from Scanner class */
        Scanner input = new Scanner(System.in);

        /** ask user to input positive even numbers  */
        System.out.println("Please enter 20 numbers in range of 0 to 100 ");

        /** iterate over array reading numbers must be in range 0-100  */
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.nextInt();

            /** catch error in user input  */
            if ( i < 0 || i > 100) {
                System.out.println("Please enter a number above 0 and less than or equal to 100");
            } else {
                continue;
            }
        }
        /** print our new user input array  */
        System.out.println("Our user input array is: " + Arrays.toString ( inputArray ) );

        /** call static methods for testing */
        int evenNums = ArrayCountMethods.countEven (inputArray);
        int oddNums = ArrayCountMethods.countOdd(inputArray);

        /** print results for testing */
        System.out.println(" Here are the even count " + evenNums);
        System.out.println(" Here are the odd count " + oddNums);
        ArrayCountMethods.printDividedBy5 (inputArray);
    }
}
