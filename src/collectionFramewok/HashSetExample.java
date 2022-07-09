package collectionFramewok;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	
	public static void main(String[] args) {
		
		 HashSet set = new HashSet();
		 
		 set.add(85);
		 set.add(true);
		 set.add(5.14);
		 set.add('a');
		 set.add(null);
		 
		 System.out.println(set);
		 
		Iterator itr =  set.iterator();
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
			 
		 }
		 
		
	}
}
