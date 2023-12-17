import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter student ID: ");
            int studentID = scanner.nextInt();

            Student student = new Student(studentName, studentID);

            System.out.print("Enter courses to enroll in (separated by commas): ");
            scanner.nextLine(); 
            String coursesInput = scanner.nextLine();
            String[] courses = coursesInput.split(", ");
            for (String course : courses) {
                student.enrollInCourse(course);
            }

            System.out.println("Course ID: 101,");
            System.out.println("Course Name: Statistika Industri");
            System.out.println("- Student: Haris");
            System.out.println("- Student: Metta");

            System.out.println("Course ID: 102,");
            System.out.println("Course Name: Desain Jaringan Komputer");
            System.out.println("- Student: Windy");
            System.out.println("- Student: Amilia");

            System.out.println(student.getUserDetails());

            Teacher teacher = new Teacher("Pak Yoga Raditya", 101, "Statistika Industri");
            teacher.teachClass();
            

            Admin admin = new Admin("Hudza", 102);
            admin.manageSystem("university system");
            

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for student ID.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}