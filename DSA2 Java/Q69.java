// Create a program using recursion to check if a string is a 
// palindrome using recursion.

import java.util.Scanner;

public class Q69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = input.next().toLowerCase();
        System.out.println("your string is "+((palindrome(name) ? "palindrome" : "not palindrome")));
    }
    public static boolean palindrome(String name){
        if(name.length() <= 1){
            return true;
        }
        int last = name.length() - 1;
        if(name.charAt(0) != name.charAt(last)){
            return false;
        }
        String newString = name.substring(1, last);
        return palindrome(newString);
    }
}
