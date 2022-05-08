package conditionalStatement;

public class SwitchCaseExample {

	public static void main(String[] args) {

		char ch = 'b';
		switch (ch) {
		case 'y':
			System.out.println("Yellow");
			break;
		case 'p':
			System.out.println("Pink");
			break;
		case 'g':
			System.out.println("Green");
			break;
		case 'b':
			System.out.println("Black");
			break;
		default:
			System.out.println("No matching case");
			break;
		}
	}
}

/*
 * switch(choice) { case 'y': break; case 'a': break; case 'q': break; case 'c':
 * break; case 'b': break; default : break; }
 */