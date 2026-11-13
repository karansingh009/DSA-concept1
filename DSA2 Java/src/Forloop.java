public class Forloop {
    public static void main(String[] args) {
        String[] array = {"Ram", "mohan", "shyam", "Deepak"};
        // arrayTraverse(array);
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name : array){   //for each loop
            System.out.println(name); //often prefred for readability
            //padne ke liye asaan ho jaata hai
        }
    }
    // public static void arrayTraverse(String[] array){
    //     for(int i = 0; i < array.length; i++){ // simple for loop
    //         System.out.println(array[i]);
    //     }
    // }

}
