public class patterns {
        public static void main(String[] args) {
            int n = 20;
            // outer loop to handle number of rows
            for(int i=0; i<n; i++){
                // inner loop to handle number of columns
                for(int j=0; j<n; j++){
                    // condition to print stars
                    if((i==0 && j>0 && j<n-1) ||
                       (i==n-1 && j>0 && j<n-1) ||
                       (i>0 && i<n-1 && j==0) ||
                       (i>0 && i<n-1 && j==n-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // ending line after each row
                System.out.println();
            }
        }
    }
    
