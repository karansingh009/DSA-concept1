//wap to calculate  the absolute value of a given number.

import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num: ");
        double num = input.nextDouble();   // double is used for both integere and float value 
        double abslt = num >= 0 ? num : -num;
        System.out.println(abslt);
        input.close();

    }
}
