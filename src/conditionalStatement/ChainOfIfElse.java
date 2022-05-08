package conditionalStatement;

public class ChainOfIfElse {
	
	public static void main(String[] args) {

		int num = 20;

		if (num == 10) {
			System.out.println("Number is Ten");
			System.out.println("Ten is my lucky number");
		} else if (num == 50) {
			System.out.println("Number is fifty");
		} else {
			System.out.println("Number is not Ten and Fifty");
		}
		
		if(num == 20) {
			System.out.println("Number is Twenty");
		}
	}

}
/*if(Condition 1) {
	
}else if(condition 2) {
	
}else if(condition 3) {
	
}*/