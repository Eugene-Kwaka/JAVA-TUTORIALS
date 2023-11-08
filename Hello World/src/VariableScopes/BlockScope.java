package VariableScopes;

public class BlockScope {
    public static void main(String args[])
    {
        int x=4;
        {
            //y has limited scope to this block only
            int y=100;
            System.out.println("Sum of x+y = " + (x+y));
            y=10;
            System.out.println(y);
            //gives error, already defined
            //int y=200;
        }

    }
}
