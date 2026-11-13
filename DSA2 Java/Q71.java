// Concatenate and Convert: Take two strings, concatenate them,
// and convert the result to uppercase.

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = input.next();
        System.out.println("Enter String2");
        String s2 = input.next();
        // String Concat = s1.concat(s2);
        String Concat = s1.concat(" ").concat(s2);
        System.out.println(Concat);
        System.out.println(Concat.toUpperCase());

    }
}
