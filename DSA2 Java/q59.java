// Create a program using do-while to find password 
// checker until a valid password is entered.

import java.util.Scanner;

public class q59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter a number: ");
            password = input.next();
        }while(!isValidPassword(password)); 
        System.out.println("your password is correct");
        input.close();  
    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
