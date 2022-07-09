package exceptionHandling;

import java.util.Scanner;

public class WhyWeNeedCustomizedException {
	
	public static void exceptionOccur(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = sc.nextInt();
		
		if(age >= 18 ) {
			System.out.println("You are eligible for vote");
		}else {
			System.out.println("You are not eligible for vote");
			throw  new InvalidAgeForVoteException("Your age is less than 18");
		}
		
		System.out.println("Voting Successfully Done");
	}

	public static void main(String[] args) {
		exceptionOccur();
	}
}
