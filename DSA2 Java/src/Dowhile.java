import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = input.nextInt();
        // while(num < 0 || num > 100){
        //     System.out.println("Enter a number: ");
        // }
        // System.out.println("you number is: "+num);

        int num2;
        do{
            System.out.println("Enter number 2: ");
            num2 = input.nextInt();
        }
        while (num2 < 0 || num2 > 100); // atleast one iteration 
        // , the do while loop do.
        System.out.println("you number is: "+num2);
        input.close();
    }     
}
