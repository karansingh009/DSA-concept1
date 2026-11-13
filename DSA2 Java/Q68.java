// Create a program using recursion to display the Fibonacci
//  series upto a certain number

import java.util.Scanner;

public class Q68{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fibonacci series");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(fibonacci(i)+" ");
            input.close();
        }
    }
    public static int fibonacci(int i){
        if(i == 1){
            return 0;
        }
        if(i == 2){
            return 1;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
}


