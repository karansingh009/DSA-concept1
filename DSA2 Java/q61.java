//  Create a program using for loop multiplication table for a number

import java.util.Scanner;

public class q61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(num+ " *"+i +" ="+ num*i);
        }
        input.close();
        
    }
}