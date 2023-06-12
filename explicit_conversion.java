// Type conversion from a larger datatype(double) to a smaller data type(int)
public class explicit_conversion {
    public static void main(String[] args){
        // double(decimal format)
        double num1 = 345.0567;
        // int
        // Since I am changing from a larger datatype to smaller one, I have to state the datatype I am changing to
        int num2 = (int) num1;

        System.out.println("Initial double value = " + num1);
        System.out.println("Double value changed to int = " + num2);
    }
}
