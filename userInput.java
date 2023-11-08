// Allows multiple input streams 
import java.util.Scanner;

public class userInput {
    public static void main (String[] args){
        // Creating a new Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name? ");
        
        //INPUT 1
        String name = scanner.nextLine();
        System.out.printf("Nice to meet you %s. How old are you? \n", name);

        // INPUT 2
        // scanner.nextInt is for integer inputs
        int age = scanner.nextInt();
        System.out.printf("You are %d years old. Where do you live currently? \n", age);

        // add extra scanner.nextLine() to clean the buffer
        scanner.nextLine();

        //INPUT 3
        String city = scanner.nextLine();
        System.out.printf("I see. %s is a nice city.", city);

        // Scanner needs to be closed
        scanner.close();

    }
}
