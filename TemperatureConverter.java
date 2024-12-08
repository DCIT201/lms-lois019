import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;

        // Validate user choice
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Valid choice
                }
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        double temperature = 0;

        // Validate temperature input
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; // Valid input
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid temperature. Please enter a numeric value.");
        }

        // Perform conversion
        if (choice == 1) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("The converted temperature is %.2f°F.\n", fahrenheit);
        } else {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("The converted temperature is %.2f°C.\n", celsius);
        }

        // Close scanner
        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
