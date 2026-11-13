// Create a program to find number of occurrences of an 
// element in an array.

import java.util.Scanner;

public class q41 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you have to check: ");
        int num = input.nextInt();
        int numOccurences = numOccurences(numArr, num);
        System.out.println("Occurence of a number is : "+numOccurences);
        input.close();
    }
    public static int numOccurences(int[] numArr, int num){
        int count = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                count += 1;
            }
            i++;
        }
        return count;

    }
}
