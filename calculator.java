import java.util.Scanner;

// Creating a calculator
public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // First number
        System.out.println("Enter the first number =");
        double num1 = Double.parseDouble(scanner.nextLine());
        

        // Second number
        System.out.println("Enter the second number =");
        double num2 = Double.parseDouble(scanner.nextLine());
        

        // User enters the operation they want to work with
        System.out.printf("What operation do you want? ");
        String operation = scanner.nextLine();
        
        // Operation conditionals
        if (operation.equals("sum")){
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        }
        else if (operation.equals("subtraction")){
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        }
        else if (operation.equals("multiplication")){
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        }
        else if (operation.equals("division")){
            // Nested if statement
            if(num2 == 0){
                System.out.printf("Cannot divide number by 0")
            }
            System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
        }
        else{
            System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
