package stringStringBufferBuilder;

//a e i o u
public class FindVowelsInString {

	public static void main(String[] args) {

		String build = new String("seleniumProgramJava");

		char[] ch = build.toLowerCase().toCharArray();

		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				System.out.println(c);
		}

	}

}
