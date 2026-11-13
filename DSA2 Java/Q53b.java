//wap to find minimum of two number.
public class Q53b {
    public static void main(String[] args) {
        int a = 23;
        int b = 27;
        Q53b ref = new Q53b();
        int min = ref.min(a, b);
        System.out.println(min+" is minimum number");

    }
    public int min(int a, int b){
        int minNum = a > b ? b:a;
        return(minNum);
    }
}
