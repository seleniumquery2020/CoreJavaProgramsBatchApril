package classInJava;

public class IntegerClassExample {

	public static void main(String[] args) {

		String s = "788"; // Variable

		String s1 = new String("selenium"); // object

		int i = 85; // literal way/Variable
		float f = i;
		System.out.println(f);
		
		Integer in = 85; // Object creation using wrapper class
		float f1 = in.floatValue();
		System.out.println(f1);
		
		int a = Integer.parseInt(s); // String number value convert to int
		System.out.println(a);

	}

}
