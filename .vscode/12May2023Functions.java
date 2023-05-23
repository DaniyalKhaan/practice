import java.util.Scanner;
class May2023Functions {
    public static void printGivenName (String name){
        System.out.println(name);
        return;
        
    }
    public static void main (String[] args){
        System.out.println("Write the name you want to print.");
        Scanner Sc = new Scanner(System.in);
        String name = Sc.next();

        printGivenName(name);// here we call function;
        Sc.close();

            
        }
}
