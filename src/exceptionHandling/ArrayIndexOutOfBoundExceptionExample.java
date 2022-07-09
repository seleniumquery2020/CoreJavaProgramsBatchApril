package exceptionHandling;

public class ArrayIndexOutOfBoundExceptionExample {
	
	
	public static void main(String[] args) {
		
		String arr[] = new String[7];
		arr[8] = "demo"; 
//java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
		
	}

}

class StringIndexOutOfBoundExceptionExample{
	
	
	public static void main(String[] args) {
		
		  String s = "supriya";
		  
		  System.out.println(s.charAt(-1)); 
//java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	}
}