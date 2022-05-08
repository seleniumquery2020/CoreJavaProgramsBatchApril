package conditionalStatement;

import java.util.Scanner;

public class NestedIfElseStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Object Creation
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {

			System.out.println("number is Even");
			if (number % 3 == 0) {
				System.out.println("we can divide number using 3");
			} else {
				System.out.println("we cannot divide number using 3");
			}
			
		} else {

			System.out.println("number is Odd");
		}
	}
}

/*
 * if(Condition a){
 * 
 * if(condition 1a){
 * 
 * }else{
 * 
 * } }else if(Condition b){
 * 
 * } else { if(){
 * 
 * } }
 */