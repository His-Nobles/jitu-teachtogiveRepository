//Write a program that accepts a string as input, capitalizes the first letter of each word in the
//string, and then returns the result string.
//Examples:
//"hi"=> returns "Hi"
//"i love programming"=> returns "I Love Programming"

import java.util.Scanner;

public class capitalizedWords {
    public static String senteceInCapital(String str) {
        String[] words = str.split("\\s");  //splits the String into words using space as delimeter

        StringBuilder capital = new StringBuilder(); //String builder will build the split words back to line

        for (String word :
                words) {
            if (!word.isEmpty()) {
                String capitallizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                capital.append(capitallizedWord).append(" "); //creates a aspace between the words
            }
        }

        return capital.toString().trim();    //Return the string after removing any trailing spaces
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        System.out.println(senteceInCapital(input));
    }
}