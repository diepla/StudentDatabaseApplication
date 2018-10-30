import java.util.Scanner;

public class Student {

    /** Create variable for student **/
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static final int COST_OF_COURSE = 600;
    private static int ID = 1000;

    /** Constructor --> prompt user to enter name and year of the student **/
    public Student(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n 4 - Senior\n" +
                "Enter student class level: ");
        this.gradeYear = scan.nextInt();

        setStudentID();

        System.out.println("Student Name: " + this.firstName +  ", " + this.lastName + "\nGrade Level: " + this.gradeYear
        + "\nStudent ID: " + this.studentID);
    }

    /** Generate an ID **/
    private String setStudentID(){
        ID++; // when new student added, the amount of student increases

        //Grade level + ID
        studentID = this.gradeYear + "" + ID;
        return studentID;
    }

    /** Enroll student into courses **/
    public void enroll(){

        do {
            System.out.println("Enter course to enroll: ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n\t" + course;
                tuitionBalance += COST_OF_COURSE;
            }else{
                break;
            }

        }while(1 != 0); // means to run it forever

        System.out.println("ENROLLED IN: " + this.courses);
        System.out.println("TUITION BALANCE: " + this.tuitionBalance);
    }

    /** View balance **/
    public void viewTuitionBalance(){
        System.out.println("Your tuition balance is: $" + this.tuitionBalance);
    }

    /** Pay tuition **/
    public void payTuition(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount that you like to pay: ");
        int payment = scan.nextInt();
        tuitionBalance -= payment;
        System.out.println("You have paid $" + payment);
        viewTuitionBalance();
    }

    /** Show status **/
    public String toString(){
        return "\nName: " + this.firstName + " " + this.lastName
                + "\nGrade Level: " + this.gradeYear
                + "\nStudent ID: " + this.studentID
                + "\nCourses Enrolled: " + this.courses
                + "\nBalance: $" + this.tuitionBalance;
    }
}
