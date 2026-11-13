// Create a program to create a simple calculator that uses a switch 
// statement to perform basic arithmetic operation. -- V.I.P question

import java.util.Scanner;

public class q58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = input.nextInt();
        System.out.println("Enter value of b");
        int b = input.nextInt();
        System.out.println("Enter operation ");
        String operation = input.next();
        int result = switch(operation){
            case "+" -> a + b;
            case "-" -> a - b;
            case "%" -> a % b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> -1;
            
        };
        System.out.println(result);
        input.close();

    }
}
