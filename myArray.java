import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Course: CS55 Java Programming, Extra Credit
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print 2d array functions
 * */

class myArrayFunctions {
    /** member variables */
    int[] myArray;
    int arraySize;

    /** myArray constructor */
    public myArrayFunctions(int[] myArray, int arraySize) {
        this.myArray = myArray;
        this.arraySize = arraySize;
    }

    public myArrayFunctions() {
    }

    /** create sortArray() */
    public void sortArray(int[] myArray, int arraySize) {
        /** method: sortArray()
         *  params: int[] myArray, int arraySize
         *  does: sort using selection sort
         *  return: sorted array
         */

        /**  iterate first start at index 0 and create new variable selected */
        for (int i = 0; i < arraySize-1; i++ ) {
            int selected = i;

            /**  iterate at index 1 and see if index 1 is < than index 0
             *   if so, set that new value to the "selected" variable */
            for (int j = i + 1; j < arraySize; j++ ) {
                if ( myArray[j] < myArray[selected] ) {
                    selected = j;
                }

                /**  before we exit the inner for loop
                 *   we swap the value at "selected" variable with a temp variable */
                int temp = myArray[selected];
                myArray[selected] = myArray[i];
                myArray[i] = temp;
            }

        }
        System.out.println("The minimal value from the new sorted array is: " + myArray[0]);
        System.out.println("The maximum value from the new sorted array is: " + myArray[arraySize-1]);
    }

    /** create mostFrequency() method */
    public void mostFrequency(int[] myArray, int arraySize) {
        /** method: mostFrequency()
         *  params: int[] finalSortedArray
         *  does: gets min and max values from sortArray[]
         *  return: frequently occurring values
         */

        int mode = 0;
        int numFrequency = 0;
        int mostFrequentElement = 0;

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {

                /**  iterate over myArray at index 0 and 1  (w/ i and j)
                 *   if index 0 equals 1 then update numFrequency */
                if (myArray[j] == myArray[i]) {
                    numFrequency++;
                }
                /**  if numFrequency is > mode then assign that to numFrequency
                 *   and get the value at that index */
                if (numFrequency > mode) {
                    mode = numFrequency;
                    mostFrequentElement = myArray[i];
                }
            }
        }
        System.out.println("The most frequent element from the new sorted array is: " + mostFrequentElement);
    }
}
public class myArray {
    public static void main(String[] args) {

        /** declare Scanner object */
        Scanner input = new Scanner (System.in);
        myArrayFunctions a = new myArrayFunctions ();

        /** ask user for array size */
        System.out.print("Enter size of array: ");
        int arraySize = input.nextInt ();

        /** create new array with user input size */
        int[] userArray = new int[arraySize];  // 6 size [0, 0, 0, 0, 0, 0]

        System.out.println("You're empty array based on your input is: " + Arrays.toString (userArray));

        /** fill in user array with user input */
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Please fill in the array with " + arraySize + " random numbers: ");
            userArray[i] = input.nextInt ();
        }

        /** display to user unsorted user created array */
        System.out.println("You're array is: " + Arrays.toString (userArray));

        /** display to user min, max and frequent element from sorted user array */
        a.sortArray ( userArray , arraySize);
        a.mostFrequency( userArray, arraySize);
    }
}
