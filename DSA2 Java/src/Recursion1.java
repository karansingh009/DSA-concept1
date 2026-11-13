public class Recursion1 {
    public static void main(String[] args) {
        int num = 5;
        Recursion1 obj = new Recursion1();
        int factorial = obj.factorial(num);
        System.out.println(factorial);
    }
    public int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
