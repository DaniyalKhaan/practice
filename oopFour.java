import java.util.Scanner;

public class oopFour {
    
public static void printGivenName(String givenName){
    System.out.println(givenName);
    return;
}


    public static void main(String[] args) {
        Scanner Sr = new Scanner(System.in);
        System.out.println("Write a name to Print");
        String givenName;
        givenName = Sr.nextLine();
        printGivenName(givenName);

    }
}
