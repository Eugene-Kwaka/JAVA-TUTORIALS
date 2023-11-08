
interface StringChecker{
    // method that accepts two values and returns a boolean if they are a string or not.
    public abstract boolean check(String a, String b);
}


public class InstanceOfArbitraryObjectMethodReference {
    public static void main(String[] args) {
        // Create a reference var checker referencing the interface StringChecker
        // Reference the endsWith instance method from the String class.
        StringChecker checker = String::endsWith; 

        // the checker variable now runs the check() interface method 
        boolean result = checker.check("Hello Eugene", "ene");
        System.out.println(result); // -> True
    }
}
