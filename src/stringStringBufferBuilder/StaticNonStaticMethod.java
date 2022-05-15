package stringStringBufferBuilder;

public class StaticNonStaticMethod {

	static String s = "Welcome to Programs world"; // Class-Level / Global/static variable
	char ch = '$'; // Class-Level / Global/non-static variable

	public static void getName(String name) { // static method
		int a = 100; // Method-Level / Local variable
		System.out.println(s);
		System.out.println("Topper name = " + name);
		StaticNonStaticMethod obj = new StaticNonStaticMethod();
		System.out.println(obj.ch);
	}

	public void getNumber() { // non-static / Instance method
		char c = 'Q'; // Method-Level / Local variable
		System.out.println(s);
		System.out.println("7896541230");
		System.out.println(ch);

	}

	public static void main(String[] args) {
		getName("Pragati");
		getName("Supriya");
		StaticNonStaticMethod object = new StaticNonStaticMethod();
		object.getNumber();
		System.out.println(s);
		System.out.println(object.ch);

	}
}
