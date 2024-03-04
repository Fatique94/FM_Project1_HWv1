import java.util.Scanner; // Used as user input is expected

public class HWv2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner object

        String exp1org = "It's a wonderful day today, isn't that right Human?"; // Main String

        System.out.println(exp1org); // Showing the original message

        System.out.println("\nApologies, you humans have names, what's your name?"); // Asking for user input

        String firstName = scanner.nextLine(); // Read name of user from console (expecting input)

        String exp1repl = exp1org.replaceAll("Human", firstName); // Replacing Human with the user's input

        System.out.println(exp1repl); // Pringting the result of the replacement

        System.out.println("-----------------------------"); // Divider

        System.out.println("Lets try to compare two words or phrases, !\nFor starters enter a phrase or a word "); // Asks for user input

        String inputOne = scanner.nextLine(); // Asks for first user input

        System.out.println("Time for you to enter another phrase or word"); // Asks for a second user input

        String inputTwo = scanner.nextLine(); // Asks for the second user input

        boolean equalsi1i2 = inputOne.equalsIgnoreCase(inputTwo); // creates a variable to check equality

        System.out.println("The phrases and/or words you entered are the same: " + equalsi1i2); // Prints results after check

        int wordsCounter = inputOne.split("\\s").length; // Counts the amount of words in the user's first input

        System.out.println("The number of words in the first input is: " + wordsCounter); // Prints count result

        int wordsCounter2 = inputTwo.split("\\s").length; // Counts the amount of words in the user's second input

        System.out.println("The number of words in the second input is: " + wordsCounter2); // Prints count result

        String inputOnePlusTwo = inputOne + " = your first input and the second was = " + inputTwo; // Combining the two input strings into 1

        System.out.println(inputOnePlusTwo); // Prints the newly formed string

        System.out.println("\n Thanks for checking my homework, I hope I didn't mess up big time"); // Greetings to Ibro
    }

}