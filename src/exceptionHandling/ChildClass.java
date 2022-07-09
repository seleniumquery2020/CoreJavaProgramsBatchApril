package exceptionHandling;

public class ChildClass {

	//Instance Block
	{
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			
		}
	}
	
	static{
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i+" ");
			
			
		}
	}
	
	public static void main(String[] args) {
	
		ChildClass child = new ChildClass();
	}
	
}
