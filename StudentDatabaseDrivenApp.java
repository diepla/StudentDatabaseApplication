import java.util.Scanner;

public class StudentDatabaseDrivenApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user how many new students we need to add
        System.out.println("Enter number of new students to enroll: ");
        int num = scan.nextInt();

        Student[] students = new Student[num];

        // Create n number of new students
        for(int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        // Print out the info of all students
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }

    }
}
