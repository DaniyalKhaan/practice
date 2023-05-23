class Pen {
    String type;
    String color;
    public void penInfo (){
        System.out.println(this.color);
    }
}


public class thirTeenMay2023Oops {
    public static void main(String[] args) {
        Pen objPen1 = new Pen();
        objPen1.color = "Black";
        objPen1.type = "Ball pen";
        objPen1.penInfo();


    }

}