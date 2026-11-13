// wap to print 1 to n and skip numbers divisible by either 3 or 5

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 || i % 5 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
