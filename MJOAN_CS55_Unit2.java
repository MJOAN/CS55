 /* import Scanner and Decimal classes */
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
 /*
 * Course: CS55 Java Programming
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print out customer invoice for concert ticket purchase
 * Next Iteration: Use a Try/Catch {} with InputMismatchException for incorrect user input
 * */
 
 class ConcertTickets {
     public static void main(String[] args) {
 
         /* allow for two decimal formatting on invoice */
         DecimalFormat dfTwo = new DecimalFormat("0.00");
 
         /* declare integer constants for ticket type */
         int PREMIUM_TICKET_COST = 80;
         int REGULAR_TICKET_COST = 40;
         double SALES_TAX = 0.0925;
 
         /* declare Scanner class object */
         Scanner input = new Scanner(System.in);
 
         /* ask user for number tickets per type and declare integer variables */
         System.out.print("How many premium tickets would you like to purchase? ");
         int userRequestPremium = input.nextInt();
         System.out.print("How many regular tickets would you like to purchase? ");
         int userRequestRegular = input.nextInt();
 
         /* calculate customer cost per number of ticket types */
         double totalPremiumCost = PREMIUM_TICKET_COST * userRequestPremium;
         double totalRegularCost = REGULAR_TICKET_COST * userRequestRegular;
         double totalSalesTax = (totalPremiumCost + totalRegularCost) * SALES_TAX;
         double totalAmountForOrder = totalSalesTax + totalPremiumCost+ totalRegularCost;
 
         /* print prompt on console verifying number of tickets per type */
         System.out.println("Premium Tickets ($" + PREMIUM_TICKET_COST + "): " + userRequestPremium);
         System.out.println("Regular Tickets ($" + REGULAR_TICKET_COST + "): " + userRequestRegular);
 
         /* print results in an invoice format to the user */
         System.out.println("Invoice:");
         System.out.println("Premium: $ " + PREMIUM_TICKET_COST + " x " + userRequestPremium + " = $ " + dfTwo.format(totalPremiumCost));
         System.out.println("Regular: $ " + REGULAR_TICKET_COST + " x " + userRequestRegular + " = $ " + dfTwo.format(totalRegularCost));
         System.out.println("Sales Tax:  9.25% = $ " + dfTwo.format(totalSalesTax));
         System.out.println("Total Price:        $ " + dfTwo.format(totalAmountForOrder));
         System.out.println("Thank you for your order!");
 
     }
 }