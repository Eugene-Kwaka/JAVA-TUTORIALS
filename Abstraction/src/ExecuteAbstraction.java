public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle("red", 3);
        System.out.println(myCircle.toString());

        Shape myRectangle = new Rectangle("blue", 10, 5);
        System.out.println(myRectangle.toString());

        Shape tr = new Triangle("yellow", 10, 5);
        System.out.println(tr.toString());

    }
}
