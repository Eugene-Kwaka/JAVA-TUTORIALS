package StaticMembers;

public class Test2 {
    // static variable
    public static int a = 10;

    // instance variable
    public int b = 20;

    // static method
    public static void m1()
    {
        System.out.println("from m1");
    }

    // instance method
    public void m2()
    {
        System.out.println("from m2");
    }

    public static void main(String[] args)
    {
       System.out.println("We have looked at instance members and static members");
    }
}
