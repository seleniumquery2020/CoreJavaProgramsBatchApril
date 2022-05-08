package conditionalStatement;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Object Creation
		System.out.println("Enter the first number ");
		int a = scanner.nextInt(); // Take input from user

		//System.out.println(a % 2 == 0 ? "Number is Even Number" : "Number is Odd Number");
		System.out.println("Statement 1");
		if(a % 2 == 0) {
			//result /Message
			System.out.println("Number is Even Number");
		}
		
		System.out.println("Statement 2");
	}

}

