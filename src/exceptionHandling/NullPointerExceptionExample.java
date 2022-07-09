package exceptionHandling;

public class NullPointerExceptionExample {
	
	
	public static void main(String[] args) {
		
		int[] arr = null;
		
		//arr[0]=51; //Cannot store to int array because "arr" is null
		
		String s = null;
		
		System.out.println(s.toLowerCase()); //Cannot invoke "String.toLowerCase()" because "s" is null
		
	}

}
