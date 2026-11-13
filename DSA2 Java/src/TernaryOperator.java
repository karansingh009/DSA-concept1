import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int greaternumber;
        // if(num1 > num2){
        //     greaternumber = num1;
        // }
        // else{
        //     greaternumber = num2;
        // }
        greaternumber = num1 > num2 ? num1 : num2; // if condition is true than we pick num1 value else num2.
        System.out.println(greaternumber+" is greatest number");
        input.close();

    }
}
