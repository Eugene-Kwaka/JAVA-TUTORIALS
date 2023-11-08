import java.util.List;
import java.util.stream.Collectors;

// Employee class with parameterized constructor
class Employee{
    String name;

    Employee(String name, int i){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee {name=" + name + "}";
    }

    public void showNextId() {
    }

    public void show() {
    }

    
}

/*  The Stream API is used to process collections of objects. 
    A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. 
*/

class UsingStream {
    public static void main(String[] args) {
        // List.of method creates a list of unmodifiable elements 
        List<String> employeeList = List.of("Dexter", "Wolf", "Simba", "Rex");
        //make a list of actual employee objects with their names
        // employed Constructor Method Reference with the new keyword
        List<Employee> employees = employeeList.stream().map(Employee::new).collect(Collectors.toList());
        System.out.println(employees);

        // Use of Stream with method reference by arbitrary objects
        List<String> myStrings = List.of("Hello", "World");
        List<String> strings = myStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strings);

    }
   
    
}
