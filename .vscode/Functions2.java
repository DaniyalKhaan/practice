// import java.util.Scanner;      Note: this is first method
// public class Functions2 {
// public static void calculateSum (int firstNum, int secondNum){
// System.out.println(firstNum + secondNum);
// return;
// }
// public static void main (String[] args){
//     System.out.println("write the first number");
//     Scanner Sc = new Scanner(System.in);
//     int firstNum = Sc.nextInt();
//     System.out.println("write the second number");
//     int secondNum = Sc.nextInt();
//     calculateSum(firstNum, secondNum);

// }
    
// Second method;
import java.util.Scanner;
public class Functions2{
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Write the first number:");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.println("Write the second number:");
        int b = Sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println(sum);
        Sc.close();
    }

}