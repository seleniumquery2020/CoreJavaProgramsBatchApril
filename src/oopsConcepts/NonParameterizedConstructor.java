package oopsConcepts;

public class NonParameterizedConstructor {
	
	int a;
	String s;
	
	NonParameterizedConstructor(){ //Non parameterized Constructor
		
		a = 789;
		s = "hi";
		
	}
	
	public static void main(String[] args) {
		
		NonParameterizedConstructor non = new NonParameterizedConstructor();
		
		System.out.println(non.a);
		System.out.println(non.s);
		
	}

}
