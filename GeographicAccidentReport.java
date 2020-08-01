import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Course: CS55 Java Programming, Unit 3 Assignment
 * Santa Monica College: Summer 2020
 * Student: Mariam Joan
 * Student ID: 1370114
 * Program Description: Print user number and sort for report feature
 * */

public class GeographicAccidentReport {
    public static void main (String[] args) {

        /* call num accidents which will return our HashMap variable */
        Map<String, Integer> regionMap = getNumberOfAccidents();

        /* find lowest will display our sorted accident report using the HashMap variable  */
        findLowest(regionMap);
    }

    public static Map<String, Integer> getNumberOfAccidents() {

        /* creating an ArrayList object for our regions */
        List<String> regionList = new ArrayList<String>();

        /* add 4 different values to list */
        regionList.add("north");
        regionList.add("south");
        regionList.add("east");
        regionList.add("west");
        regionList.add("central");

        /*  create scanner class object */
        Scanner input = new Scanner(System.in);

        /*  prompt the user for accident reports per region */
        /*  if condition to check for input below 1 re-prompt */
        System.out.print("Enter a accident total for the north region: ");
        int northTotal = input.nextInt();
        if (northTotal < 1) {
            System.out.println( "Please re-enter, all numbers must be a positive integer" );
            northTotal = input.nextInt();
        }

        System.out.print("Enter a accident total for the south region: ");
        int southTotal = input.nextInt();
        if (southTotal < 1) {
            System.out.println( "Please re-enter, all numbers must be a positive integer" );
            southTotal = input.nextInt();
        }

        System.out.print("Enter a accident total for the east region: ");
        int eastTotal = input.nextInt();
        if (eastTotal < 1) {
            System.out.println( "Please re-enter, all numbers must be a positive integer" );
            eastTotal = input.nextInt();
        }

        System.out.print("Enter a accident total for the west region: ");
        int westTotal = input.nextInt();
        if (westTotal < 1) {
            System.out.println( "Please re-enter, all numbers must be a positive integer" );
            westTotal = input.nextInt();
        }

        System.out.print("Enter a accident total for the central region: ");
        int centralTotal = input.nextInt();
        if (centralTotal < 1) {
            System.out.println( "Please re-enter, all numbers must be a positive integer" );
            centralTotal = input.nextInt();
        }

        /* creating a new Map object to map user input values to regions */
        Map<String, Integer> regionMap = new HashMap<String, Integer>();
        
        /* adding user input values to new map example: { region: corresponding value } */
        regionMap.put(regionList.get(0), northTotal);
        regionMap.put(regionList.get(1), southTotal);
        regionMap.put(regionList.get(2), eastTotal);
        regionMap.put(regionList.get(3), westTotal);
        regionMap.put(regionList.get(4), centralTotal);

        return regionMap;
    }

    public static void findLowest( Map<String, Integer> regionMap ) {
        /* TreeMap is a data structure that naturally sorts, follows Red Black Tree algorithm */
        TreeMap<String, Integer> sortedMapValues = new TreeMap<String, Integer>();

        /* putAll will copy the HashMap to our new TreeMap */
        sortedMapValues.putAll(regionMap);

        /* iterate over our TreeMap noting region and accident report number */
        for (Map.Entry<String, Integer> entry : sortedMapValues.entrySet()) {
            System.out.println("Accidents from: " + entry.getKey() + " reported: " + entry.getValue() + " accidents.");

        }





    }
}
