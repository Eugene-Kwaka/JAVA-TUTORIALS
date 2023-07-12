public class breakStatements {
    public static void main(String[] args){
        for (int i = 0; i<=10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("");
        
        // BREAK STATEMENT AS A FORM OF GOTO
        first:
            for (int x = 0; x <= 5; x++) {
            // Second label
            second:
                for (int j = 0; j <= 5; j++) {
                    if (x == 1 && j == 1) {

                        // Using break statement with label
                        break first;
                    }
                    System.out.println(x + " " + j);
                }
            }
    }
}
