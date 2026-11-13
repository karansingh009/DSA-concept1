public class StringFormat {

    public static void main(String[] args) {
        String name = "Karan";
        long age = 1212;
        // System.out.println("Hi "+name+" you age is "+age); //4 stings are used in this
        System.out.printf("Hi %-10S, your age is %,010d year", name, age);
        // it is used to not concatenate multiple strings.
    }
}
