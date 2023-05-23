import java.util.ArrayList;    //  Topic ArrayLists.
class ArrayLists {
        public static void main(String[] args) {    
            ArrayList<Integer> numbers = new ArrayList<Integer>();
                        // If we want to print a single value of "numbers" ArrayList
               // we will put the index of the required number inside () brackets
               // in Syso method.
            numbers.add(2);  // index = 0
            numbers.add(4);  // index = 1 
            numbers.add(6);  // index = 2
            numbers.add(8);  // index = 3 
            numbers.add(10);
            // Here I want to print "6" so I will put its Index which is "2" below.
            System.out.println(numbers.get(2));
          
    }
}