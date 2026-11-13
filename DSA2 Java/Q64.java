// Create a program using for-each to the occurrences of a 
// specific element in an array.

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        int[] arr1 =ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter occurrences of a number: ");
        int num = input.nextInt();
        occurences(arr1, num);
        input.close();
    }
    public static void occurences(int[] arr1, int num){
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == num){
                count++;
            }
        }
        System.out.println("Number of occurrences are: "+count);
        
    }
}
