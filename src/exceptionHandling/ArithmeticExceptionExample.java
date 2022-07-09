package exceptionHandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0); //risky Code
			
		} catch (ArithmeticException e) {

			System.out.println(10 / 2); //Alternate/handling code
		}
	}

	
}
