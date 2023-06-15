// A read only class in JAVA will use the getter methods
public class readOnlyclass {
    private String name = "Eugene";

    //getter method
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        //creating a student instance
        readOnlyclass student = new readOnlyclass();
        System.out.println(student.getName());
    }
}
