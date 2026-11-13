// Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book
// instances.
// • Instance methods: borrowBook(), returnBook().
// • Static method: getTotalBooks(), to get the total number of books in the
// library.

class q51{ // q51 is a class of book
    static int totalBooks;

    String title;
    String author;
    String uniqueId;

    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    q51(String uniqueId, String title, String author){
        this.uniqueId = uniqueId;
        this.title = title;
        this.author = author;
    
    }
    q51(String uniqueId){
        this(uniqueId, "Unknown", "Unknown");
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("enjoy book");
        }
    }
    public void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Thank you, please give review");

        }
        else{
            System.out.println("Book is already in library");
        }
    }
    public static void main(String[] args) {
        q51 whyToKnow = new q51("A12", "Pmc",  "Author");
        q51 establish = new q51( "A13");
        q51 decentral = new q51("A13");
        establish.borrowBook();
        whyToKnow.borrowBook(); 
        System.out.println(q51.getTotalBooks());
        establish.returnBook();
        whyToKnow.returnBook();
        decentral.returnBook();
    }  
}