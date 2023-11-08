package VariableScopes;

public class ClassScopeExample2 {
    public static void main(String[] args)
    {
        /*
         x is Class scoped.
         It can be accessed by all the methods, blocks and the constructor inside the class.
         */
        int x=10;
        {
            //y has limited scope to this block only(Block scoped)
            int y=20;
            System.out.println("Sum of x+y = " + (x+y));
        }
        //x is still known as 10
        x=50;
        System.out.println(x);
    }
}
