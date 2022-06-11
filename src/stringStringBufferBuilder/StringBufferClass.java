package stringStringBufferBuilder;

public class StringBufferClass {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hi");
		
		s.append("Sam");
		
		System.out.println(s);
		
		s.reverse();
		
		System.out.println("reverse String = "+s);
	}

}
