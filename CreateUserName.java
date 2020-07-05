package com.company;
import java.util.Scanner;

/*
 * Course: CS55 Java Programming, Unit 3 Assignment
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print unique username + random int for user account
 * */

public class CreateUserName {

    public static void main(String[] args) {

        /* declare Scanner class object */
        Scanner input = new Scanner(System.in);

        /* ask user for first and last name */
        System.out.print("What is your first name? ");
        String FIRST_NAME = input.next();

        System.out.print("What is your last name? ");
        String LAST_NAME = input.next();

        /* prompt to ensure user's last name is at least 5 characters */
        if (LAST_NAME.length() <= 5) {
            System.out.print("You must enter a last name of at least 5 characters, " +
                    "please enter again: ");
            LAST_NAME = input.next();
        }

        /* get first letter of first name and first five letters of last name */
        String USER_NAME = FIRST_NAME.charAt(0) + LAST_NAME.substring(0, 6);

        /* get random number between 10 and 99 */
        int userNumber = 10 + (int)(Math.random() * 90);

        /* print prompt on console verifying created user name */
        System.out.println("Your username is: " + USER_NAME + userNumber);

    }
}
