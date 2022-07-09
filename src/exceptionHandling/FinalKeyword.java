package exceptionHandling;

public final class FinalKeyword {
	
	final static String s = "data";
	
	
	public final void print() {
		System.out.println("Print method");
	}
	public static void main(String[] args) {
		
		
		System.out.println(s);
		FinalKeyword fin = new FinalKeyword();
		
	}
	

}
