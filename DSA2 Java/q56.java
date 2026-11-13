// Create a program to based on a student score, categorize as high, moderate 
// and lower using the terneray operator (hs is more
//      than 80, moderate 50 to 80, low  for less than 50).

import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score");
        int num = input.nextInt();
        String score = num < 50 ? "Low" : (num < 80 ? "Moderate" : "High"); 
        System.out.println(score);
        input.close();


    }
}
