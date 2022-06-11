package stringStringBufferBuilder;

public class MethodsInString {

	
	public static void main(String[] args) {
		
		String s = new String("S8e3l1en0iu4m7");
		
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		 
		System.out.println("Uppercase = "+s.toUpperCase());
		System.out.println("original String = "+s);
		
		System.out.println("Replace e to @ = "+ s.replace('e', '@'));
		
		System.out.println("Replace total string = "+ s.replace("Selenium", "Program"));
		
	    System.out.println("Replace first e with $ = "+s.replaceFirst("e", "#"));
		
		
		System.out.println("Replace all with regx = "+s.replaceAll("[e i]", "*")); //if u want more than 1 character
		
		System.out.println("remove all numbers = "+s.replaceAll("[0-9]","")); //if u want replace all numbers
		
		
	}
}
