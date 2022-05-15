package conditionalStatement;

public class PatternBorder {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {

			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("*");
			}
			for (int q = 0; q <= i; q++) {
				System.out.print(" ");
			}
			for (int p = 0; p < 1; p++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
