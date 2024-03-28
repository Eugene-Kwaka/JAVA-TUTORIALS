package functional_interfaces.src;
// I am using Lambda Functions as parameters in a method

// Functional interface
interface BinaryCalc{
    public abstract int binaryOperation(int value1, int value2);
}


class LambdaAsParams {
    // this method takes two int values and a lambda func as its parameters
    public static void printOperation(int a, int b, BinaryCalc func){
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }
    public static void main(String[] args) {
        // Call the printOperation() method and pass the 3 params
        printOperation(4, 5, (a, b) -> a+b);
        printOperation(5, 6, (a, b) -> a*b);
    }
    
}
