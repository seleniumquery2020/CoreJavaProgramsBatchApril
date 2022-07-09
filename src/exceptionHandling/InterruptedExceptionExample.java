package exceptionHandling;



public class InterruptedExceptionExample {

	
	public static void print() throws InterruptedException  {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(5000); //pass time in milisecond 1 sec = 1000
			
		}
		
	}
	
	
	public static void  display() throws InterruptedException  {
	  print();
		
	}
	public static void main(String[] args) throws InterruptedException {


		display();
		
	}
}
