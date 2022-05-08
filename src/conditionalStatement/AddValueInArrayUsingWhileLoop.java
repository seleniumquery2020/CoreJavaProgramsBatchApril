package conditionalStatement;

public class AddValueInArrayUsingWhileLoop {

	public static void main(String[] args) {

		char ch[] = new char[5];
		int index = 0;
		int size = ch.length;
		char a = 'a';
		
		//Add values in Array
		do{
			ch[index] = a++;
			index++;
		}
		while( index < size) ;
		
		System.out.println("Index value = "+index);
		//Print value from Array
		index = 0;
		while( index < size) {
			System.out.println(ch[index++]);
		}
		
	}

}
