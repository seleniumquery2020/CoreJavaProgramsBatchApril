package oopsConcepts;



public class ParameterizedMethod {
	
	
	public static void addition(int a,int b){ //parameterized method /we passing parameter value from main method
		
		int c = a+b;
		
		System.out.println("Addition of "+a +" and "+b+" = "+c);
	}
	
	public static void main(String[] args) {
		
		addition(10,11);
		
		addition(15,21);
	}

}
