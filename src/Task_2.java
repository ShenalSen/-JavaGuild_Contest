import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner scanner = new Scanner(System.in);
        
        // Read integer from stdin
        int intValue = scanner.nextInt();
        
        // Read double from stdin
        double doubleValue = scanner.nextDouble();
        
        // Consume the leftover newline character from nextDouble()
        scanner.nextLine();
        
        // Read string from stdin
        String stringValue = scanner.nextLine();
        
        // Close the scanner (optional, but good practice)
        scanner.close();
        
        // Print the values in the specified format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
    }
}
