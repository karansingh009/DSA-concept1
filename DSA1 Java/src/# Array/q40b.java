// Create a program to find the sum and average of all 
// elements in an array. - same question in this array
//  utility file for effectiveness.

public class q40b {
    public static void main(String[] args) {
        int[] arr001 = ArrayUtility.inputArray();
        long sum = sum(arr001);
        System.out.println("sum: "+sum);
        double avg = average(arr001);
        System.out.println("avg "+avg);
    }
    public static int sum(int[] arr001){
        int s = 0;
        int i = 0; 
        while(i < arr001.length){
            s = s + arr001[i];
            i++;
        }
        return s;
    }
    public static double average(int[] arr001){
        int totalSum = sum(arr001);
        double average = (double)totalSum / arr001.length; 
        return average;
    }
}
