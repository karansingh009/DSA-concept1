// Create a program using continue to sum all positive
//  numbers entered by theuser; skip any negative numbers.

public class Q66 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int sum = 0;
        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum = sum + num;
        }
        System.out.println("sum of all inetgers are: "+sum);
    }
}
