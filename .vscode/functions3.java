import java.util.Scanner;       // Topic:Finding a Factorial of a number.
public class functions3 {
    public static void findFactorial(int n){
        int factorial = 1;
        if (n <0){
            System.out.println("Invalid number");
            return;

        }
        for( int i = n; i>=1; i-- ){
            factorial = factorial * i;
            
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String [] args){
        System.out.println("Write the number to find factorial");
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        findFactorial(n);
        SC.close();
    }
}