public class Array03 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 20;
        arr[0][1] = 13;
        arr[0][2] = 23;
        arr[1][0] = 14;
        arr[1][1] = 43;
        arr[1][2] = 32;
        arr[2][0] = 52;
        arr[2][1] = 19;
        arr[2][2] = 29;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){  // 0 < 3
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }


    }
    
}
