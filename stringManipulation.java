public class stringManipulation {
    public static void main(String[] args){
        // Adding variables to Strings
        String name = "Eugene"; // -> %s 
        int age = 26; // -> %d
        String city = "Iowa City"; // -> %s
        double gpa = 4.0; // -> %f
        char percentage = '%'; // -> %c
        boolean isThisTrue = true; // -> %b
        // System.out.println("My name is " + name + ". I am " + age + " years old, and I live in " + city + ".");

        // To write this more effeciently
        String formattedString = String.format("My name is %s. I am %d years old, and I live in %s. My GPA in Uni was %f. I got a 100%c. Is this correct? %b.", name, age, city, gpa, percentage, isThisTrue);
        System.out.println(formattedString);
    }
}
