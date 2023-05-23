import java.util.ArrayList;
class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<Integer>();
        example.add(1);
        example.add(2);
        example.add(3);
        example.add(4);
        example.add(5);
        System.out.println("BEFORE: " + example.toString());

        
        example.forEach( exam -> {
            example.set(example.indexOf(exam), exam * 2);
        });
        System.out.println(" AFter:" + example.toString());
        
    }
}