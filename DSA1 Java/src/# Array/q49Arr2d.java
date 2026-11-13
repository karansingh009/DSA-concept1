// Create a program to do sum and average of all
//  elements in a 2-D array

class q49Arr2d{
    public static void main(String[] args){
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("sum of all elements: ");
        int sum = add(num);
        System.out.println(sum);
        double avg = (double)sum / 2;
        System.out.println("average of all elements: "+avg);

    }
    public static int add(int[][] num){
        int dev = 0;
        int i = 0;
        while(i < num.length){
            int j = 0;
            while (j < num.length) {
                int c = num[i][j];
                dev = dev + c;
                j++;
            }
            i++;
        }
        return dev;
    }

}
