// Simulate a dice roll using Math.random() and display the outcome
// (1 to 6).
public class Q73 {
    public static void main(String[] args) {
        // long dice = (long)(Math.random() * 6) + 1;
        double dice = Math.random() * 6;
        int pos = (int)Math.ceil(dice);
        System.out.println(pos);
        
    }
}
