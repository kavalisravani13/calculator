import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers:");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        // Prompt the user to enter an operator
        System.out.println("Enter an operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return; // Exit the program
        }

        scanner.close(); // Close the scanner object
    }
}
