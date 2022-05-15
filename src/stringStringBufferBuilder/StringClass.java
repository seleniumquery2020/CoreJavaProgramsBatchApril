package stringStringBufferBuilder;

public class StringClass {

	public static void main(String[] args) {
		// String s = "selenium"; //literal way

		String str = new String("seleniume"); // object creation

		char c = str.charAt(7);
		System.out.println(c);

		System.out.println("Character from 7th index = " + str.charAt(7));
		System.out.println(str.codePointAt(1)); // Character ASCII value

		String str1 = new String("SELenium");

		// int compare = str.compareTo(str1);

		System.out.println("Compare of str and str1 = " + str.compareTo(str1));

		System.out.println("Compare of str and str1 = " + str.compareToIgnoreCase(str1));

		String s = str.concat(" webdriver"); // To attach different strings
		System.out.println(s);

		System.out.println("Contains method = " + str.contains("ele"));

		System.out.println("Equals of str and str1 = " + str.equals(str1));

		System.out.println("Equals IgnoreCase of str and str1 = " + str.equalsIgnoreCase(str1));

		System.out.println("Index of character = " + str.indexOf('e')); // character first occurrence index

		System.out.println("Last Index of character = " + str.lastIndexOf('e')); // character last occurrence index

		System.out.println("Index of character = " + str.indexOf('e') +" "+ str.lastIndexOf('e'));
		
		System.out.println("Index of character after some character = " + str.indexOf('e',2));
		
		System.out.println("Last Index of character after some character = " + str.lastIndexOf('e',7)); 

		
	}
}
