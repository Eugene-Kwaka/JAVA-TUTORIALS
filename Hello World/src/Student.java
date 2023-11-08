public class Student {
     // This property is common for all Student objects, meaning they are all in the same college.
    static String collegeName = "Kirkwood";
    int rollNo;
    String name;

    // Setter method
    public void setName(String name){
        this.name = name;
    }

    // static counter number to increment the rollNo uniquely for every student object
   static int counter = 0;
    static int setRollNo(){
        counter++;
        return counter;
    }

    // Getter method
    public void getStudentInfo(){
        System.out.printf("%s with Registration Number %d goes to %s college.", name, rollNo, collegeName);
    }

    // Constructor
    public Student(String name){
        this.name = name;
        this.rollNo = setRollNo();
    }

    public static void main(String[] args) {
        Student newStudent = new Student("John");
        //
        newStudent.getStudentInfo();
    }
}

