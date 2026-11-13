//  Create a program to search an element in a 2-D array.

import java.util.Scanner;
public class q48{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that we have to search :");
        int num = input.nextInt();
        int[][] numArr = {{1,2,3},{4,5,6},{7,8,9}};
        boolean search = isSearch(numArr, num);
        if(search == true){
            System.out.println("Number is found");
        }
        
        else{
            System.out.println("Number is not found");
        }

    }
    public static boolean isSearch(int[][] numArr, int num) {
        int i = 0;
        while(i < numArr.length){
            int j = 0;
            while (j < numArr.length) {
                System.out.println(numArr[i][j]);
                if(num != numArr[i][j]){
                    return true;  //important concept.
                }
                j++;
            }
            i++;
        }
        return false; // important concept..
    }
}


