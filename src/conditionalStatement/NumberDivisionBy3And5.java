package conditionalStatement;

import java.util.Scanner;

public class NumberDivisionBy3And5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Object Creation
		System.out.println("Enter the number ");
		int a = scanner.nextInt(); // Take input from user

		if(a%3 ==0 && a %5 == 0) {
			System.out.println("We can divide number using 3 and 5");
		}
	}

}
