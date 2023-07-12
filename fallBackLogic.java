public class fallBackLogic {
    public static void main(String[] args) {
        int x = 5;

        // Is this a new way to write switch statements without the break statement?
        // I can use a break statement to avoid the fall-through logic
        switch(x) {
            case 6: System.out.println("case 6 ran");
            default: System.out.println("The default case ran.");
            case 7: System.out.println("case 7 ran");
            case 10: System.out.println("case 10 ran");
        }
    }
}
