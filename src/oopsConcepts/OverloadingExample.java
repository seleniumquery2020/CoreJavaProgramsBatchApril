package oopsConcepts;
//static/early-binding /compile-time polymorphism

public class OverloadingExample {

	public void addition() {

		int result = 50 + 51;
		System.out.println("Addition = " + result);
	}

	public static void addition(int a, int b) {

		int result = a + b;
		System.out.println("Addition of " + a + " and " + b + " = " + result);
	}

	public  void addition(float a, int b) {

		float result = a + b;
		System.out.println("Addition of " + a + " and " + b + " = " + result);
		
	}

	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample();
		obj.addition();
		obj.addition(9, 12);
	}
}
