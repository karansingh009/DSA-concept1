// Create a program to check if the given array is sorted.
public class q43 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean increasing = increasingOrder(numArr);
        boolean decreasing = decreasingOrder(numArr);
        if(increasing || decreasing){
            System.out.println("It is an sorted array");
        }
        else{
            System.out.println("Unsorted array");
        }
    }
    public static boolean increasingOrder(int[] numArr){
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] >= numArr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasingOrder(int[] numArr){
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] <= numArr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
