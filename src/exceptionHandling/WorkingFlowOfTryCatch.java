package exceptionHandling;

public class WorkingFlowOfTryCatch {

	public static void work() {
		int arr[] = null;
		System.out.println("Statement 1");
		try {
			int a = 15 / 0;
			System.out.println(a);
		}catch (ArithmeticException e) {
			System.out.println(15/5);
		}catch (Exception e) {
			System.out.println(15/5);
		}finally {
			System.out.println("Finally Block");
		}
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Statement 3");

		System.out.println("Statement 4");

		System.out.println("Statement 5");

	}

	public static void main(String[] args) {
		work();
	}
}
