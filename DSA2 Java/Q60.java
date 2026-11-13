//Create a program using do-while to implement a number 
// guessing game.
import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        long actualNum = 12;
        do{
            System.out.println("Gues a number between 0 and 100: ");
            num = input.nextInt();
        }while(num != actualNum);
        System.out.println("your guess is correct");
        input.close(); 
    }
}
