package oopsConcepts;

 public class ProtectedClassExample {
	
	  protected  static int a = 852;
	 
	  protected void m1() {
		 
		 System.out.println("Default method");
	 }
	
	public static void main(String[] args) {
		ProtectedClassExample obj = new ProtectedClassExample();
		obj.m1();
		System.out.println(a);
	}

}
