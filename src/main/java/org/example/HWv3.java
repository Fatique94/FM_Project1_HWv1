package org.example;

import java.util.Scanner; // What is a homework without the good ol' scanner import
public class HWv3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object

        System.out.println("Please enter 3 numbers out of which we'll try to figure out the largest one");
        // asks for 3 number inputs

        int v1 = scanner.nextInt(), v2 = scanner.nextInt() , v3 = scanner.nextInt();
        // Expects 3 inputs

        if (v1 >= v2 && v1 >= v3)
            // Checks if first input is larger/equal than/to the second AND larger/equal than/to the 3rd
            System.out.println(v1 + " is the largest number.");
        // If that statement is true prints V1
        else if (v2 >= v1 && v2 >= v3)
            // Checks if second input is larger/equal than/to the first AND larger/equal than/to the 3rd
            System.out.println(v2 + " is the largest number."); // If that statement is true prints V2
        else
            System.out.println(v3 + " is the largest number."); // If the statements above are both false prints V3

        System.out.println("\n----------------------------------------------------\n"); // Time for a break

        System.out.println("How about we try to find out a triangle's area!\n" +
                "Please input the base and height of the triangle ");
        // Asks for triangle's Base and Height to be input
        double triBase = scanner.nextDouble() , triHeight = scanner.nextDouble();

        double triArea = (triBase*triHeight)/2; // Calculates triangle's Area

        System.out.println("The area of the triangle is = " +triArea); // Prints result

        double triHypotenuse = Math.pow(Math.pow(triBase, 2) + Math.pow(triHeight, 2), 0.5);
        // Calculate the hypotenuse using Pythagorean theorem - I admit I found about math.pow thanks to Google

        double triPerimeter = triBase + triHeight + triHypotenuse; // Calculates triangle's Perimeter

        System.out.println("The perimeter of the triangle is = " +triPerimeter); // Prints Result

        System.out.println("\n----------------------------------------------------\n"); // Time for a break again

        System.out.println("Now let's find out whether a number you enter is even or odd!\n" +
                "Please enter the number you'd like to put to the test "); // Asks for a number to check even/odd

        int checkNumEorO = scanner.nextInt(); // Waits for user input

        if (checkNumEorO % 2 == 0) // Checks if integer division by 2 is equal to 0
            System.out.println("The number " + checkNumEorO + " is even."); // The result is 0 hence number is Even
        else
            System.out.println("The number " + checkNumEorO + " is odd."); // The result is not 0 hence number is Odd

        System.out.println("\n----------------------------------------------------\n"); // Yet another break

        System.out.println("Now let's find out which day of the week it is based on your number selection.\n" +
                "Please select a number"); //Prints message asking for number
        int dayoftheWeek = scanner.nextInt(); // expects input
         switch (dayoftheWeek) {  //Switch function using different case scenarios

             case 1: // In case where the input is 1 etc..
                 System.out.println("The day of the week you selected is Monday");
                 // Prints this message if input is equal to 1
                 break; // Doesn't carry on if case condition met.

             case 2:
                 System.out.println("The day of the week you selected is Tuesday");
                 break;

             case 3:
                 System.out.println("The day of the week you selected is Wednesday");
                 break;

             case 4:
                 System.out.println("The day of the week you selected is Thursday");
                 break;

             case 5:
                 System.out.println("The day of the week you selected is Friday");
                 break;

             case 6:
                 System.out.println("The day of the week you selected is Saturday");
                 break;

             case 7:
                 System.out.println("The day of the week you selected is Sunday");
                 break;

             default: // Sets default value when no case conditions are met
                 System.out.println("Incorrect input! Please enter a number from 1 to 7!");
                 break;
                 // Prints message with condition
         }

        }


    }


