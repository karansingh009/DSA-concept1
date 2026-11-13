// Create a program to merge two sorted arrays.


public class q47 {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5};
        int[] arr2 = {6,7};
        mergeArray(arr, arr2);
    }
    public static void mergeArray(int[] arr, int[] arr2){
        int[] c = new int[arr.length + arr2.length];
        int k = 0;

        int i = 0;
        while(i < arr.length){
            c[k] = arr[i];
            k++;
            i++;
        }

        int i1 = 0;
        while(i1 < arr2.length){
            c[k] = arr2[i1];
            k++;
            i1++;
        }

        int i3 = 0;
        while (i3 < c.length) {
            System.out.print(c[i3]+" ");
            i3++;
            
        }
        System.out.print("After merging two array: ");
    }
}
