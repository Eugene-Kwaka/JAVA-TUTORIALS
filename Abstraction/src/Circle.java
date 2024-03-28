package Abstraction.src;

public class Circle extends Shape{
    double radius;

    //Constructor
    public Circle(String color, double radius){
        // Calls the parent class Shape's constructor
        super(color);
        this.radius = radius;
    }

    @Override
    // Through method overriding, I'm overriding Shape class double() method
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    // Through method overriding, I'm overriding Object class toString() method
    public String toString(){
        return "Circle color is " + super.getColor() + " and the area of the circle is " + area();

    }
}
