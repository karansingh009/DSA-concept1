// Create a program to find the sum and average of all elements
//  in an array.

public class q40a {
    public static void main(String[] args) {
        int[] arr1 = {3,5,7,4,9};
        long sum = sum(arr1);
        System.out.println("sum: "+sum);
        double avg = average(arr1);
        System.out.println("avg "+avg);
    }
    public static int sum(int[] arr1){
        int s = 0;
        int i = 0; 
        while(i < arr1.length){
            s = s + arr1[i];
            i++;
        }
        return s;
    }
    public static double average(int[] arr1){
        int totalSum = sum(arr1);
        double average = (double)totalSum / arr1.length; 
        return average;
    }
}
