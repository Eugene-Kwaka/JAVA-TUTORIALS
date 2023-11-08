package VariableScopes;

public class MethodLevelScope2 {
    private int a;
    
    // Getter method
    public int getA() {
        return a;
    }
    // Setter method
    public void setA(int a) {
        this.a = a;
    }
    
    public MethodLevelScope2(int a) {
        this.a = a;
    }
    public static void main(String args[])
    {
        MethodLevelScope2 mls2 = new MethodLevelScope2(3);
        System.out.println(mls2);
    }
    
    
}
