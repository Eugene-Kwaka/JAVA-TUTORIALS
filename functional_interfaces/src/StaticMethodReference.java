// Functional interface
interface BinaryCalc{
    public abstract int binaryOperation(int value1, int value2);
}

class Calculator{
    // static method belongs to Calculator class only
    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    // instance method
    public int getMax(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }
}

// Class with the main method
public class StaticMethodReference {
    
    //method taking func expression as a parameter
    // This method defines funtional interface's abstract method(lambda expression) 
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

