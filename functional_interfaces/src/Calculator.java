package functional_interfaces.src;

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
