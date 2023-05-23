public class doWhileLoop {             // using do while loop 
public static void main(String[] args) {    //to write tables from 1 to 10.
        int number = 1;
        do {
            int multiplier = 1;
            do {
                System.out.printf("%d x %d = %d \n", number, multiplier, number * multiplier);
                multiplier++;
            } while (multiplier <= 10);
            System.out.println();
            number++;
        } while (number <= 10);
    }
}
