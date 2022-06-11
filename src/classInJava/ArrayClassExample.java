package classInJava;

import java.util.Arrays;
import java.util.List;

public class ArrayClassExample {
	
	public static void main(String[] args) {
		
		char ch[] = {'a','w','e','c','b','f','c'};
		
		char ch1[] = ch;
		
		char arr[] = {'b','y','e','j','b','f','c'}; 
		
		System.out.println(ch);
		
		Arrays.sort(ch); //We can sort array in natural order
		
		System.out.println(ch);
		
		List list = Arrays.asList(ch); //Covert in Collection List
		System.out.println("List = "+list); //list show the address of array
		
		System.out.println("Equals = "+Arrays.equals(ch, ch1));
		
		System.out.println("Equals = "+Arrays.equals(ch, arr));
	}

}
