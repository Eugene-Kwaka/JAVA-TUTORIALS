package VariableScopes;

public class MethodLevelScope {
    // Method
    void show(){
        // x is defined inside a method hence it is method scoped
        int x = 10;
        System.out.println("The value of x is " + x);
    }

    public static void main(String[] args) {
        MethodLevelScope mls = new MethodLevelScope();
        mls.show();
    }
}
