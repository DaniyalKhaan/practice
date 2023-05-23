import java.util.Scanner;
public class myFirstProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number you want to print table of;");
        int tableOf = input.nextInt();
        System.out.println("The table of " + tableOf + " is; ");
        int i = 0;
        while (  i <= 9) {
            i++;
            System.out.printf("%d X %d = %d\n", tableOf, i, tableOf*i);

             
        }
    }
    
}
