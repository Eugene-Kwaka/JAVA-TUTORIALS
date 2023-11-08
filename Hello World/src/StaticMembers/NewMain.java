package StaticMembers;

public class NewMain {

    // Printing out the instance members
    public static void main(String[] args) {
        Test2 num1 = new Test2();
        Test2 num2 = new Test2();

        System.out.println("==== Instance Members ====");
        System.out.println(num1.b);
        System.out.println(num2.b);
        System.out.println("==== Static Members ====");
        System.out.println(Test2.a);

    }


}
