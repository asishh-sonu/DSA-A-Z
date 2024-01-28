import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name;
        int rollNumber;
        double marks;
        char grade;

       
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter marks: ");
        marks = scanner.nextDouble();

        System.out.print("Enter grade: ");
        grade = scanner.next().charAt(0); 

       
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
