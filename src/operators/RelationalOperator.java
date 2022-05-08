package operators;

public class RelationalOperator {
	
	public static void main(String[] args) {
		
		int  a = 563;
		
		int b = 100;
		//Greater than condition
		boolean result = a > b;
		System.out.println("Greater than condition = "+ result);
		
		//Less than condition
		System.out.println("Less than condition = "+ (a < b) );
		
		//Greater than equal to condition
		System.out.println("Greater than equal to condition = " + (a >= b) );
		
		//Less than equal to condition
		System.out.println("Less than equal to condition = " + (a <= b));
		
		//Equal to Condition
		System.out.println("Equal to condition = " + (a == b));
		
		//Not equal to Condition
		System.out.println("Not equal to condition = " + (a != b));
	}

}
