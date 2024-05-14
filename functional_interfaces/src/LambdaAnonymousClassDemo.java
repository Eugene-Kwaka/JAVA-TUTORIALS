@FunctionalInterface
interface A{
    void show();
}

public class LambdaAnonymousClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous class to implement the interface method
        A obj = new A() {
            public void show(){
                System.out.println("Hi");
            }
        };

        obj.show();

        System.out.println("####################################################################################################");

        // Creating a lambda expression
        A obj2 = () -> System.out.println("Hi in lambda expression");
        obj2.show();
        
       
    }
}
