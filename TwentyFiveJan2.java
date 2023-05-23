// I wrote a calculator using switch statements.
import java.util.Scanner;
class TwentyFiveJan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operation you want to perform. ");
        String operation = input.next();

        switch (operation) {
            case "+":
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
            break;
            case "-":
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
            break;

            case "*":
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
            break;

            case "/":
            if (num2 == 0) {
                System.out.println("Cannot divided by zero.");
            }
            else {
            System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                    
            } break;

            default :
            System.out.printf("%s in not a supported operation.", operation);
        }
        input.close();
    }
}