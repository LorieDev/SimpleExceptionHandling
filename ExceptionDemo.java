import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Loop until valid input is provided and division can be performed
        while (true) {
            try {
                // Prompt the user to enter the first number
                System.out.print("Enter your first number: ");
                int x = scanner.nextInt();

                // Prompt the user to enter the second number
                System.out.print("Enter your second number: ");
                int y = scanner.nextInt();

                // Perform the division
                int z = x / y;

                // Display the result
                System.out.println("Result is: " + z);

                // Exit the loop after successful calculation
                break;
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Now you cannot divide by 0.");
            } catch (InputMismatchException e) {
                // Handle invalid input (letters instead of numbers)
                System.out.println("Please enter numbers, not letters.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            } catch (Exception e) {
                // Handle any other unexpected exceptions
                System.out.println("You have an error: " + e.getMessage());
            }
        }

        // Close the scanner after use
        scanner.close();
    }
}
