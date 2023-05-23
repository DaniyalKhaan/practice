import java.util.Scanner;

public class LoopCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the operator (+, -, *, /, q to quit): ");
            String operator = input.next();

            if (operator.equals("q")) {
                running = false;
                continue;
            }

            double result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("Invalid operator!");
                continue;
            }
            System.out.println("The result is: " + result);
        }
        System.out.println("Thank you for using the calculator!");
    }
}

    

