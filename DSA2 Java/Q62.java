//  Create a program using for to display if a number is prime or not.

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean primeNum = isPrime(num);
        if(primeNum){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        input.close();

    }
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
