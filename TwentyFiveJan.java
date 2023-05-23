//The first calculator I wrote 
//using if else statements

import java.util.Scanner;   
class TwentyFiveJan {
public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println(" Enter the first number:");
    double firstNumber = a.nextDouble();
    System.out.println(" Enter the second number:");
    double secondNumber = a.nextDouble();
    a.nextLine();
    System.out.println(" Enter the operation you want to perform: ");
    String operation = a.nextLine();
    if (operation.equals("+")) {
        System.out.println(firstNumber + secondNumber);
    } else if (operation.equals("-")){
        System.out.println(firstNumber - secondNumber);
    } else if (operation.equals("*")){
        System.out.println(firstNumber * secondNumber);
    } else if (operation.equals("/")) {
        if(secondNumber == 0 ) {
            System.out.println(" Division of a Number by 0 is not possible");
        }else {
                System.out.println(firstNumber / secondNumber);
             }
    }
    else {
        System.out.printf(" %s is not a supported opeartion", operation);
    }
    a.close();
}        
}
