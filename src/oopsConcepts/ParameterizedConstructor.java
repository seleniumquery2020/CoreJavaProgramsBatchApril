package oopsConcepts;

public class ParameterizedConstructor {

	
	
	ParameterizedConstructor(boolean b){
		
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
	// if u want execute Parameterized Constructor then pass the parameter else it will call non Parameterized Constructor
		ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(true);
		
	}
}
