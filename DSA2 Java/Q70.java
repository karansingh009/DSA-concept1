//  Define a Student class with fields like name and age, and use
// toString to print student details.
public class Q70 {
    String name;
    int age;
    Q70(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "StudentDetail { name: "+name+
                ", age: "+age+ " }";
    }

    public static void main(String[] args) {
        Q70 studentDetails = new Q70("Karan", 23);
        System.out.println(studentDetails);
    }
}
