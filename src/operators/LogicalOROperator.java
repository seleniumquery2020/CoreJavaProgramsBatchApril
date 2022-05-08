package operators;

//At least 1 Condition true

public class LogicalOROperator {

	public static void main(String[] args) {
		
		boolean firstCon = 100 > 500; //false
		
		boolean secondCon = 100 > 800; // false
		
		boolean result = firstCon || secondCon;  // ||= or
		
		System.out.println(result);
		
		System.out.println( "One line Condition verification = " + (5 < 10 || 10 > 7)) ;
	}
}
