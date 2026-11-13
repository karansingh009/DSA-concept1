import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of element: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("ENTER AN ELEMENT: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
}
