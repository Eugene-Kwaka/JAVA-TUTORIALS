// Constructor Method References

interface GetAnObject{
    // interface has an abstract method that doesn't take any params but returns an object (Constructor)
    public abstract Object get();
}


class Employee{
    // Empty class which the method reference will create a class from
}

public class ConstructorMethodReferences {
    public static void main(String[] args) {
        // Method reference using a constructor keyword new to return an Employee object
        GetAnObject emp = Employee :: new;
        System.out.println(emp);
        // using a lambda expression would be like
        GetAnObject emp2 = () -> new Employee();
        System.out.println(emp2);
    }
}
