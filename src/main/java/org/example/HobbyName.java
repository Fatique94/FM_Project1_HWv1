package org.example;
import java.util.Scanner; // I guess I must write this before using Scanner

public class HobbyName {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); // Scanner object
 System.out.println("Dear user, what's your name?"); // Asks for username
 String userName = scanner.nextLine(); // Reads input from keyboard
System.out.println("Pleased to meet you!"); // Prints greetings
System.out.println("What is your favourite hobby " +userName); // Asks for hobby
String hobby = scanner.nextLine(); // Reads input from keyboard
System.out.println("Must be fun to " +hobby); // Prints hobby comment
    }
}
