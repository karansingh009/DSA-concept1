// Calculate the area and circumference of a circle
//  for a given radius using Math.PI

public class Q72 {
    public static void main(String[] args) {
        int r = 5;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
        double circumference = 2 * Math.PI * r; 
        System.out.println(circumference);
        
    }
}
