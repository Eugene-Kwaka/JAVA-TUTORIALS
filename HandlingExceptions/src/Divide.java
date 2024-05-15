
// CODE THAT THROWS THE ARITHMETICEXCEPTION TO CATCH AN ERROR WHEN USER DIVIDES BY 0.

import java.util.Scanner;

public class Divide {
    private static Scanner sc = new Scanner(System.in);

	public static double divide(double x, double y) throws ArithmeticException {
		
		if (y == 0) {
			throw new ArithmeticException("You cannot have a denominator of 0"); // Throw the checked exception
			// DenominatorCannotBeZeroException
		}
		
		double result = x / y;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		// Idea: create an application that takes in
		// 1. a number for the numerator
		// 2. a number for the denominator
		
		System.out.println("Welcome to the calculator app for dividing numbers");
		
		System.out.println("Please enter a numerator: ");
		//double numerator = Double.parseDouble(sc.nextLine());
        double numerator = sc.nextDouble();
		
		System.out.println("Please enter a denominator: ");
		//double denominator = Double.parseDouble(sc.nextLine());
        double denominator = sc.nextDouble();
		
		try {
			System.out.println("The result is: " + divide(numerator, denominator));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally { // finally block will always run whether an exception occurs or not
			System.out.println("This will always run regardless of what happens");
		}
		
		System.out.println("=== PROGRAM ENDED SUCCESSFULLY ===");
		
	}
	

}
