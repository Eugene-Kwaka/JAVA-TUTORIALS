package functional_interfaces.src;

// Class with the main method
public class StaticMethodReference {
    
    //method taking func expression as a parameter
    // This method defines functional interface's abstract method(lambda expression)
    public static void printBinaryResult(int a, int b, BinaryCalc func) {
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        // static method multiply() passed as a method reference 
        printBinaryResult(1, 2, Calculator::multiply);

        // instance method passed as a method reference by an object calc
        Calculator calc = new Calculator();
        printBinaryResult(8, 2, calc::getMax);
    }
}

