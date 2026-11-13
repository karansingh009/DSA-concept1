public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First ");
        sb.append("number is the ");
        sb.append(43);
        sb.append(" number");
        System.out.println(sb);
    }
}
