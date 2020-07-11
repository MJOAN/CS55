 /* import Scanner and StringUtils class */
 import java.util.Scanner;

 /*
  * Course: CS55 Java Programming
  * Santa Monica College: Summer 2020
  * Student: Mariam Joan
  * Student ID: 1370114
  * Program Description: Print out numbers from user input 1 to N
  * */

 class PrintUserNumber {
     public static void main(String[] args) {

         /* declare StringBuilder class object */
         StringBuilder outputString = new StringBuilder("");

         /* declare Scanner class object */
         Scanner input = new Scanner(System.in);

         /* ask user for input and store input in variable N */
         System.out.println("Enter: " );
         int N = input.nextInt();

         /* if N is greater than 1 else exit */
         if (N > 1) {

             /* for loop using i from 1 to N */
             String finalOutput = null;
             for (int i = 1; i <= N; i++) {

                 /* if i is not divisible by 2 */
                 if (i % 2 != 0)

                     /* store output to StringBuilder object */
                     outputString.append(i).append(", ");

                 /* convert final output to string */
                 finalOutput = outputString.toString();
             }

             /* confirm string length > 0 */
             if (finalOutput.length() > 0) {

                 /* print final output without last comma */
                 System.out.println(finalOutput.substring(0, finalOutput.length() - 2));

             } else System.out.println("Goodbye!");
         }
     }
 }