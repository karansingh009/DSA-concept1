// Create a program to reverse an array.

public class q45{
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray(); 
        reverseArray(numArr);
        ArrayUtility.displayArray(numArr);
    }
    public static void reverseArray(int[] numArr){
        int i = 0, j = numArr.length-1;
        while(i < j){
            int t = numArr[i];
            numArr[i] = numArr[j];
            numArr[j] = t;
            i++;
            j--; 
        }
    }
}