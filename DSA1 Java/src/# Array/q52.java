//  Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any
// course.
// • Instance methods: enrollStudent(String studentName),
// unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum
// capacity for courses.

public class q52 {
    static int maxCapacity = 100;

    String courseName;
    int enrollements;

    q52(String courseName){
        this.courseName = courseName;
        this.enrollements = 0;
    }

    String[] enrolledStudents = new String[maxCapacity];
 
    static void setMaxCapacity(int maxCapacity){
        q52.maxCapacity = maxCapacity;
    }
    
    void enrolledStudents(String studentName){
         enrolledStudents[enrollements] = studentName;
        enrollements++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollements--;

    }
}
