// Create a program to  print the month of the year  based on a
//  number(1 to 12) input by a user

import java.util.Scanner;

public class q57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number");
        int num = input.nextInt();
        switch(num){
            case 1 : 
                System.out.println("January");
                break;
            case 2 : 
                System.out.println("February");
                break;
            case 3 : 
                System.out.println("March");
                break;
            case 4 : 
                System.out.println("April");
                break;
            case 5 : 
                System.out.println("May");
                break;
            case 6 : 
                System.out.println("June");
                break;
            case 7 : 
                System.out.println("July");
                break;
            case 8 : 
                System.out.println("August");
                break;
            case 9 : 
                System.out.println("September");
                break;
            case 10 : 
                System.out.println("October");
                break;
            case 11 : 
                System.out.println("November");
                break;
            case 12 : 
                System.out.println("December");
                break;
            default : 
                System.out.println("Invalid month");
                break;
        }
        input.close();
    }
}
