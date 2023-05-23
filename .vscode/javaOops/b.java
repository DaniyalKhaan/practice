package javaOops;

class Pen{            // declaring class Pen;
    String color;
    String type;
    public void printColor(){   // declaring method;
        System.out.println(this.color);  
        
     }
}

public class b {
    public static void main(String[] args) {
        Pen pen1 = new Pen();      // declaring object;
        pen1.color = "Blue";
        pen1.type = "Pointer";

        Pen pen2 = new Pen();     // declaring another object;
        pen2.color = "Black";
        pen2.type = "Ball Point";

        pen1.printColor();    //calling method(this) for pen1;
        pen2.printColor();       //calling method(this) for pen2;
    }
}