public class encapsulation {
    // private data member
    private String name;

    // getter method
    public String getName(){
        return name;
    }

    // setter method
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        encapsulation student = new encapsulation();
        student.setName("Eugene");
        // I use the getter method to display the student name
        System.out.println(student.getName());
    }
}
