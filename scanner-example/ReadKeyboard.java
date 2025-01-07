import java.util.Scanner; // Importing the Scanner class to read input from the keyboard

// This program demonstrates reading various types of input using the Scanner class
public class ReadKeyboard {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Variables for arithmetic operation
        int a, b, c;

        // Reading two integers and calculating their sum
        System.out.println("Enter first number: ");
        a = scanner.nextInt(); // Reads an integer from the user
        System.out.println("Enter second number: ");
        b = scanner.nextInt(); // Reads another integer
        c = a + b; // Calculates the sum
        System.out.println("The sum of two numbers is: " + c);

        // Demonstrating other Scanner methods
        System.out.println("\nDemonstrating other Scanner methods:");

        System.out.println("Enter a string: ");
        String str = scanner.next(); // Reads a single word
        System.out.println("You entered: " + str);

        System.out.println("Enter a line of text: ");
        scanner.nextLine(); // Consumes the leftover newline
        String line = scanner.nextLine(); // Reads an entire line
        System.out.println("You entered: " + line);

        System.out.println("Enter a floating-point number: ");
        float f = scanner.nextFloat(); // Reads a float
        System.out.println("You entered: " + f);

        System.out.println("Enter a double-precision number: ");
        double d = scanner.nextDouble(); // Reads a double
        System.out.println("You entered: " + d);

        System.out.println("Enter a boolean value (true/false): ");
        boolean bool = scanner.nextBoolean(); // Reads a boolean
        System.out.println("You entered: " + bool);

        System.out.println("Enter a long number: ");
        long l = scanner.nextLong(); // Reads a long
        System.out.println("You entered: " + l);

        System.out.println("Enter a short number: ");
        short s = scanner.nextShort(); // Reads a short
        System.out.println("You entered: " + s);

        System.out.println("Enter a byte number: ");
        byte by = scanner.nextByte(); // Reads a byte
        System.out.println("You entered: " + by);

        // Closing the scanner
        scanner.close(); // Always close the scanner after use to release resources
    }
}
