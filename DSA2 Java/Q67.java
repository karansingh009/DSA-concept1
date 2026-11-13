// Create a program using continue to print only even 
// numbers using continue for odd numbers.


public class Q67 {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++){
            if(i % 2 != 0){
                continue;
            }
            else{
                System.out.println("print "+i);
            }
        }
        
    }
}
