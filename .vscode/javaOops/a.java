
class Car{
    String name;
    String company;
    String model;
    public void printCarInfo(){    // Declaring Function / Method;
        System.out.println(" This car is so fast");

    }
}

public class a{
    public static void main(String[] args) {
        Car car1 = new Car();  // Declaring Object;
        car1.name = "Chiron";
        car1.company = "Buggati";
        car1.model = "2021";
        car1.printCarInfo();   // calling object
    }
}
