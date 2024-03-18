package Homework4;

import java.util.Scanner;

import java.util.function.DoubleFunction;

public class HWv4 {

    public static void main(String[] args) {
        hwV4P1();

        hwV4P2();

        int N = 21;
        printNumberstillN(N);

        System.out.println("\n----------------------------");

        notDividableby3and7(N);

        System.out.println("\n----------------------------");

        sumTillInputFibonacci();


    }
public static void hwV4P1() {

        int[] array20 = new int[20];

        for (int i = 0; i < array20.length; i++) {

            array20[i] = i * 5;

        }
        for (int i = 0; i < array20.length; i++) {

            System.out.printf("Element in position %d multiplied by 5 equals %d \n",i,array20[i]);

        }
    System.out.println("-------------------------------");

    }

    public static void hwV4P2 () {

        int[] findAverage = new int[] {4,7,5,33,25,64,73,53,23};

        int totalSum = 0;

        int evenSum = 0;

        int oddSum = 0;

        for (int i = 0; i < findAverage.length; i++){

            totalSum += findAverage[i];
        }
        double arrayAverage = totalSum / (double) findAverage.length ;

        System.out.printf("The average amount of the array equals %.2f.\n", arrayAverage);

        System.out.println("--------------------------------");

        for (int b : findAverage) {

            if (b % 2 == 0) {
                evenSum += b;
            }

        else {
            oddSum += b;
            }
        }
        System.out.printf("Sum of even numbers is equal to %d\n",evenSum);

        System.out.printf("Sum of odd numbers is equal to %d\n",oddSum);

        System.out.println("-----------------------------");
    }

    public static void printNumberstillN(int N) {

        for (int i = 1 ; i <= N ; i++) {

            System.out.println(i);
        }
    }

    public static void notDividableby3and7(int N) {

        for (int i = 1; i <= N ; i++) {

            if (i % 3 != 0 && i % 7 != 0) {

                System.out.println(i);
            }
        }
    }


    public static void sumTillInputFibonacci() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter Fibonacci's sequence lenght:");

        int n = userInput.nextInt();

        int firstFib = 0;

        int secondFib = 1;

        int sumTotal = 0;

        for (int i = 0; i < n; i++) {

            sumTotal +=firstFib;

            int nextFib = firstFib + secondFib;

            firstFib = secondFib;

            secondFib = nextFib;
        }

        System.out.printf("Sum of the numbers until %d from Fibonacci's sequence is equal to: %d", n, sumTotal);


    }
}
