public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

    @Override
    public String toString(){
        return "The rectangle is " + super.getColor() + " and its area is " + area(); 
    }
}
