import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("/Users/Daniyal Khan/Desktop/JavaReader.txt");
        Scanner SC = new Scanner(f1);
        System.out.println(SC.nextLine());


    }
}
