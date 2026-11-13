public class BreakAndContinue {
    public static void main(String[] args) {
        // for(int i = 1;i < 100; i++){
        //     if(i == 34){
        //         break; // loop se bhaar aana hai toh use karte hai
        //     }
        //     System.out.println(i);
        // }
        for(int i = 1;i < 10; i++){
            if(i == 4){
                continue; // agur ek hi iteration skip karni hai
                //  not whole iteration than we use
            }
            System.out.println(i);
        }
    }  //in while loop remember to do the increment manually before using continue
} 
