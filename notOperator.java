public class notOperator {
    public static void main (String[] args){
        boolean isStudent = false;
        boolean isStaff = true;
        
        // I can negate the whole Logical operator statement
        System.out.println(!(isStudent || isStaff)); // -> false
        // I can negate individual operators
        System.out.println(!isStudent && isStaff); // -> true
    }
}
