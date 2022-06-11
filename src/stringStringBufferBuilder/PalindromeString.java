package stringStringBufferBuilder;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
		  String s = " pro gram ";
		  
		  //System.out.println(s.trim()); //we can remove starting and ending blank space
		  
		  String str = "level";
		  String reverse = "";
		  char[] ch = str.toCharArray();
		  
		  for (int i = ch.length-1; i >= 0; i--) {
			  reverse  = reverse + ch[i];
			}
		  
		  System.out.println("Original String = "+str);
		  System.out.println("Reverse String = "+reverse);
		  
		  if(str.equals(reverse)) {
			  System.out.println("String is Palindrome");
		  }else {
			  System.out.println("String is not Palindrome");
		  }
	}
	
	

}
