package conditionalStatement;

public class PatternOne {

	public static void main(String[] args) {

		for (int j = 0; j < 3; j++) { // line
				int num = 1;
				char ch = 'a';
			if(j%2 == 0) {
				for (int i = 1; i <= 5; i++) { // star

					System.out.print(num++ + " ");
				}
			}
			else {
				
				for (int i = 1; i <= 5; i++) { // star

					System.out.print(ch++ +" ");
				}
			}
			
			
			System.out.print("\n"); //System.out.println();

		}
	}
}
