//Write a program to generate the Fibonacci sequence up to 100.

import java.math.BigInteger;

public class IteraptiveFibonacci {
    public static void iteraptiveFibonacci(int n){
        if (n<=1){
            return;
        }
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;//since the target number "100' will basically exceed the java integer overflow we use the BigInterger

        System.out.println("1. "+a+" ");     //print the fast number of the sequence

        for (int i = 1; i < n; i++){          //The loop start from 1 because we already printed zero

               System.out.print((i+=1)+".");   //this basically is just a counter to help you see in the console how many fibonnacci numbers we
                                               //printed, the value is equivalent to the value of n that is passed in the main method

            System.out.println(" "+b+" ");   //print the fast value of b i.e. 1

            BigInteger sum = a.add(b);      //sum the fast values of the fibonacci
            a = b;                          //shift the value of 'a' to the next value which is "b"
            b = sum;                        //now b becomes the value of the sum of the last value of 'a' and the previou value of b
        }

    }

    public static void main(String[] args) {
   int n = 100;
   iteraptiveFibonacci(n);
    }
}
