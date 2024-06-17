import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 == 1) { // Check if N is odd
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) { // Check if N is in the range 2 to 5
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) { // Check if N is in the range 6 to 20
                System.out.println("Weird");
            } else if (N > 20) { // Check if N is greater than 20
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
}
