package VariableScopes;

public class StaticVariableScope {
    //declaring a private static variable
    private static double piValue;
    //declaring a constant variable
    public static final String piConstant = "PI";

    public static void main(String args[])
    {
        piValue = 3.14159265359;
        System.out.println("The value of " + piConstant + " is: " + piValue);
    }
}
