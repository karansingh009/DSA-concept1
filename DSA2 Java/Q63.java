// Create a program using for-each to find the maximum value in 
// an integer array.
public class Q63 {
    public static void main(String[] args) {
        int[] arr = {7,8,2,3,1};
        int max = 0;
        for(int i = 0; max < arr[i]; i++){
            max = arr[i];
        }
        System.out.println("Maximum value in array is: "+max);
    }
}
