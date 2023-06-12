import java.util.Scanner;

// Creating a calculator
public class calculatorSwitch {
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
        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                // When the case statement is matched and executed,
                // Java will run the break and stop further execution
                break;

            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;

            case "mult":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;

            case "div":
                if(num2 == 0){
                System.out.println("Cannot divide number by 0");
                }
                else{
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}