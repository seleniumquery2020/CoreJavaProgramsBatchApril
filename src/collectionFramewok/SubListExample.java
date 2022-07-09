package collectionFramewok;

import java.util.ArrayList;
import java.util.Comparator;

public class SubListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("false");
		list.add("allow");
		list.add("true");
		list.add("java");
		list.add("cpp");
		list.add("dog");
		list.add(3, "program");
		list.add("c");
		list.add("java");
		list.add("c#");

		System.out.println("Original List = " + list);

		//sort method to sort the list/collection
		list.sort( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int i = o1.compareTo(o2); //Ascending order
				//int i = o2.compareTo(o1); //Descending order
				return i;
			}
		} );
		
		Object[] obj = list.toArray(); //Convert collection to Array
		
		for(Object o : obj) {
			System.out.print(o+" , ");
		}
		
		System.out.println("\nUpdated List = " + list);
	}

}
