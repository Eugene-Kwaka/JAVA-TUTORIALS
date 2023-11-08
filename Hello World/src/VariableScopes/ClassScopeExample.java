package VariableScopes;

public class ClassScopeExample {
    // class variable that cannot be accessed anywhere else apart from this class
    private Integer amount = 0;
    public void exampleMethod(){
        amount++;
    }
    public Integer anotherExampleMethod() {
        Integer anotherAmount = amount + 4;
        return anotherAmount;
    }

    public static void main(String[] args) {
        ClassScopeExample example = new ClassScopeExample();
        example.exampleMethod();
        Integer result = example.amount + example.anotherExampleMethod();
        System.out.println("The result is: " + result);

    }
}