// Create a program using break to read inputs from the user in a 
// loop and break the loop if a specific keyword
//  (like "exit") is entered.

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter keyword: ");
            String keyword = input.next();
            if(keyword.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("keyword is found, succefully exited");
        
    }
}
