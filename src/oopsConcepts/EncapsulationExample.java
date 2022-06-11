
package oopsConcepts;

public class EncapsulationExample {
	
	EncapsulationExample(){
		
	}
	private static String s = "java";
	private static float version = 1.18f;
	
	
	public static void printJavaDetails() {
		
		System.out.println(s+" - "+version);
	}

	public static String getS() {
		
		return s;
	}
	
	public void demo() {
		
	}
	public static void main(String[] args) {
		printJavaDetails();
		
		System.out.println(getS());
		
		EncapsulationExample obj = new EncapsulationExample();
		
	}
}
