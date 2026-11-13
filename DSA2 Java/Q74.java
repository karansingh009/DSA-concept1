// Create a number guessing game where the program selects a
// random number, and the user has to guess it.

import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter guess");
        int guessNumber = input.nextInt();
        System.out.println("your guess Number is: "+guessNumber);
        Q74 obj = new Q74();
        System.out.println("program select number: "+obj.random1());
    }
    double random1(){
        long num = (long)(Math.random() * 50);
        return num;
    }
}
