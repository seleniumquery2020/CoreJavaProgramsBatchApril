package exceptionHandling;

public class ExceptionMethods {

	
	public static void m1() {
		int arr[] = new int[5];
		try {
		arr[5] = 51;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		 m1();
		
	}
}
