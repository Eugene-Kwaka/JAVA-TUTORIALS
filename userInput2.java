import java.util.Scanner;
// INSTEAD OF ADDING THE EXTRA nextLine() METHOD TO CLEAN UP THE BUFFER,
// I AM PARSING THE nextLine() method TO ACCEPT INT, DOUBLE, SHORT, LONG, BYTE, BOOL
public class userInput2 {
    public static void main (String[] args){
        // Creating a new Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name? ");
        
        //INPUT 1
        String name = scanner.nextLine();
        System.out.printf("Nice to meet you %s. How old are you? \n", name);

        // INPUT 2
        // parsing the nextLine() method to accept integer inputs
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("Wow, %d is an adult. Where do you live currently? \n", age);


        //INPUT 3
        String city = scanner.nextLine();
        System.out.printf("I see. %s is a nice city.", city);

        // Scanner needs to be closed
        scanner.close();

    }
}
