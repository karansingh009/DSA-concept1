// Create a program to return a new array deleting
//  a specific element.
 
import java.util.Scanner;

public class q44 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();   
        Scanner input = new Scanner(System.in);
        System.out.println("Which number you want to delete: ");
        int numtodelete = input.nextInt();
        int[] newArr = newArray(numArr, numtodelete);
        System.out.println("here is your newArr");
        ArrayUtility.displayArray(newArr);
        input.close();
    }
    public static int[] newArray(int[] numArr,
         int numtodelete){
        int numOccurences = q41.numOccurences(numArr, numtodelete);
        if(numOccurences == 0){  // number does not exist
            return numArr;
        }
        int newsize = numArr.length - numOccurences;
        int[] newArray = new int[newsize];
        int i =0, j =0;
        while(i < numArr.length){
            if(numArr[i] != numtodelete){  //important part 
                newArray[j] = numArr[i];
                j++;
            }
            i++;
            
        }
        return newArray;
    }
}
