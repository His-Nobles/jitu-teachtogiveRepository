
//Write a program that counts the number of vowels in a sentence.
  //      eg " Hello World " => returns 2

import java.util.Scanner;

public class vowelsInWords {
    public static int countVowels(String string ){
       int count = 0;

       //first convert the string into lower case so the comparison is same case
        string = string.toLowerCase();

        //iterate through string chars
        for (int i = 0; i < string.length(); i++){
            char cha = string.charAt(i);

            //check if the character is a vowel
            if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u'){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to auto count vowels");
        String input = scanner.nextLine();
        System.out.println("we found "+word(input)+" Vowels in that sentence");
    }
    public static int word(String name){
int a = 0, e = 0, i = 0, o = 0, u = 0;
        char[] cha = name.toCharArray();
        for (int j = 0; j < name.length(); j++){
            if (cha[j]=='a'){
                a = 1;
            }
            if (cha[j]=='e'){
                e = 1;
            }
            if (cha[j]=='i'){
                i = 1;
            }
            if (cha[j]=='o'){
                o = 1;
            }
            if (cha[j]=='u'){
                u = 1;
            }
        }return a+e+i+o+u;
    }

}
