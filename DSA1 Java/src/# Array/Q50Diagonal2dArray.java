// Create a program to find the sum of two 
// diagonal elements.

class Q50Diagonal2dArray {
    public static void main(String[] args) {
        int[][] num = {{1,2,3}, {4,5,6}, {7,8,9}};
        // int sumDiagonal = sumDiagonal(num);
        // System.out.println(sumDiagonal);
        int sumDiagonal = sumOfTwoDiagnols(num);
        System.out.println("Diagonal Sum: "+ sumDiagonal);
    }
    public static int sumOfTwoDiagnols(int[][] num){
        int sumLeftDiagonal = sumLeftDiagonal(num);
        int sumRightDiagonal = sumRightDiagonal(num);
        int sumTwoDiagnols = sumLeftDiagonal + sumRightDiagonal;
        if(num.length % 2 != 0){
            int ind = num.length / 2;
            sumTwoDiagnols = sumTwoDiagnols - num[ind][ind];
        }
        return sumTwoDiagnols;
        
    }
    public static int sumLeftDiagonal(int[][] num){
        int sum = 0;
        int i = 0;
        while (i < num.length) {
            sum = sum + num[i][i];
            i++;
        }
        return sum;
    }
    public static int sumRightDiagonal(int[][] num){
        int sum = 0;
        int i = 0;
        while(i < num.length){
            int j = num.length - 1 - i;
            sum = sum + num[i][j];  // i++ , j--
            i++;
        }
        return sum;
    }

}
