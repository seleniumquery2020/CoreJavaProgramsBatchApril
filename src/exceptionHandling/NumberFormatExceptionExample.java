package exceptionHandling;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		
		String s = "program";
		
		int a = Integer.parseInt(s);
//java.lang.NumberFormatException: For input string: "program"
		System.out.println(a);
		
	}

}
