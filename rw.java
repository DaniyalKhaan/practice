import java.util.ArrayList;
class rw {
    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<Integer>();
        example.add(1);
        example.add(2);
        example.add(3);
        example.add(4);
        example.add(5);

        // *ing all values in an arraylist by any number:
        // forEach method.
        example.forEach( exam -> {
            System.out.println(exam * 2);
        });
        /* by this method we can multiply all values of arraylist by any neumber here
         * I multiplied allthe values by 2. one thing to know is that the orignal
         * arraylist will remain same ie the values would not change permanintily this
         * code will just print multiplication it will not save/change the values of 
         * the arraylist. In order to change or save or update the multiplication values
         * to the array list see the next method or screenshot.
         */
        System.out.println(example.toString());
    }
}