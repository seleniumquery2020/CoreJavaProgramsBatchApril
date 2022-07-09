package collectionFramewok;

import java.util.Iterator;
import java.util.LinkedList;
//Insertion order maintain,Duplicate value allowed,null insertion allowed
public class LinkedListExample {

	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("false");
		list.add("allow");
		list.add("true");
		list.add("java");
		list.add("cpp");
		list.add("dog");
		list.add(3, "program");
		list.add("c");
		list.add("java");
		list.add(null);

		System.out.println("Original List = " + list);
		
		list.addFirst("101");
		
		list.addLast("852");
		
		System.out.println("Updated List = " + list);
		
		Iterator<String> itr = list.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(list.getFirst() + " "+list.peek()+ " "+list.peekFirst());
		System.out.println(list.getLast()+ " "+list.peekLast());
		System.out.println("PullFirst method = "+list.pollFirst());
		System.out.println("Pull Last method = "+list.pollLast());
		
	
		System.out.println("Updated List = " + list);
		
		list.remove(); //list.pop();
		
		
	
		System.out.println("Updated List = " + list);
		
		
	}
}
