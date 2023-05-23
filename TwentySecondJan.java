import java.util.Scanner;
class TwentySecondJan {
    public static void main(String[] args) {
     Scanner a = new Scanner(System.in);
     System.out.println(" Hi what is your name? ");
     String b = a.nextLine();
     System.out.println(" Hello Mr " + b + " what is your age? ");
     int c = a.nextInt();
     System.out.println(" Ok and finally please tell me where you live?");
     a.nextLine();
     String d = a.nextLine();
     System.out.println(d + " what is your CGPA ?");
     double e = Double.parseDouble(a.nextLine());
     System.out.println(e + " can you please tell me your University name? ");
      String f = a.nextLine();
     System.out.println(f);

     a.close();
    }
}