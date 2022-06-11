package classInJava;

public class CharacterClassExample {

	public static void main(String[] args) {

		String s = new String("S8e3l1en0iu4m7");

		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				
				System.out.println(s.charAt(i));
			}
		}

	}
}
