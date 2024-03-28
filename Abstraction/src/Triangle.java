package Abstraction.src;

public class Triangle extends Shape {
    double height;
    double base;

    public Triangle(String color, double height, double base){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double area(){
        return 0.5 * height * base;
    }

    @Override
    public String toString(){
        return "The area of the " + super.getColor() + " triangle is " + area(); 
    }
}
