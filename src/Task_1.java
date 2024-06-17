import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and read Student ID (integer)
        System.out.println("Enter Student ID:");
        int studentId = scanner.nextInt();
        
        // Consume the leftover newline character
        scanner.nextLine();
        
        // Prompt and read Student Name (String)
        System.out.println("Enter Student Name:");
        String studentName = scanner.nextLine();
        
        // Prompt and read Student Age (integer)
        System.out.println("Enter Student Age:");
        int studentAge = scanner.nextInt();
        
        // Prompt and read Student GPA (double)
        System.out.println("Enter Student GPA:");
        double studentGPA = scanner.nextDouble();
        
        // Print the Student Details
        System.out.println("Student Details:");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        
        // Close the scanner
        scanner.close();
    }
}
