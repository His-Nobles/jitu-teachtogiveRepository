//Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
//multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
//"FizzBuzz".

public class FizzBuzz {
    public static void fizzOrBuzz(int n){
        for (int i = 0; i <= n; i++){

            //first check for both 3 and 5

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

            //check for three

            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            //check for five

            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            //print the number not meeting the categories
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzOrBuzz(100);
    }
}
