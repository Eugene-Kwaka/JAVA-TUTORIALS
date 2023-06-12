public class equalString {
    public static void main(String[] args) {
    String name = new String("Alphonse");
    String name2 = new String("Alphonse");
    String name3 = new String("ALPHONSE");
    
    // using the equals() method
    System.out.println(name.equals(name2));

    // Ignoring the Uppercase in name3
    System.out.println("Using equalsIgnoreCase = " + name.equalsIgnoreCase(name3));
 }
}

