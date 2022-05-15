package conditionalStatement;

public class TrianglePattern {
	
public static void main(String[] args) {
        
		for (int i = 0; i <= 4; i++) { // line

			for (int k = 4; k >i ; k--) { //Space/Blank in reverse order
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) { //star print
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
