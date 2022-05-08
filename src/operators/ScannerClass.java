package operators;

import java.util.Scanner;

//Assignment Perform for -,/,*,%

//We cann't read the character using Scanner class
public class ScannerClass {

	public static void main(String[] args) {
		// int a = 856;
		// System.out.println(a);

		Scanner scanner = new Scanner(System.in); // Object Creation
		System.out.println("Enter the first number ");
		int a = scanner.nextInt(); // Take input from user

		System.out.println("Enter the Second number ");
		int b = scanner.nextInt();

		int add = a + b;
		System.out.println("Addition = " + add);
	}

}
