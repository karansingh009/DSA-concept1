import java.util.Scanner;
public class Array02 {   //find number 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int[] arr = {2,4,3,6,44,22,1,23};
        boolean isfound = Found(arr, num);
        if(isfound){
            System.out.println("Your number is not found");
        }
        else{
            System.out.println("your number  found");
        }   
        input.close();

    }
    public static boolean Found(int[] arr,int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] != num){
                return false;
            }
            index++;
        }
        return true;

    }


    
}
