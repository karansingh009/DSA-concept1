// Create a program to find the maximum and minimum
//  element in an array.

public class q42 {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        int maximum = maximum(numArr);
        int minimum = minimum(numArr);
        System.out.println("Maximum element is: "+maximum);
        System.out.println("Minimum element is: "+minimum);

    }
    public static int maximum(int[] numArr){
        int max = 0;
        int i = 0;
        while(i < numArr.length){
            if(max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] numArr){
        int min = numArr[0];
        int i = 0;
        while(i < numArr.length){
            if(min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

}
