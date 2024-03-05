import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("exit")) {
            try {
                System.out.println("Enter any number to see its reverse (or type 'exit' to quit):");
                input = scanner.next();
                if (!input.equalsIgnoreCase("exit")) {
                    int number = Integer.parseInt(input); // Convert the input string to an integer
                    System.out.println("The reverse of " + number + " is " + reverseDigits(number));
                }
            } catch (NumberFormatException ex) { // Catch incorrect number format
                System.out.println("Please enter a valid number or type 'exit'");
            }
        }

        System.out.println("Program exited successfully.");
    }

    public static int reverseDigits(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = number * -1; // Make the number positive for processing
        }

        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }

        return isNegative ? reversed * -1 : reversed;
    }
}
