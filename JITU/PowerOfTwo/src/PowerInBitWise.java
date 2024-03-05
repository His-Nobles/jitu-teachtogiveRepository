//Write a program that takes an integer as input and returns true if the input is a power of two.
//Examples:
//8=> returns true
//6=> returns false

import java.util.Scanner;

public class PowerInBitWise {
    public static boolean checkPower(int n){
        if((n > 0) && ((n & (n-1))==0)){  //using bitwise method
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to test:");
        n = scanner.nextInt();           //receiving the number from user
        System.out.println(checkPower(n));

    }
}
