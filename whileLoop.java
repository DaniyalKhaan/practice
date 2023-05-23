public class whileLoop {      //  using nested while loops to print tabler of
    // numbers 1 to 10.
    public static void main(String[] args) {
        int number = 1;
        while ( number <= 10) {
            int multiplier = 1;
            while ( multiplier <= 10) {
                System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
                multiplier++;
              
            }
            System.out.println(" ");
            number++;
    
        }
    }
}

