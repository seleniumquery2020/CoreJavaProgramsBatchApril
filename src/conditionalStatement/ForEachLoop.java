package conditionalStatement;

public class ForEachLoop {

	public static void main(String[] args) {

		char ch[] = { 'a', 'w', 'e', 'c', 'b', 'f', 'c' };

		for (char c : ch) {

			if( c != 'b')
			System.out.println(c);

		}
	}
}
