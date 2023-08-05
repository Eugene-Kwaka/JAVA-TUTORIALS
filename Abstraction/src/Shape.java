abstract class Shape{
     String color;

    // Constructor
     public Shape(String color){
        this.color = color;
    }

    // Abstract methods
    public abstract double area();
    public abstract String toString();

    // Concrete method
    public String getColor(){
        return color;
    }
}