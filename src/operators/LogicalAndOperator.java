package operators;

public class LogicalAndOperator {

	public static void main(String[] args) {
		
		boolean firstCon = 100 < 500; //true
		
		boolean secondCon = 100 > 800; // false
		
		boolean result = firstCon && secondCon;  // && = AND
		
		System.out.println(result);
		
		System.out.println( "One line Condition verification = " + (5 < 10 && 10 > 7)) ;
	}
	
}
/*
                   At least 1 True 	   All Condition should be true
1stCon   2ndCon  	OR					AND
FALSE	 FALSE		FALSE				FALSE
FALSE	 TRUE		TRUE				FALSE
TRUE	 FALSE		TRUE				FALSE
TRUE	 TRUE		TRUE				TRUE
 
*/