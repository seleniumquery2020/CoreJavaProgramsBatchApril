package classInJava;

public class AdditionOfDigits {

	public static void main(String[] args) {

		String s = new String("S8e3l1en3iu4m7");
		char ch[] = s.toCharArray();
		int result = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				int c = Character.getNumericValue(ch[i]);
				result = result + c;

			}

		}

		System.out.println("Addition of digits In String = "+result);

	}

}
