// Create a program to check is the array
//  is palindrome or not
public class q46 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean palindrome =palindrome(numArr); 
        if(palindrome){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
    }
    public static boolean palindrome(int[] numArr){
        int i = 0, j = numArr.length-1;
        while(i < j){
            if(numArr[i] != numArr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
